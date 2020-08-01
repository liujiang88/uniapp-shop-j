package com.liu.shop.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liu.shop.mapper.CommodityMapper;
import com.liu.shop.pojo.Commodity;
import com.liu.shop.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityServiceImpl implements CommodityService {
    @Autowired
    CommodityMapper commodityMapper;
    @Override
    public PageInfo<Commodity> getAll(Integer num) {
        PageHelper.startPage(num,10);
        return new PageInfo<>(commodityMapper.getAll());

    }

    @Override
    public Commodity getById(Integer id) {
        return commodityMapper.getById(id);
    }

    @Override
    public int insertCommodity(String commodity) {
        JSONObject info = JSON.parseObject(commodity);

        Commodity commodityInfo = new Commodity(info.getString("name"),
        info.getString("imgpath"),info.getDouble("price"),info.getString("title"));


        return commodityMapper.insertCommodity(commodityInfo);
    }
}
