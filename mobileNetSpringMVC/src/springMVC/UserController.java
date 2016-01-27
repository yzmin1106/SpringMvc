package springMVC;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import bean.User;
/**
 * RequestMapping与目录结构一致
 * @author jonn
 *
 */
@Controller
@RequestMapping("/u")
public class UserController {

	
	@RequestMapping("/register.do")
	public String register(){
		System.out.println("1");
		//  /views/user/register.jsp
		return "user/register";
	}
	
	//@ResponseBody 是指定返回值是值，没有特殊功能
	@RequestMapping(value="/addUser.do",method=RequestMethod.POST)
	public ModelAndView createUser( User user){
		
		System.out.println("2");
		/**
		 * ModeAndView用于绑定jsp中数据的
		 */
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/createSuccess");
		mv.addObject("user", user);
		return mv;
		
	}
}