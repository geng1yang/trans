package com.xcy.mapper;

import com.xcy.pojo.Goods;
import com.xcy.pojo.Truck;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface GoodsMapper {

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
