package com.xcy.service.impl;

import com.xcy.mapper.EmpInfoMapper;
import com.xcy.pojo.EmpInfo;
import com.xcy.service.EmpInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpInfoServiceImpl implements EmpInfoService {
    @Autowired
    EmpInfoMapper empInfoMapper;

    @Override
    public int addEI(EmpInfo empInfo) {
        return empInfoMapper.addEI(empInfo);
    }

    @Override
    public List<EmpInfo> listEI() {
        return empInfoMapper.listEI();
    }

    @Override
    public List<EmpInfo> queryEI(EmpInfo empInfo) {
        return empInfoMapper.queryEI(empInfo);
    }
}
