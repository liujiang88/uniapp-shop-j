package com.liu.shop.contrller;

import com.alibaba.fastjson.JSON;
import com.liu.shop.service.impl.SnatchTreasureServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
public class SnatchTreasureController {
    @Autowired
    SnatchTreasureServiceImp snatchTreasureServiceImp;

    @GetMapping("/snatch/all/{num}")
    public String getAll(@PathVariable("num") Integer num){
      return   JSON.toJSONString(snatchTreasureServiceImp.selectAll(num));
    }
    @GetMapping("/snatch/byId/{id}")
    public String getByID(@PathVariable("id")Integer id){
        return JSON.toJSONString(snatchTreasureServiceImp.selectByPrimaryKey(id));
    }
    @GetMapping("/snatch/imageByID/{id}")
    public String getImageSnatch(@PathVariable("id")Integer id){
        return "";
    }
}
