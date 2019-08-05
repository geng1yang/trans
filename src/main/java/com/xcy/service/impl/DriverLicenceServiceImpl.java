package com.xcy.service.impl;

import com.xcy.mapper.DLMapper;
import com.xcy.pojo.DriverLicence;
import com.xcy.service.DriverLicenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverLicenceServiceImpl implements DriverLicenceService {
    @Autowired
    DLMapper dlMapper;

    @Override
    public int addDL(DriverLicence driverLicence) {
        return dlMapper.addDL(driverLicence);
    }

    @Override
    public List<DriverLicence> listDL() {
        return dlMapper.listDL();
    }

    @Override
    public List<DriverLicence> queryDL(DriverLicence driverLicence) {
        return dlMapper.queryDL(driverLicence);
    }
}
