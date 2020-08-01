package com.liu.shop.mapper;

import com.liu.shop.pojo.Commodity;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.Resource;
import java.util.List;

@Mapper
@Resource
public interface CommodityMapper {
    List<Commodity> getAll();
    Commodity getById(Integer id);
    int insertCommodity(Commodity commodity);
}
