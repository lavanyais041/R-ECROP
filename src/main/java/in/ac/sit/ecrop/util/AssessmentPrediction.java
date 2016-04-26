package in.ac.sit.ecrop.util;

import in.ac.sit.ecrop.model.Assessment;

public class AssessmentPrediction {
	
	public static  float pridict(Assessment assmt)
	{
		float driage_ratio=0.0f;
		float convertion_factor=0.0f;
		float predicted_yield=0.0f;
		float yield=0.0f;
		
		if(assmt.getCrop().equals("ragi"))
		{
           driage_ratio=49.441f;
           convertion_factor=1100.00f;
           yield=convertion_factor*Float.parseFloat(assmt.getArea());
           predicted_yield=((driage_ratio/100)*yield);
		}
		
		if(assmt.getCrop().equals("paddy"))
		{
           driage_ratio=55.339f;
            convertion_factor=3375.00f;
            yield=convertion_factor*Float.parseFloat(assmt.getArea());
            predicted_yield=((driage_ratio/100)*yield);
		}
		
		if(assmt.getCrop().equals("maize"))
		{
           driage_ratio=53.826f;
           convertion_factor=500.00f;
           yield=convertion_factor*Float.parseFloat(assmt.getArea());
           predicted_yield=((driage_ratio/100)*yield);
		}
				
		return predicted_yield;
		
	}

}
