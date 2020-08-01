package com.liu.shop.contrller;

import com.alibaba.fastjson.JSON;
import com.liu.shop.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin("*")
public class CommodityController {
        @Autowired
        CommodityServiceImpl commodityServiceImpl;
        @GetMapping("/commodity/all/{id}")
        public String getAll(@PathVariable("id")Integer id){
       return JSON.toJSONString(commodityServiceImpl.getAll(id));
      }
      @GetMapping("/commodity/ById/{id}")
      public String getById(@PathVariable("id") Integer id){
            return JSON.toJSONString(commodityServiceImpl.getById(id));
      }



}
