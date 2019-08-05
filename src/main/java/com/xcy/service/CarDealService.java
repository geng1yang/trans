package com.xcy.service;

import com.xcy.pojo.CarDeal;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CarDealService {

    int addCarDeal(CarDeal carDeal);

    List<CarDeal> listCarDeal();

    List<CarDeal> queryCarDeal(CarDeal carDeal);
}
