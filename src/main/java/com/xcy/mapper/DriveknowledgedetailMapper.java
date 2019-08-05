package com.xcy.mapper;

import com.xcy.pojo.Driveknowledgedetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DriveknowledgedetailMapper {
    List<Driveknowledgedetail> getdriveknowledgedetailList();
}
