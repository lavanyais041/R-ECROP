package in.ac.sit.ecrop.service;

import in.ac.sit.ecrop.db.AssessmentDAO;
import in.ac.sit.ecrop.model.Assessment;

import java.util.List;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AssessmentService {
	
	 @Autowired
	  AssessmentDAO dao;
	 
	public List<String> getSurvey()
	{
		return dao.getSurvey();
	}
	 
	public List<Integer> getCultivators()
	{
		return dao.getCultivator();
	}
	
	public List<Assessment> viewAssessment()
	{
		return dao.viewAssessment();
	}
	
	public Assessment viewAssessment(int assess_id)
	{
		return dao.viewAssessment(assess_id);
	}
	
	public List<Assessment> searchAssessment(String year)
	{
		return dao.searchAssessment(year);
	}
	
	public boolean createAssessment(Assessment assmt)
	{
		int assessmentId = dao.createAssessment(assmt);
		assmt.setAssess_id(assessmentId);
		if(assmt.getFertilizer() != null)
		{
			dao.insertFertilizer(assmt);
			dao.insertPesticide(assmt);
			dao.insertSeed(assmt);
			dao.insertInsurance(assmt);
		}
		return true;
	}

	public boolean createTestAssessment(Assessment assmt)
	{
		int id = dao.createTestAssessment(assmt);
		assmt.setAssess_id(id);
		return true;
	}
	
	public boolean uploadAssmtFile(Assessment assmt)
	{
		return dao.insertAssmtFile(assmt);
	}
	
}
