package in.ac.sit.ecrop.model;


public class Assessment {
	
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
	
	Pesticide pesticide;
	Fertilizer fertilizer;
	Seed seed;
	Insurance insurance;
	
	
	
	public Assessment( int assess_id,String survey_number,String area, String crop, String start_date, String end_date,
			 float predicted_yield) {
		super();
		this.survey_number = survey_number;
		this.start_date = start_date;
		this.end_date = end_date;
		this.area = area;
		this.crop = crop;
		this.predicted_yield = predicted_yield;
		this.assess_id = assess_id;
	}



	public Assessment() {
		super();
	}
	
	

	public Assessment(int assess_id,byte[] imageRawData) {
		super();
		this.imageRawData = imageRawData;
		this.assess_id = assess_id;
	}



	public Assessment(String survey_number, int year, String area, String crop,
			float predicted_yield) {
		super();
		this.survey_number = survey_number;
		this.year = year;
		this.area = area;
		this.crop = crop;
		this.predicted_yield = predicted_yield;
	}

	public Assessment(String survey_number, int year, String start_date,
			String end_date, String area, String crop, float predicted_yield,
			float actual_yield, int cultivator_id, float longitude,
			float lattitude, byte[] imageRawData) {
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
		this.imageRawData = imageRawData;
	}



	public Assessment(String survey_number, int year, String start_date,
			String end_date, String area, String crop, float predicted_yield,
			float actual_yield, int cultivator_id, float longitude,
			float lattitude) {
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
	}

	public Assessment(String survey_number, int year, String start_date,
			String end_date, String area, String crop, float predicted_yield,
			float actual_yield) {
		super();
		this.survey_number = survey_number;
		this.year = year;
		this.start_date = start_date;
		this.end_date = end_date;
		this.area = area;
		this.crop = crop;
		this.predicted_yield = predicted_yield;
		this.actual_yield = actual_yield;
	}
	
	public Assessment(int assess_id,String survey_number, int cultivator_id,
			String start_date,String area, String crop,String end_date, float predicted_yield,
			float actual_yield) {
		super();
		this.assess_id = assess_id;
		this.survey_number = survey_number;
		this.cultivator_id = cultivator_id;
		this.area = area;
		this.crop = crop;
		this.start_date = start_date;
		this.end_date = end_date;
		this.predicted_yield = predicted_yield;
		this.actual_yield = actual_yield;
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

	public Pesticide getPesticide() {
		return pesticide;
	}

	public void setPesticide(Pesticide pesticide) {
		this.pesticide = pesticide;
	}

	public Fertilizer getFertilizer() {
		return fertilizer;
	}

	public void setFertilizer(Fertilizer fertilizer) {
		this.fertilizer = fertilizer;
	}

	public Seed getSeed() {
		return seed;
	}

	public void setSeed(Seed seed) {
		this.seed = seed;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	public int getAssess_id() {
		return assess_id;
	}

	public void setAssess_id(int assess_id) {
		this.assess_id = assess_id;
	}
	


	public byte[] getImageRawData() {
		return imageRawData;
	}

	public void setImageRawData(byte[] imageRawData) {
		this.imageRawData = imageRawData;
	}

}
