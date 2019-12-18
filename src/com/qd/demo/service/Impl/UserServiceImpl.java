package com.qd.demo.service.Impl;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qd.demo.service.UserService;
import com.qd.demo.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

		@Autowired
		private UserMapper userMapper;
		
		public List<Map> getAnswerQuestionNumUser() {
			// TODO Auto-generated method stub
			return userMapper.getAnswerQuestionNumUser();
		}

		public List<Map> getUserJobLocation() {
			// TODO Auto-generated method stub
			return userMapper.getUserJobLocation();
		}

		public List<Map> getDiePowderUser() {
			// TODO Auto-generated method stub
			return userMapper.getDiePowderUser();
		}
}
