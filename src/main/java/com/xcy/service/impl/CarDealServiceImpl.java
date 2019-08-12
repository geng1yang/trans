package com.xcy.service.impl;

import com.github.pagehelper.PageHelper;
import com.xcy.mapper.CarDealMapper;
import com.xcy.pojo.CarDeal;
import com.xcy.service.CarDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarDealServiceImpl implements CarDealService {
    @Autowired
    CarDealMapper carDealMapper;

    @Override
    public int addCarDeal(CarDeal carDeal) {
        return carDealMapper.addCareDeal(carDeal);
    }

    @Override
    public List<CarDeal> listCarDeal() {
        return carDealMapper.listCarDeal();
    }

    @Override
    public List<CarDeal> queryCarDeal(CarDeal carDeal) {
        return carDealMapper.queryCarDeal(carDeal);
    }


}
