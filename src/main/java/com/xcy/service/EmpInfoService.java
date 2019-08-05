package com.xcy.service;

import com.xcy.pojo.EmpInfo;

import java.util.List;

public interface EmpInfoService {
    int addEI(EmpInfo empInfo);

    List<EmpInfo> listEI();

    List<EmpInfo> queryEI(EmpInfo empInfo);
}
