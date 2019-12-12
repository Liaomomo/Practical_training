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
	
	@RequestMapping("/getusers")
	public ModelAndView getUserList()
	{
		System.out.println("进入后台！");
		ModelAndView mv=new ModelAndView("/main.jsp");
		List<Map> lm=userService.getUserList(null);
		mv.addObject("userlist",lm);
		mv.addObject("object","张三");
		return mv;
	}
	
	@RequestMapping("/getusersparam")     //访问路径   
	@ResponseBody    //返回json格式数据
	public List<Map> getUserListParam(@RequestBody Map parms)
	{
		System.out.println("开始查询数据！"+parms); 	
		List<Map> lm=userService.getUserListParams(parms); 	
		return lm;   //返回数据
	}
	
	//简单动态数据加载
	@RequestMapping("/test")
    public ModelAndView testMVC() {
        System.out.println("进入后台！");
        ModelAndView modelAndView = new ModelAndView("/index.jsp");
        modelAndView.addObject("info", "张三");
        return modelAndView;
    }
	
	//请求图表页面
	@RequestMapping("/echart/getcharts")
	public ModelAndView getEcharts(){
		
		ModelAndView model = new ModelAndView("/chart.jsp");
		return model;
		
	}
	
	//图表数据渲染
	@RequestMapping("/echart/getchartsdata")
	@ResponseBody
	public List getEchartsdata(){
		System.out.println("进入charts");
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
	
	//获取数据库的analyze的user_information数据
	@Autowired
	@RequestMapping("/get_userdata")
	@ResponseBody
	public List<Map> get_userdata(){
		
		List<Map> lm=userService.getUserinfo(null); 

		return lm;
		
		
		
	}
	
	
	
	
	
	
	
}
