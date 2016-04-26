package in.ac.sit.ecrop.controller;

import java.io.IOException;
import java.util.List;

import in.ac.sit.ecrop.form.AssessmentFormBean;
import in.ac.sit.ecrop.model.Assessment;
import in.ac.sit.ecrop.service.AssessmentService;
import in.ac.sit.ecrop.util.AssessmentHelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CreateAssessmentController {
	
	@Autowired
	AssessmentService assmtService;
	
	
	@RequestMapping(value="/createassessment",method=RequestMethod.GET)
	public ModelAndView showForm()
	{
		ModelAndView mv=new ModelAndView("createassessment");
		List<String> survey_numbers=assmtService.getSurvey();
		mv.addObject("survey_numbers", survey_numbers);
		List<Integer> cultivators=assmtService.getCultivators();
		mv.addObject("cultivators", cultivators);
		mv.addObject("command",new AssessmentFormBean());
		return mv;
	}
	
	@RequestMapping(value="/createassessment",method=RequestMethod.POST)
	public String createAssessment(@ModelAttribute("assessmentFormBean")AssessmentFormBean assessmentFormBean,@RequestParam("file") MultipartFile file)
	{
		try {
			assessmentFormBean.setImageRawData(file.getBytes());
			System.out.println(assessmentFormBean);
			Assessment assessment = AssessmentHelper.buildAssessmentFromFormBean(assessmentFormBean);
			assmtService.createAssessment(assessment);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "redirect:viewassessment";
	}
	
	@RequestMapping(value="/createassessmentjson",method=RequestMethod.POST)
	public @ResponseBody Assessment createAssessment( @RequestBody AssessmentFormBean assessmentFormBean)
	{
			Assessment assessment = AssessmentHelper.buildAssessment(assessmentFormBean);
			assmtService.createTestAssessment(assessment);
			//model.addAttribute("message", "success");
		
		    return assessment;
	}

	@RequestMapping(value="/uploadassmtfile",method=RequestMethod.POST)
	public String uploadAssmtFile(@RequestParam("file") MultipartFile file, @RequestParam("assmtid") Integer id)
	{
		System.out.println("Inside POST METHOD of case Controller JSON + Upload File");
		try {
			assmtService.uploadAssmtFile(new Assessment(id,file.getBytes())); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "success";
	}	
	
	@RequestMapping(value="/uploadassmtfilebytes",method=RequestMethod.POST)
	public String uploadAssmtFile(@RequestParam("filedata") byte[] data, @RequestParam("assmtid") Integer id)
	{
		System.out.println("Inside POST METHOD of case Controller JSON + Upload File --->" + id);
		System.out.println(data.length);
		
		//try {
			//assmtService.uploadAssmtFile(new Assessment(id,file.getBytes())); 
		//} catch (IOException e) {
			//e.printStackTrace();
		//}
		return "success";
	}	
	

}
