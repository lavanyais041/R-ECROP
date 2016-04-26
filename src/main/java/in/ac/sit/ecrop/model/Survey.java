package in.ac.sit.ecrop.model;

public class Survey {
	
	private String survey_no;
	private String owner_name;
	private String soil_color;
	private String area;
	private Survey_Boundary survey_boundary;
	private Cultivator cultivator;
	
	public Survey() {
		super();
	}

	public Survey(String survey_no) {
		super();
		this.survey_no = survey_no;
	}

	public Survey(String survey_no, String owner_name, String soil_color,
			String area) {
		super();
		this.survey_no = survey_no;
		this.owner_name = owner_name;
		this.soil_color = soil_color;
		this.area = area;
	}

	public Survey_Boundary getSurvey_boundary() {
		return survey_boundary;
	}

	public void setSurvey_boundary(Survey_Boundary survey_boundary) {
		this.survey_boundary = survey_boundary;
	}

	public String getSurvey_no() {
		return survey_no;
	}

	public void setSurvey_no(String survey_no) {
		this.survey_no = survey_no;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}

	public String getSoil_color() {
		return soil_color;
	}

	public void setSoil_color(String soil_color) {
		this.soil_color = soil_color;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Cultivator getCultivator() {
		return cultivator;
	}

	public void setCultivator(Cultivator cultivator) {
		this.cultivator = cultivator;
	}	
}
