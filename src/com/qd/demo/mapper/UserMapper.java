package com.qd.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;



@Mapper
//mabatis接口   接口在mapper
//持久层接口
public interface UserMapper {

	public List<Map> getUserList(Map map);
	public List<Map> getUserListParams(Map map);
	
	//获取information的数据渲染users.jsp
	public List<Map> getUserinfo(Map map);
	
	//获取fans的数据渲染tables
	public List<Map> getfansinfo(Map map);


}

