package com.xcy.mapper;

import com.xcy.pojo.CarDeal;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface CarDealMapper {
    int addCareDeal(CarDeal carDeal);
    List<CarDeal> listCarDeal();

    List<CarDeal> queryCarDeal(CarDeal carDeal);
}
