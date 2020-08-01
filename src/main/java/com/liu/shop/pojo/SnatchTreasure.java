package com.liu.shop.pojo;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SnatchTreasure {
    private Integer id;

    private String name;

    private String title;

    private String imagePath;

    private Integer joinPerson;

    private Integer balance;

    private Date creatTime;

    private Date updateTime;

    private Integer sndelete;

}