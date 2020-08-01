package com.liu.shop;

import com.liu.shop.mapper.CommodityMapper;
import com.liu.shop.mapper.SnatchTreasureMapper;
import com.liu.shop.pojo.Commodity;
import com.liu.shop.pojo.SnatchTreasure;
import com.liu.shop.pojo.SnatchTreasureImage;
import com.liu.shop.service.CommoditySnatchImageService;
import com.liu.shop.service.impl.SnatchTreasureServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
     @Autowired
	CommodityMapper commodityMapper;
     @Autowired
	 SnatchTreasureMapper snatchTreasureMapper;
     @Autowired
	CommoditySnatchImageService commoditySnatchImageService;
	@Test
	void contextLoads() {
		for (int i = 0; i <50 ; i++) {
			Commodity commodity = new Commodity("名字" + i, "https://gw.alicdn.com/tfs/TB1OIxTcLc3T1VjSZLeXXbZsVXa-183-144.png?getAvatar=1", 100, "商品标签" + i);
			System.out.println(commodityMapper.insertCommodity(commodity));
		}
	}
	@Test
	void snatchDemo()
	{
		SnatchTreasure snatchTreasure = snatchTreasureMapper.selectByPrimaryKey(2);
		System.out.println(snatchTreasure.toString());
}
   @Test
	void img(){
	   SnatchTreasureImage snatchTreasureServiceImp = snatchTreasureMapper.selectImageById(2);
	   System.out.println(snatchTreasureServiceImp);
   }
    @Test
	void ss(){
	   System.out.println(commoditySnatchImageService.getCommodityImageByID(2));
   }

}
