package com.liu.shop.service;

import com.liu.shop.pojo.CommoditySnatchImageList;

import java.util.List;

public interface CommoditySnatchImageService {
    List<CommoditySnatchImageList> getCommodityImageByID(Integer id);
}
