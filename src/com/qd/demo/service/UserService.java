package com.qd.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	
	public List<Map> getUserList(Map map);
	public List<Map> getUserListParams(Map map);
	public List<Map> getUserinfo(Map map);
	
	//获取fans的数据渲染tables
	public List<Map> getfansinfo(Map map);
	
	
	
	//图表的八个接口
	public List<Map> getchart_0_data(Map map);
	public List<Map> getchart_1_data(Map map);
	public List<Map> getchart_2_data(Map map);
	public List<Map> getchart_3_data(Map map);
	public List<Map> getchart_4_data(Map map);
	public List<Map> getchart_5_data(Map map);
	public List<Map> getchart_6_data(Map map);
	public List<Map> getchart_7_data(Map map);


}
