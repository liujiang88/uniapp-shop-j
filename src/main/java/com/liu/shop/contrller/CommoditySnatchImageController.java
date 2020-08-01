package com.liu.shop.contrller;

import com.alibaba.fastjson.JSON;
import com.liu.shop.service.impl.CommoditySnatchImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


public class CommoditySnatchImageController {
    @Autowired
    CommoditySnatchImageServiceImpl commoditySnatchImageService;
    @GetMapping("/commodity/getImage/{id}")
    public String getImageById(@PathVariable("id")Integer id){
        return JSON.toJSONString(commoditySnatchImageService.getCommodityImageByID(id));
    }

}
