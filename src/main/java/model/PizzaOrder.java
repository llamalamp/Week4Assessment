package model;

/**
 * @author kenne-krcutkomp
 * CIS175 - Fall 2022
 */
public class PizzaOrder {

	//general variables
	public String customerName;
	public String pizzaTopping;
	public String pizzaSize;
	public int quantity;
	public double orderTotal;
	
	//constants for order total
	final double LARGE = 13.99;
	final double MEDIUM = 12.99;
	final double SMALL = 10.99;
	final double ONE_TOPPING_UPCHARE = 1;
	final double SUPREME_UPCHARGE = 3;
	
	public PizzaOrder() {
		// TODO Auto-generated constructor stub
	}
	public PizzaOrder(String name, String topping, String size, int qty) {
		setCustomerName(name);
		setPizzaTopping(topping);
		setPizzaSize(size);
		setQuantity(qty);
		setOrderTotal();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPizzaTopping() {
		return pizzaTopping;
	}
	public void setPizzaTopping(String pizzaTopping) {
		this.pizzaTopping = pizzaTopping;
	}
	public String getPizzaSize() {
		return pizzaSize;
	}
	public void setPizzaSize(String pizzaSize) {
		this.pizzaSize = pizzaSize;
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
	public void setOrderTotal() {
		double runningTotal = 0;
		if(getPizzaSize().equals("small")) {
			runningTotal += SMALL;
		}else if(getPizzaSize().equals("medium")) {
			runningTotal += MEDIUM;
		}else {
			runningTotal += LARGE;
		}
		
		if(getPizzaTopping().equals("pepperoni") || getPizzaTopping().equals("sausage") || getPizzaTopping().equals("veggie")) {
			runningTotal += ONE_TOPPING_UPCHARE;
		}else if(getPizzaTopping().equals("supreme")) {
			runningTotal += SUPREME_UPCHARGE;
		}
		
		this.orderTotal = runningTotal * getQuantity();
	}
	
	public String toString() {
		return getCustomerName() + " ordered " + getQuantity() + " " + getPizzaTopping() + " " +
				getPizzaSize() + " pizzas at a total of $" + String.format("%.2f",getOrderTotal() );
	}

}
