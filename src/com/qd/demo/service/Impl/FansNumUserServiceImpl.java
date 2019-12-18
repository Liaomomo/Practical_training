package com.qd.demo.Service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qd.demo.Service.FansNumUserService;
import com.qd.demo.mapper.FansNumUserMapper;

@Service
public class FansNumUserServiceImpl implements FansNumUserService{
	
	@Autowired
	private FansNumUserMapper fansNumUserMapper;

	public List<Map> getMostFansNumUser() {
		// TODO Auto-generated method stub
		return fansNumUserMapper.getMostFansNumUser();
	}

}
