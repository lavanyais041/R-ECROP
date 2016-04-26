package in.ac.sit.ecrop.util;

import in.ac.sit.ecrop.form.AssessmentFormBean;
import in.ac.sit.ecrop.model.Assessment;
import in.ac.sit.ecrop.model.Fertilizer;
import in.ac.sit.ecrop.model.Insurance;
import in.ac.sit.ecrop.model.Pesticide;
import in.ac.sit.ecrop.model.Seed;

public class AssessmentHelper {
	
	
	public static Assessment buildAssessmentFromFormBean(AssessmentFormBean formbean)
	{
		Assessment assessment = new Assessment(formbean.getSurvey_number(), 
												formbean.getYear(), formbean.getStart_date(), formbean.getEnd_date(), 
												formbean.getArea(), formbean.getCrop(), formbean.getPredicted_yield(),formbean.getActual_yield(),
												formbean.getCultivator_id(), formbean.getLongitude(), formbean.getLattitude(),formbean.getImageRawData());
		
		Fertilizer fertilizer = new Fertilizer(formbean.getFertilizername(),formbean.getFertquantity(),formbean.getFertcost());
		
		Pesticide pesticide = new Pesticide(formbean.getPesticidename(), formbean.getFertquantity(), formbean.getFertcost());
		
		Seed seed = new Seed(formbean.getSeedbreed(), formbean.getSeedsupplier(), formbean.getSeedquantity(), formbean.getSeedcost());
		
		Insurance insurance = new Insurance(formbean.getPolicy_no(),formbean.getPremium_cost(),formbean.getDuration());
		
		assessment.setPesticide(pesticide);
		assessment.setSeed(seed);
		assessment.setFertilizer(fertilizer);
		assessment.setInsurance(insurance);
		return assessment;
		
	}

	//Test Method for building partial assessment object -- NOTE for testing purpose only
	public static Assessment buildAssessment(AssessmentFormBean formbean)
	{
		Assessment assessment = new Assessment(formbean.getSurvey_number(), formbean.getYear(), formbean.getArea(), formbean.getCrop(), formbean.getPredicted_yield());
		return assessment;
	}
	
}
