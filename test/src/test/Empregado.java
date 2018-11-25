package test;

public class Empregado {
	private String name;
	private String address;
	private String type;
	private int ID;
	private String paymentMethod;
	private boolean syndicate;
	private double syndicateTax;
	private int syndicateID;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	public int getID() {
		return ID;
	}
	
	public void setSyndicateID(int syndicateID) {
		this.syndicateID = syndicateID;
	}
	public int getSyndicateID() {
		return syndicateID;
	}
	
	
	}
