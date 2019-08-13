package com.xcy.controller;


import com.xcy.pojo.CarDeal;
import com.xcy.pojo.EmpInfo;
import com.xcy.service.CarDealService;
import com.xcy.service.EmpInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
@RequestMapping("EI")
public class EmploymentInfoController {
    @Autowired
    EmpInfoService empInfoService;

    @RequestMapping(value = "addEI",method = RequestMethod.POST)
    public String addEI(EmpInfo empInfo){

        int i = empInfoService.addEI(empInfo);
        return i ==1? "success":"fail";
    }

    @RequestMapping(value = "listEI",method = RequestMethod.POST)
    public List<EmpInfo> listEI(){
        List<EmpInfo> empInfos = empInfoService.listEI();
        return empInfos;
    }

    @RequestMapping(value = "queryEI",method = RequestMethod.POST)
    public List<EmpInfo> queryEI(EmpInfo empInfo){
        if(empInfo.getEiPost()=="请选择"){
            empInfo.setEiPost("");
            if(empInfo.getEiCompanyAddress()=="请选择"){
                empInfo.setEiCompanyAddress("");
            }
        }
        List<EmpInfo> empInfos = empInfoService.queryEI(empInfo);
        return empInfos;
    }
}
