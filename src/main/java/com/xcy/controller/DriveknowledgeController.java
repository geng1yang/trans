package com.xcy.controller;

import com.xcy.pojo.Driveknowledge;
import com.xcy.pojo.Driveknowledgedetail;
import com.xcy.service.DriveknowledgeService;
import com.xcy.service.DriveknowledgedetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
public class DriveknowledgeController {

    @Autowired
    DriveknowledgeService driveknowledgeService;
    @RequestMapping(value = "/driveknowledgelList",method = RequestMethod.GET)
    public List<Driveknowledge> getdriveknowledgeList(){
        return driveknowledgeService.getdriveknowledgeList();
    }

    @Autowired
    DriveknowledgedetailService driveknowledgedetailService;
    @RequestMapping(value = "/driveknowledgedetailList",method = RequestMethod.GET)
    public List<Driveknowledgedetail> getdriveknowledgedetailList(){
        return driveknowledgedetailService.getdriveknowledgedetailList();
    }
}
