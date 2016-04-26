package in.ac.sit.ecrop.test;

import in.ac.sit.ecrop.form.AssessmentFormBean;
import in.ac.sit.ecrop.model.Assessment;
import in.ac.sit.ecrop.model.User;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

public class TestRestClient {

	private static final String REST_SERVICE_URL="http://localhost:8080/ecrop";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		createAssessment();
		
	}

	private static void createAssessment()
	{
		System.out.println("Creating an assessment");
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<AssessmentFormBean> request = new HttpEntity<AssessmentFormBean>(new AssessmentFormBean("67/2",2016,"10","jola",20f));
		 
		Assessment result = restTemplate.postForObject(REST_SERVICE_URL+"/createassessmentjson.json", request, Assessment.class);
		System.out.println("Successfully created the assessment ====>" +  result.getAssess_id());
	
		uploadAssessmentImg(result.getAssess_id());	
	
	}
	
	private static void uploadAssessmentImg(int assmtId)
	{
		System.out.println("Uploading assmt image");
		
		LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("file", new ClassPathResource("tulips.jpg"));
		map.add("assmtid", new Integer(assmtId));

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<LinkedMultiValueMap<String, Object>>(
		                    map, headers);		
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> msg = restTemplate.exchange(REST_SERVICE_URL+"/uploadassmtfile", HttpMethod.POST, requestEntity,String.class);
		
		System.out.println(msg);
		
		
	}
	
	private static void testLogin()
	{
		System.out.println("Test login");
		RestTemplate restTemplate = new RestTemplate();
		User user = new User("gpo","gpo");
		User result = restTemplate.getForObject(REST_SERVICE_URL+"/validateuser.json?userName=" + user.getUserName() + "&password=" + user.getPassword(),User.class);
		System.out.println(result.getRole());
	}
	
	private void getAssessment()
	{
		System.out.println("Test Get Assessment Controller");
		
		RestTemplate restTemplate = new RestTemplate();
		
		String str = restTemplate.getForObject(REST_SERVICE_URL+"/searchassessmentjson.json?year=2016", String.class);
		
		System.out.println(str);		
	}
	
	
}
