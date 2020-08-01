package com.liu.shop.service;

import com.github.pagehelper.PageInfo;
import com.liu.shop.pojo.Commodity;


public interface CommodityService {
    PageInfo<Commodity> getAll(Integer id);
    Commodity getById(Integer id);
    int insertCommodity(String commodity);
}
