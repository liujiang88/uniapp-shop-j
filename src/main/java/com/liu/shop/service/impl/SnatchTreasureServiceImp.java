package com.liu.shop.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liu.shop.mapper.SnatchTreasureMapper;
import com.liu.shop.pojo.SnatchTreasure;
import com.liu.shop.pojo.SnatchTreasureImage;
import com.liu.shop.service.SnatchTreasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SnatchTreasureServiceImp implements SnatchTreasureService {

    @Autowired
    SnatchTreasureMapper snatchTreasureMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return snatchTreasureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SnatchTreasure record) {
        return 0;
    }

    @Override
    public int insertSelective(SnatchTreasure record) {
        return 0;
    }



    @Override
    public SnatchTreasure selectByPrimaryKey(Integer id) {
        return snatchTreasureMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SnatchTreasure record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SnatchTreasure record) {
        return 0;
    }

    @Override
    public PageInfo<SnatchTreasure> selectAll(Integer unm) {
        PageHelper.startPage(unm, 10);
        return   new PageInfo<>(snatchTreasureMapper.selectAll());

    }
}
