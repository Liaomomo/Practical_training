package com.qd.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
@Service
public interface UserQuestionService {

	List<Map> getUserQuestion();

	List<Map> getUserInterest();

}
