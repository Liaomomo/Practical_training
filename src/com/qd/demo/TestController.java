package com.qd.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.qd.demo.service.UserSeriviceImpl;
import com.qd.demo.service.UserService;



@Controller
public class TestController {

	@Autowired
	UserService userService;
	
	
	
	//����ͼ��ҳ��
	@RequestMapping("/indexs")
	public ModelAndView getindex(){
		
		ModelAndView model = new ModelAndView("/index.jsp");
		return model;
		
	}

	@RequestMapping("/chart")
	public ModelAndView getchart(){
		
		ModelAndView model = new ModelAndView("/chart.jsp");
		return model;
		
	}
	
	@RequestMapping("/table")
	public ModelAndView gettable(){
		
		ModelAndView model = new ModelAndView("/table.jsp");
		return model;
		
	}
	
	
	@RequestMapping("/getusers")
	public ModelAndView getUserList()
	{
		System.out.println("�����̨��");
		ModelAndView mv=new ModelAndView("/main.jsp");
		List<Map> lm=userService.getUserList(null);
		mv.addObject("userlist",lm);
		mv.addObject("object","����");
		return mv;
	}
	
	@RequestMapping("/getusersparam")     //����·��   
	@ResponseBody    //����json��ʽ����
	public List<Map> getUserListParam(@RequestBody Map parms)
	{
		System.out.println("��ʼ��ѯ���ݣ�"+parms); 	
		List<Map> lm=userService.getUserListParams(parms); 	
		return lm;   //��������
	}
	
	//�򵥶�̬���ݼ���
	@RequestMapping("/test")
    public ModelAndView testMVC() {
        System.out.println("�����̨��");
        ModelAndView modelAndView = new ModelAndView("/index.jsp");
        modelAndView.addObject("info", "����");
        return modelAndView;
    }
	
	//����ͼ��ҳ��
	@RequestMapping("/echart/getcharts")
	public ModelAndView getEcharts(){
		
		ModelAndView model = new ModelAndView("/chart.jsp");
		return model;
		
	}
	
	//ͼ��������Ⱦ
	@RequestMapping("/getchartsdata")
	@ResponseBody
	public List getEchartsdata(){
		System.out.println("����charts");
		 HashMap data =new HashMap();
//		 : ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
//		 data: [120, 200, 150, 80, 70, 110, 130],
		 data.put("Mon", "120");
		 data.put("Tue", "200");
		 data.put("Wed", "150");
		 data.put("Thu", "80");
		 data.put("Fri", "70");
		 data.put("Sat", "110");
		 data.put("Sun", "130");
		 List<Map> list = new ArrayList<Map>();
		 list.add(data);
         return list;
	
	}
	//
	@RequestMapping("/get_userinfo")
	public ModelAndView get_users() {
		
		ModelAndView modelAndView = new ModelAndView("/users.jsp");
		return modelAndView;
		
	}
	
	//��ȡ���ݿ��analyze��user_information����
	@Autowired
	@RequestMapping("/get_userdata")
	@ResponseBody
	public List<Map> get_userdata(){
		
		List<Map> lm=userService.getUserinfo(null); 

		return lm;
		
		
		
	}
	
	
	
	
	
	
	
}
