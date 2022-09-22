package model;

/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
public class PotatoOrder {

	//general variables
	public String customerName;
	public String potatoStyle;
	public String potatoSize;
	public int quantity;
	public double orderTotal;
	
	//constants for order purposes
	final double LARGE = 5.99;
	final double MEDIUM = 4.99;
	final double SMALL = 3.99;
	final double LOADED_UPCHARGE = .99;
	
	//default constructor
	public PotatoOrder() {
		// TODO Auto-generated constructor stub
	}
	public PotatoOrder(String name, String style, int qty, String size) 
	{
		setCustomerName(name);
		setPotatoStyle(style.toLowerCase());
		setQuantity(qty);
		setSize(size.toLowerCase());
		setOrderTotal(qty);
	}
	public void setSize(String size) {
		this.potatoSize = size;
	}
	public String getSize() {
		return potatoSize;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPotatoStyle() {
		return potatoStyle;
	}
	public void setPotatoStyle(String potatoStyle) {
		this.potatoStyle = potatoStyle;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(int qty) {
		String x = getPotatoStyle();
		double costPerPotato;
		//check the size and price accordingly
		if(getSize().equals("large")) {
			costPerPotato = LARGE;
		}else if(getSize().equals("medium")) {
			costPerPotato = MEDIUM;
		}else {
			costPerPotato = SMALL;
		}
		//now check the style and add upcharge or not
		if(!x.equals("plain")) {
			costPerPotato += LOADED_UPCHARGE;
		}
		//finally calcs and sets the total
		this.orderTotal = costPerPotato * getQuantity();
	}
	
	//print method
	public String toString() {
		return getCustomerName() + " ordered " + getQuantity() + " " + getSize() +
				" " + getPotatoStyle() + " potatoes. Total cost is $" + 
				String.format("%.2f",getOrderTotal() ) ;
	}
	
	

}
