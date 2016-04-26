package in.ac.sit.ecrop.controller;

import in.ac.sit.ecrop.model.Assessment;
import in.ac.sit.ecrop.service.AssessmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ViewAssessmentController {
	
	@Autowired
	AssessmentService assmtService;
	
	@RequestMapping(value="/viewassessment",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		ModelAndView mv=new ModelAndView("viewassessment");
		List<Assessment> assmtList=assmtService.viewAssessment();
		mv.addObject("assmtList",assmtList);
		return mv;
	}	
	
}
