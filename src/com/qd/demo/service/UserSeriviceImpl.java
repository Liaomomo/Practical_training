package com.qd.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qd.demo.mapper.UserMapper;


@Service
public class UserSeriviceImpl implements UserService {
	
	@Autowired
	
//	@Autowired ��������������
	UserMapper userMapper;
	
	public List<Map> getUserList(Map map) {
		// TODO Auto-generated method stub
		return userMapper.getUserList(map);
	}

	public List<Map> getUserListParams(Map map) {
		// TODO Auto-generated method stub
		return userMapper.getUserListParams(map);
	}
     
	
	//��ȡinformation��������Ⱦusers.jsp
	public List<Map> getUserinfo(Map map) {
		// TODO Auto-generated method stub
		return userMapper.getUserinfo(map);
	}
	//��ȡfans��������Ⱦtables
	public List<Map> getfansinfo(Map map) {
		// TODO Auto-generated method stub
		return userMapper.getfansinfo(map);
	}

	public List<Map> getchart_0_data(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map> getchart_1_data(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map> getchart_2_data(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map> getchart_3_data(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map> getchart_4_data(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map> getchart_5_data(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map> getchart_6_data(Map map) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map> getchart_7_data(Map map) {
		// TODO Auto-generated method stub
		return null;
	}
}
