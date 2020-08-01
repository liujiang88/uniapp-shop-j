package com.liu.shop.service;

import com.github.pagehelper.PageInfo;
import com.liu.shop.pojo.SnatchTreasure;
import com.liu.shop.pojo.SnatchTreasureImage;

import java.util.List;

public interface SnatchTreasureService {
    int deleteByPrimaryKey(Integer id);

    int insert(SnatchTreasure record);

    int insertSelective(SnatchTreasure record);

    SnatchTreasure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SnatchTreasure record);

    int updateByPrimaryKey(SnatchTreasure record);
    PageInfo<SnatchTreasure> selectAll(Integer num);
}
