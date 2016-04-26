package in.ac.sit.ecrop.model;

public class Fertilizer {
	
	private String name;
	private float quantity;
	private float cost;
	
	public Fertilizer() {
		super();
	}

	public Fertilizer(String name, float quantity, float cost) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	

}
