package springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import bean.User;

@Controller
@RequestMapping("/user")
public class UserController {

	
	@RequestMapping("/register")
	public String register(){
		return "userView/register";
	}
	@ResponseBody
	@RequestMapping(value= "/addUser",method=RequestMethod.POST)
	public ModelAndView createUser(User user){
		/**
		 * ModeAndView用于绑定jsp中数据的
		 */
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userView/createSuccess");
		mv.addObject("user", user);
		return mv;
		
	}
}