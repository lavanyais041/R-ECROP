package in.ac.sit.ecrop.controller;

import in.ac.sit.ecrop.model.Survey;
import in.ac.sit.ecrop.service.SurveyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SurveyController {
	
	@Autowired
	SurveyService surveyService;
	
	@RequestMapping(value="/survey",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		System.out.println("Inside GET Method of User Controller");
		return new ModelAndView("survey","command",new Survey());
	}
	
	@RequestMapping(value="/survey",method=RequestMethod.POST)
	public String createUser(@ModelAttribute("survey")Survey s)
	{
		System.out.println("Inside POST METHOD of user Controller");
		System.out.println(s);
		surveyService.createSurvey(s);
		return "cultivator";
	}

}
