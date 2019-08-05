package com.xcy.service.impl;

import com.xcy.mapper.DriveknowledgeMapper;
import com.xcy.pojo.Driveknowledge;
import com.xcy.service.DriveknowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriveknowledgeServiceImpl implements DriveknowledgeService {

    @Autowired
    DriveknowledgeMapper driveknowledgeMapper;
    @Override
    public List<Driveknowledge> getdriveknowledgeList() {
        return driveknowledgeMapper.getdriveknowledgeList();
    }
}
