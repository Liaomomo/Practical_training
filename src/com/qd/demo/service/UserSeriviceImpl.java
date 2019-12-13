package com.qd.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qd.demo.mapper.UserMapper;


@Service
public class UserSeriviceImpl implements UserService {
	
	@Autowired
	
//	@Autowired 配置声明不能少
	UserMapper userMapper;
	
	public List<Map> getUserList(Map map) {
		// TODO Auto-generated method stub
		return userMapper.getUserList(map);
	}

	public List<Map> getUserListParams(Map map) {
		// TODO Auto-generated method stub
		return userMapper.getUserListParams(map);
	}
     
	
	//获取information的数据渲染users.jsp
	public List<Map> getUserinfo(Map map) {
		// TODO Auto-generated method stub
		return userMapper.getUserinfo(map);
	}
	//获取fans的数据渲染tables
	public List<Map> getfansinfo(Map map) {
		// TODO Auto-generated method stub
		return userMapper.getfansinfo(map);
	}
}
