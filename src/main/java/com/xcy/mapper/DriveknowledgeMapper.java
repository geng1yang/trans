package com.xcy.mapper;

import com.xcy.pojo.Driveknowledge;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DriveknowledgeMapper {

    List<Driveknowledge> getdriveknowledgeList();
}
