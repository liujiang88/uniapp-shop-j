package com.liu.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Commodity {
    private Integer id;
    private String name;
    private String imgpath;
    private double price;
    private String title;

    public Commodity(String name, String imgpath, double price, String title) {
        this.name = name;
        this.imgpath = imgpath;
        this.price = price;
        this.title = title;
    }
}
