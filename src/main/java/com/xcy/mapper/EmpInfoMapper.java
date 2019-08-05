package com.xcy.mapper;

import com.xcy.pojo.EmpInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpInfoMapper {
    int addEI(EmpInfo empInfo);

    List<EmpInfo> listEI();

    List<EmpInfo> queryEI(EmpInfo empInfo);
}
