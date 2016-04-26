package in.ac.sit.ecrop.form;

public class AssessmentFormBean {
	
	private String survey_number;
	private int year;
	private String start_date;
	private String end_date;
	private String area;
	private String crop;
	private float predicted_yield;
	private float actual_yield;
	private int cultivator_id;
	private float longitude;
	private float lattitude;
	private byte[] imageRawData;
	
	private int assess_id;
	private String fertilizername;
	private float fertquantity;
	private float fertcost;
	
	private String pesticidename;
	private float pestquantity;
	private float pestcost;
	
	private String seedbreed;
	private String seedsupplier;
	private float seedquantity;
    private float seedcost;
    
	private String policy_no;
	private float premium_cost;
	private String duration;
	
	
	public AssessmentFormBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AssessmentFormBean(String survey_number, int year, String area,
			String crop, float predicted_yield) {
		super();
		this.survey_number = survey_number;
		this.year = year;
		this.area = area;
		this.crop = crop;
		this.predicted_yield = predicted_yield;
	}


	public AssessmentFormBean(String survey_number, int year,
			String start_date, String end_date, String area, String crop,
			float predicted_yield, float actual_yield, int cultivator_id,
			float longitude, float lattitude, String fertilizername,
			float fertquantity, float fertcost, String pesticidename,
			float pestquantity, float pestcost, String seedbreed,
			String seedsupplier, float seedquantity, float seedcost,
			String policy_no, float premium_cost, String duration) {
		super();
		this.survey_number = survey_number;
		this.year = year;
		this.start_date = start_date;
		this.end_date = end_date;
		this.area = area;
		this.crop = crop;
		this.predicted_yield = predicted_yield;
		this.actual_yield = actual_yield;
		this.cultivator_id = cultivator_id;
		this.longitude = longitude;
		this.lattitude = lattitude;
		this.fertilizername = fertilizername;
		this.fertquantity = fertquantity;
		this.fertcost = fertcost;
		this.pesticidename = pesticidename;
		this.pestquantity = pestquantity;
		this.pestcost = pestcost;
		this.seedbreed = seedbreed;
		this.seedsupplier = seedsupplier;
		this.seedquantity = seedquantity;
		this.seedcost = seedcost;
		this.policy_no = policy_no;
		this.premium_cost = premium_cost;
		this.duration = duration;
	}
	public String getSurvey_number() {
		return survey_number;
	}
	public void setSurvey_number(String survey_number) {
		this.survey_number = survey_number;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCrop() {
		return crop;
	}
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public float getPredicted_yield() {
		return predicted_yield;
	}
	public void setPredicted_yield(float predicted_yield) {
		this.predicted_yield = predicted_yield;
	}
	public float getActual_yield() {
		return actual_yield;
	}
	public void setActual_yield(float actual_yield) {
		this.actual_yield = actual_yield;
	}
	public int getCultivator_id() {
		return cultivator_id;
	}
	public void setCultivator_id(int cultivator_id) {
		this.cultivator_id = cultivator_id;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLattitude() {
		return lattitude;
	}
	public void setLattitude(float lattitude) {
		this.lattitude = lattitude;
	}
	public int getAssess_id() {
		return assess_id;
	}
	public void setAssess_id(int assess_id) {
		this.assess_id = assess_id;
	}
	public String getFertilizername() {
		return fertilizername;
	}
	public void setFertilizername(String fertilizername) {
		this.fertilizername = fertilizername;
	}
	public float getFertquantity() {
		return fertquantity;
	}
	public void setFertquantity(float fertquantity) {
		this.fertquantity = fertquantity;
	}
	public float getFertcost() {
		return fertcost;
	}
	public void setFertcost(float fertcost) {
		this.fertcost = fertcost;
	}
	public String getPesticidename() {
		return pesticidename;
	}
	public void setPesticidename(String pesticidename) {
		this.pesticidename = pesticidename;
	}
	public float getPestquantity() {
		return pestquantity;
	}
	public void setPestquantity(float pestquantity) {
		this.pestquantity = pestquantity;
	}
	public float getPestcost() {
		return pestcost;
	}
	public void setPestcost(float pestcost) {
		this.pestcost = pestcost;
	}
	public String getSeedbreed() {
		return seedbreed;
	}
	public void setSeedbreed(String seedbreed) {
		this.seedbreed = seedbreed;
	}
	public String getSeedsupplier() {
		return seedsupplier;
	}
	public void setSeedsupplier(String seedsupplier) {
		this.seedsupplier = seedsupplier;
	}
	public float getSeedquantity() {
		return seedquantity;
	}
	public void setSeedquantity(float seedquantity) {
		this.seedquantity = seedquantity;
	}
	public float getSeedcost() {
		return seedcost;
	}
	public void setSeedcost(float seedcost) {
		this.seedcost = seedcost;
	}
	public String getPolicy_no() {
		return policy_no;
	}
	public void setPolicy_no(String policy_no) {
		this.policy_no = policy_no;
	}
	public float getPremium_cost() {
		return premium_cost;
	}
	public void setPremium_cost(float premium_cost) {
		this.premium_cost = premium_cost;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public byte[] getImageRawData() {
		return imageRawData;
	}
	public void setImageRawData(byte[] imageRawData) {
		this.imageRawData = imageRawData;
	}
}
