package com.liu.shop.service.impl;

import com.liu.shop.mapper.CommoditySnatchImageListMapper;
import com.liu.shop.pojo.CommoditySnatchImageList;
import com.liu.shop.service.CommoditySnatchImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommoditySnatchImageServiceImpl implements CommoditySnatchImageService {
    @Autowired
    CommoditySnatchImageListMapper commoditySnatchImageListMapper;
    @Override
    public List<CommoditySnatchImageList> getCommodityImageByID(Integer id) {
        return commoditySnatchImageListMapper.getCommodityImageByID(id);
    }
}
