package com.xcy.service;

import com.xcy.pojo.Goods;
import com.xcy.pojo.Truck;

import java.util.List;

public interface GoodsService {
    int announceaTruck(Truck truck);

    int announceaGoods(Goods goods);

    List<Truck> selectTruckByContion(Truck truck);

    List<Goods> selectGoodsByContion(Goods goods);

    Goods selectGoodsById(int id);

    Truck selectTruckById(int id);

    void deleteTruckById(int id);

    void deleteGoodsById(int id);

    List<Goods> selectGoodsByMyId(int id);

    List<Goods> selectTruckByMyId(int id);
}
