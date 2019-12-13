package com.qd.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;



@Mapper
//mabatis�ӿ�   �ӿ���mapper
//�־ò�ӿ�
public interface UserMapper {

	public List<Map> getUserList(Map map);
	public List<Map> getUserListParams(Map map);
	
	//��ȡinformation��������Ⱦusers.jsp
	public List<Map> getUserinfo(Map map);
	
	//��ȡfans��������Ⱦtables
	public List<Map> getfansinfo(Map map);


}

