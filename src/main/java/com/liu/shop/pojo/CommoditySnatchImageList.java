package com.liu.shop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommoditySnatchImageList {
    private Integer id;

    private String commodityImage;

    private Integer commodityId;


}