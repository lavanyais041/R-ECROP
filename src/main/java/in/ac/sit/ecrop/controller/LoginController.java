package in.ac.sit.ecrop.controller;
import in.ac.sit.ecrop.model.User;
import in.ac.sit.ecrop.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String findUser(@RequestParam("userName")String userName, @RequestParam("password")String password, ModelMap model)
	{
		String role=userService.findUser(new User(userName, password));
		model.addAttribute("role", role);
		if("VO".equals(role))
		{
			return "votasks";
		}
		else if("GPO".equals(role))
		{
			return "gpotasks";
		}
		
		return "redirect:home";
	}
	
	@RequestMapping(value="/validateuser",method=RequestMethod.GET)
	public @ResponseBody User validateUser(@RequestParam("userName")String userName, @RequestParam("password")String password, ModelMap model)
	{
		System.out.println("USERNAME" + userName );
		User user = new User(userName, password);
		String role=userService.findUser(user);
		//model.addAttribute("role", role);
		user.setRole(role);
		return user;
	}
	
}
