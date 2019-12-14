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
	
	
	//ͼ��İ˸��ӿ�
	public List<Map> getchart_0_data(Map map);
	public List<Map> getchart_1_data(Map map);
	public List<Map> getchart_2_data(Map map);
	public List<Map> getchart_3_data(Map map);
	public List<Map> getchart_4_data(Map map);
	public List<Map> getchart_5_data(Map map);
	public List<Map> getchart_6_data(Map map);
	public List<Map> getchart_7_data(Map map);


}

