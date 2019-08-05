package com.xcy.service;

import com.xcy.pojo.DriverLicence;

import java.util.List;

public interface DriverLicenceService {


    int addDL(DriverLicence driverLicence);

    List<DriverLicence> listDL();

    List<DriverLicence> queryDL(DriverLicence driverLicence);
}
