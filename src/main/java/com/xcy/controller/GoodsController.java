package com.xcy.controller;

import com.xcy.pojo.Goods;
import com.xcy.pojo.Truck;
import com.xcy.service.GoodsService;
import com.xcy.utils.JsonUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@EnableSwagger2
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @ApiOperation("车源信息的发布")
    @RequestMapping(value = "/announceaTruck",method = RequestMethod.POST)
    public void announceaTruck(Truck truck){ //本质就是添加一个车源信息
        goodsService.announceaTruck(truck);
    }
    @ApiOperation("货源信息的发布")
    @RequestMapping(value = "/announceaGoods",method = RequestMethod.POST)
    public void announceaGoods(Goods goods){ //本质就是添加一个货源信息
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = s.format(date);
        goods.setCreateTime(time);
        goodsService.announceaGoods(goods);
    }
    @ApiOperation("通过条件查询车源信息")
    @RequestMapping(value ="/selectTruckByContion",method = RequestMethod.POST)
    public String selectTruckByContion(Truck truck){
        List<Truck> list= goodsService.selectTruckByContion(truck);
        String  s =JsonUtils.objectToJson(list);
        return s;
    }
    @ApiOperation("通过条件查询货源信息")
    @RequestMapping(value ="/selectGoodsByContion",method = RequestMethod.POST)
    public String selectGoodsByContion(Goods goods){
        List<Goods> list= goodsService.selectGoodsByContion(goods);
        String  s =JsonUtils.objectToJson(list);
        return s;
    }
    @ApiOperation("通过id查找货源信息")
    @RequestMapping(value ="/selectGoodsById",method = RequestMethod.POST)
    public Goods selectGoodsById(int id){
        Goods goods = goodsService.selectGoodsById(id);
        return goods;
    }
    @ApiOperation("通过id查找车源信息")
    @RequestMapping(value ="/selectTruckById",method = RequestMethod.POST)
    public Truck selectTruckById(int id){
        Truck truck = goodsService.selectTruckById(id);
        return truck;
    }
    @ApiOperation("通过id删除指定车源信息")
    @RequestMapping(value ="/deleteTruckById",method = RequestMethod.POST)
    public void deleteTruckById(int id){
        goodsService.deleteTruckById(id);
    }
    @ApiOperation("通过id删除指定货源信息")
    @RequestMapping(value ="/deleteGoodsById",method = RequestMethod.POST)
    public void deleteGoodsById(int id){
        goodsService.deleteGoodsById(id);
    }
    @ApiOperation("通过自己的userid查找自己的货源信息")
    @RequestMapping(value ="/selectGoodsByMyId",method = RequestMethod.POST)
    public String selectGoodsByMyId(int id){
        List<Goods> list = goodsService.selectGoodsByMyId(id);
        String  s =JsonUtils.objectToJson(list);
        return s;
    }
    @ApiOperation("通过自己的userid查找自己的车源信息")
    @RequestMapping(value ="/selectTruckByMyId",method = RequestMethod.POST)
    public String selectTruckByMyId(int id){
        List<Goods> list = goodsService.selectTruckByMyId(id);
        String  s =JsonUtils.objectToJson(list);
        return s;
    }
}