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
	

	
	//锟斤拷锟斤拷图锟斤拷页锟斤拷
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
	
	@RequestMapping("/chart_1")
	public ModelAndView getchart_1(){
		
		ModelAndView model = new ModelAndView("/chart_1.jsp");
		return model;
		
	}
	
	@RequestMapping("/chart_2")
	public ModelAndView getchart_2(){
		
		ModelAndView model = new ModelAndView("/chart_2.jsp");
		return model;
		
	}
	
	@RequestMapping("/chart_3")
	public ModelAndView getchart_3(){
		
		ModelAndView model = new ModelAndView("/chart_3.jsp");
		return model;
		
	}
	
	@RequestMapping("/chart_4")
	public ModelAndView getchart_4(){
		
		ModelAndView model = new ModelAndView("/chart_4.jsp");
		return model;
		
	}
	
	@RequestMapping("/chart_5")
	public ModelAndView getchart_5(){
		
		ModelAndView model = new ModelAndView("/chart_5.jsp");
		return model;
		
	}
	
	@RequestMapping("/chart_6")
	public ModelAndView getchart_6(){
		
		ModelAndView model = new ModelAndView("/chart_6.jsp");
		return model;
		
	}
	
	@RequestMapping("/chart_7")
	public ModelAndView getchart_7(){
		
		ModelAndView model = new ModelAndView("/chart_7.jsp");
		return model;
	}
		

	
	
	@RequestMapping("/getusers")
	public ModelAndView getUserList()
	{
		System.out.println("锟斤拷锟斤拷锟教拷锟�");
		ModelAndView mv=new ModelAndView("/main.jsp");
		List<Map> lm=userService.getUserList(null);
		mv.addObject("userlist",lm);
		mv.addObject("object","锟斤拷锟斤拷");
		return mv;
	}
	
	@RequestMapping("/getusersparam")     //锟斤拷锟斤拷路锟斤拷   
	@ResponseBody    //锟斤拷锟斤拷json锟斤拷式锟斤拷锟斤拷
	public List<Map> getUserListParam(@RequestBody Map parms)
	{
		System.out.println("锟斤拷始锟斤拷询锟斤拷锟捷ｏ拷"+parms); 	
		List<Map> lm=userService.getUserListParams(parms); 	
		return lm;   //锟斤拷锟斤拷锟斤拷锟斤拷
	}
	
	//锟津单讹拷态锟斤拷锟捷硷拷锟斤拷
	@RequestMapping("/test")
    public ModelAndView testMVC() {
        System.out.println("锟斤拷锟斤拷锟教拷锟�");
        ModelAndView modelAndView = new ModelAndView("/index.jsp");
        modelAndView.addObject("info", "锟斤拷锟斤拷");
        return modelAndView;
    }
	
	//锟斤拷锟斤拷图锟斤拷页锟斤拷
	@RequestMapping("/echart/getcharts")
	public ModelAndView getEcharts(){
		
		ModelAndView model = new ModelAndView("/chart.jsp");
		return model;
		
	}
	
	//图锟斤拷锟斤拷锟斤拷锟斤拷染
	@RequestMapping("/getchartsdata")
	@ResponseBody
	public List getEchartsdata(){
		System.out.println("锟斤拷锟斤拷charts");
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
	
	//锟斤拷取锟斤拷锟捷匡拷锟絘nalyze锟斤拷user_information锟斤拷锟斤拷
	@Autowired
	@RequestMapping("/get_userdata")
	@ResponseBody
	public List<Map> get_userdata(){
		
		List<Map> lm=userService.getUserinfo(null); 

		return lm;
		
		
	}
	@RequestMapping("/get_fandata")
	@ResponseBody
	public List<Map> get_fandata(){
		
		List<Map> lm=userService.getfansinfo(null); 

		return lm;
		
		
	}
	
	
	
	
	
	
	
}
