package com.xcy.mapper;

import com.xcy.pojo.DriverLicence;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DLMapper {
    int addDL(DriverLicence driverLicence);

    List<DriverLicence> listDL();

    List<DriverLicence> queryDL(DriverLicence driverLicence);
}
