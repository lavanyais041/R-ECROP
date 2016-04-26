package in.ac.sit.ecrop.controller;

import in.ac.sit.ecrop.model.Assessment;
import in.ac.sit.ecrop.service.AssessmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SearchAssessmentController {
	
	@Autowired
	AssessmentService assessmentService;
	
	@RequestMapping(value="/searchassessment", method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		return new ModelAndView("searchassessment","command",new Assessment());
	}
	
	@RequestMapping(value="/searchassessment",method=RequestMethod.POST)
	public ModelAndView searchAssessment(@RequestParam("year")String year)
	{
		ModelAndView mv=new ModelAndView("searchassessment");
		List<Assessment> assmtList=assessmentService.searchAssessment(year);
		mv.addObject("assmtList", assmtList);
		return mv;
	}
	
	@RequestMapping(value="/searchassessmentjson",method=RequestMethod.GET)
	public String searchAssessmentjson(@RequestParam("year")String year, ModelMap model)
	{
		//ModelAndView mv=new ModelAndView("searchassessment");
		List<Assessment> assmtList=assessmentService.searchAssessment(year);
		model.addAttribute("assmtList", assmtList);
		return "success";
	}	
	
}
