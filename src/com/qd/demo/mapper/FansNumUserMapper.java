package com.qd.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface FansNumUserMapper {

	
	List<Map> getMostFansNumUser();
	
}
