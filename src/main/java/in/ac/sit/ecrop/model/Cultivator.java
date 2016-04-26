package in.ac.sit.ecrop.model;

public class Cultivator {
	
	private String fname;
	private String lname;
	private String adhar_No;
	private String phone_no;
	
	public Cultivator() {
		super();
	}
	
	public Cultivator(String fname, String lname, String adhar_No, String phone_no) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.adhar_No = adhar_No;
		this.phone_no = phone_no;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAdhar_No() {
		return adhar_No;
	}
	public void setAdhar_No(String adhar_No) {
		this.adhar_No = adhar_No;
	}
	public String getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

}
