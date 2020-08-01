package com.liu.shop.mapper;

import com.liu.shop.pojo.CommoditySnatchImageList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CommoditySnatchImageListMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommoditySnatchImageList record);

    int insertSelective(CommoditySnatchImageList record);

    CommoditySnatchImageList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommoditySnatchImageList record);

    int updateByPrimaryKey(CommoditySnatchImageList record);

    List<CommoditySnatchImageList> getCommodityImageByID(Integer id);
}