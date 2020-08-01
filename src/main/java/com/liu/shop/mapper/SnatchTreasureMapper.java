package com.liu.shop.mapper;

import com.liu.shop.pojo.SnatchTreasure;
import com.liu.shop.pojo.SnatchTreasureImage;
import com.liu.shop.service.impl.SnatchTreasureServiceImp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface SnatchTreasureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SnatchTreasure record);

    int insertSelective(SnatchTreasure record);
    SnatchTreasureImage selectImageById(Integer id);
    SnatchTreasure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SnatchTreasure record);

    int updateByPrimaryKey(SnatchTreasure record);

    List<SnatchTreasure> selectAll();
}