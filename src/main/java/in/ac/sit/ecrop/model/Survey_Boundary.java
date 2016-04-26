package in.ac.sit.ecrop.model;

public class Survey_Boundary {

	private int point;
	private float longitude;
	private float latitude;
	
	public Survey_Boundary(int point, float longitude,
			float latitude) {
		super();
		this.point = point;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

}
