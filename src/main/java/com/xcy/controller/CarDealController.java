package com.xcy.controller;


import com.xcy.pojo.CarDeal;
import com.xcy.service.CarDealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@EnableSwagger2
@RequestMapping("carDeal")
public class CarDealController {
    @Value("${IMAGE_DIR}")
    String imageDir;
    @Value("${IMAGE_URL}")
    String imageUrl;
    @Autowired
    CarDealService carDealService;

    @RequestMapping(value = "addCarDeal",method = RequestMethod.POST)
    public String addCarDeal(CarDeal carDeal, MultipartFile fileUpload) throws IOException {
        String fileName = fileUpload.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        String newName = UUID.randomUUID().toString().replace("-","")+suffixName;

        Date date =new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dirName = dateFormat.format(date);
        String targetName = imageDir+dirName;
        File file = new File(targetName);
        if(!file.exists()){
            file.mkdirs();
        }
        fileUpload.transferTo(new File(targetName,newName));

        carDeal.setCdImg(imageUrl+dirName+"/"+newName);

        int i = carDealService.addCarDeal(carDeal);
        return i ==1? "success":"fail";
    }

    @RequestMapping(value = "listCarDeal",method = RequestMethod.POST)
    public List<CarDeal> listCarDeal(){
        List<CarDeal> carDeals = carDealService.listCarDeal();
        return carDeals;
    }

    @RequestMapping(value = "queryCarDeal",method = RequestMethod.POST)
    public List<CarDeal> queryCarDeal(String cdMM,String cdCarType,String cdCity){
        CarDeal carDeal = new CarDeal();
        if(cdMM != null && cdMM !=""){
            carDeal.setCdMM(cdMM);
        }
        if(cdCarType != null && cdCarType !=""){
            carDeal.setCdCarType(cdCarType);
        }
        if(cdCity != null && cdCity !=""){
            carDeal.setCdCity(cdCity);
        }

        List<CarDeal> carDeals = carDealService.queryCarDeal(carDeal);
        return carDeals;
    }
}
