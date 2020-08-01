package com.liu.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SnatchTreasureImage {
    private Integer id;

    private String name;

    private String title;

    private Integer joinPerson;

    private Integer balance;


    private List<CommoditySnatchImageList> imageLists;
}
