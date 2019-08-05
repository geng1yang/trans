package com.xcy.controller;


import com.xcy.pojo.DriverLicence;
import com.xcy.service.DriverLicenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
@RequestMapping("driverLicence")
public class DriverLicenceController {
    @Autowired
    DriverLicenceService driverLicenceService;

    @RequestMapping(value = "addDL",method = RequestMethod.POST)
    public String addDL(DriverLicence driverLicence){
        int i = driverLicenceService.addDL(driverLicence);
        return i ==1? "success":"fail";
    }

    @RequestMapping(value = "listDL",method = RequestMethod.POST)
    public List<DriverLicence> listCarDeal(){
        List<DriverLicence> carDeals = driverLicenceService.listDL();

        return carDeals;
    }

    @RequestMapping(value = "queryDL",method = RequestMethod.POST)
    public List<DriverLicence> queryDL(DriverLicence driverLicence){
        System.out.println(driverLicence);

        List<DriverLicence> driverLicenceList = driverLicenceService.queryDL(driverLicence);
        return driverLicenceList;
    }
}
