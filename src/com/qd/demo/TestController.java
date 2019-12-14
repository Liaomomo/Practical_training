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
	
	
	
	//知乎粉丝最多的100位大V index.jsp        one
	@RequestMapping("/chart_0")
	public ModelAndView getindex(){
		
		ModelAndView model = new ModelAndView("/chart_0.jsp");
		return model;
		
	}
	//知乎粉丝最多的100位大V数据                         one_data
	@RequestMapping("/chart_0_data")
	@ResponseBody
	public List<Map > chart_0_data(){
	
		return null;
	}
	
	

	//知乎回答问题最多的100位用户 
	@RequestMapping("/chart_1")
	public ModelAndView getchart_1(){
		
		ModelAndView model = new ModelAndView("/chart_1.jsp");
		return model;
		
	}
	//知乎回答问题最多的100位用户数据
	@RequestMapping("/chart_1_data")
	@ResponseBody
	public List<Map > chart_1_data(){
		
			return null;
		}
		
		
		
	
	//知乎用户就业方向
	@RequestMapping("/chart_2")
	public ModelAndView getchart_2(){
		
		ModelAndView model = new ModelAndView("/chart_2.jsp");
		return model;
		
	}
	//知乎用户就业方向 数据
	@RequestMapping("/chart_2_data")
	@ResponseBody
	public List<Map > chart_2_data(){
		
		return null;
	}
	
	
	
	
	//知乎问题导向功能
	@RequestMapping("/chart_3")
	public ModelAndView getchart_3(){
		
		ModelAndView model = new ModelAndView("/chart_3.jsp");
		return model;
		
	}
	
	//知乎问题导向功能 数据
	@RequestMapping("/chart_3_data")
	@ResponseBody
	public List<Map > chart_3_data(){
			
			return null;
	}
	
	
	
	//知乎僵尸粉统计功能
	@RequestMapping("/chart_4")
	public ModelAndView getchart_4(){
		
		ModelAndView model = new ModelAndView("/chart_4.jsp");
		return model;
		
	}
	//知乎僵尸粉统计功能 数据
	@RequestMapping("/chart_4_data")
	@ResponseBody
	public List<Map > chart_4_data(){
				
			return null;
	}
	
	
	//知乎的高校用户
	@RequestMapping("/chart_5")
	public ModelAndView getchart_5(){
		
		ModelAndView model = new ModelAndView("/chart_5.jsp");
		return model;
		
	}
	//知乎的高校用户 数据
	@RequestMapping("/chart_5_data")
	@ResponseBody
	public List<Map > chart_5_data(){
					
				return null;
	}
	
	
	
	//用户兴趣画像功能
	@RequestMapping("/chart_6")
	public ModelAndView getchart_6(){
		
		ModelAndView model = new ModelAndView("/chart_6.jsp");
		return model;
		
	}
	//知乎的高校用户 数据
	@RequestMapping("/chart_6_data")
	@ResponseBody
	public List<Map > chart_6_data(){
						
		return null;
	}
	
	
	
	//pageRank用户排行
	@RequestMapping("/chart_7")
	public ModelAndView getchart_7(){
		
		ModelAndView model = new ModelAndView("/chart_7.jsp");
		return model;
	}
	
	//pageRank用户排行 数据
	@RequestMapping("/chart_7_data")
	@ResponseBody
	public List<Map > chart_7_data(){
						
		return null;
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
