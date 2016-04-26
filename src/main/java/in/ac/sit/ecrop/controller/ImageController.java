package in.ac.sit.ecrop.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import in.ac.sit.ecrop.service.AssessmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ImageController {
	
	@Autowired
	AssessmentService assessmentService;
	
	@RequestMapping(value="/imagedisplay",method=RequestMethod.GET)
	public void showImage(@RequestParam("assess_id") Integer assess_id, HttpServletResponse response)
	{
		response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
		try
		{
			response.getOutputStream().write(assessmentService.viewAssessment(assess_id).getImageRawData());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
