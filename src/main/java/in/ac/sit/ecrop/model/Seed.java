package in.ac.sit.ecrop.model;

public class Seed {
	
	private String breed;
	private String supplier;
	private float quantity;
    private float cost;
    
	public Seed() {
		super();
	}

	public Seed(String breed, String supplier, float quantity, float cost) {
		super();
		this.breed = breed;
		this.supplier = supplier;
		this.quantity = quantity;
		this.cost = cost;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
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
