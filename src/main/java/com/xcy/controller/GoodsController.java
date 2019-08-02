package com.xcy.controller;

import com.xcy.pojo.Goods;
import com.xcy.pojo.Truck;
import com.xcy.service.GoodsService;
import com.xcy.utils.JsonUtils;
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
    @RequestMapping(value = "/announceaTruck",method = RequestMethod.POST)
    public void announceaTruck(Truck truck){ //本质就是添加一个车源信息
        goodsService.announceaTruck(truck);
    }
    @RequestMapping(value = "/announceaGoods",method = RequestMethod.POST)
    public void announceaGoods(Goods goods){ //本质就是添加一个货源信息
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = s.format(date);
        goods.setCreateTime(time);
        goodsService.announceaGoods(goods);
    }
    @RequestMapping(value ="/selectTruckByContion",method = RequestMethod.POST)
    public String selectTruckByContion(Truck truck){
        List<Truck> list= goodsService.selectTruckByContion(truck);
        String  s =JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping(value ="/selectGoodsByContion",method = RequestMethod.POST)
    public String selectGoodsByContion(Goods goods){
        List<Goods> list= goodsService.selectGoodsByContion(goods);
        String  s =JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping(value ="/selectGoodsById",method = RequestMethod.POST)
    public Goods selectGoodsById(int id){
        Goods goods = goodsService.selectGoodsById(id);
        return goods;
    }
    @RequestMapping(value ="/selectTruckById",method = RequestMethod.POST)
    public Truck selectTruckById(int id){
        Truck truck = goodsService.selectTruckById(id);
        return truck;
    }
    @RequestMapping(value ="/deleteTruckById",method = RequestMethod.POST)
    public void deleteTruckById(int id){
        goodsService.deleteTruckById(id);
    }
    @RequestMapping(value ="/deleteGoodsById",method = RequestMethod.POST)
    public void deleteGoodsById(int id){
        goodsService.deleteGoodsById(id);
    }
    @RequestMapping(value ="/selectGoodsByMyId",method = RequestMethod.POST)
    public String selectGoodsByMyId(int id){
        List<Goods> list = goodsService.selectGoodsByMyId(id);
        String  s =JsonUtils.objectToJson(list);
        return s;
    }
    @RequestMapping(value ="/selectTruckByMyId",method = RequestMethod.POST)
    public String selectTruckByMyId(int id){
        List<Goods> list = goodsService.selectTruckByMyId(id);
        String  s =JsonUtils.objectToJson(list);
        return s;
    }
}
