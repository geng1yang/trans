package com.xcy.service.impl;

import com.xcy.mapper.GoodsMapper;
import com.xcy.pojo.Goods;
import com.xcy.pojo.Truck;
import com.xcy.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsSeriveImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public int announceaTruck(Truck truck) {
        return goodsMapper.announceaTruck(truck);
    }

    @Override
    public int announceaGoods(Goods goods) {
        return goodsMapper.announceaGoods(goods);
    }

    @Override
    public List<Truck> selectTruckByContion(Truck truck) {
        return goodsMapper.selectTruckByContion(truck);
    }

    @Override
    public List<Goods> selectGoodsByContion(Goods goods) {
        return goodsMapper.selectGoodsByContion(goods);
    }

    @Override
    public Goods selectGoodsById(int id) {
        return goodsMapper.selectGoodsById(id);
    }

    @Override
    public Truck selectTruckById(int id) {
        return goodsMapper.selectTruckById(id);
    }

    @Override
    public void deleteTruckById(int id) {
        goodsMapper.deleteTruckById(id);
    }

    @Override
    public void deleteGoodsById(int id) {
        goodsMapper.deleteGoodsById(id);
    }

    @Override
    public List<Goods> selectGoodsByMyId(int id) {
        return goodsMapper.selectGoodsByMyId(id);
    }

    @Override
    public List<Goods> selectTruckByMyId(int id) {
        return goodsMapper.selectTruckByMyId(id);
    }
}
