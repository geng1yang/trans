package com.xcy.service.impl;

import com.xcy.mapper.DriveknowledgedetailMapper;
import com.xcy.pojo.Driveknowledgedetail;
import com.xcy.service.DriveknowledgedetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriveknowledgedetailServiceImpl implements DriveknowledgedetailService {

    @Autowired
    DriveknowledgedetailMapper driveknowledgedetailMapper;
    @Override
    public List<Driveknowledgedetail> getdriveknowledgedetailList() {
        return driveknowledgedetailMapper.getdriveknowledgedetailList();
    }
}
