package car_dealership;

public class Employee {
	private String name;
	private String empNum;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpNum() {
		return empNum;
	}

	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		System.out.println(cust.getName() + " would like to buy a " + vehicle.getColour() + " " + vehicle.getModel());
		System.out.println("My name is " + this.getName() + " and I will help with your purchase.");
		
		if (finance) {
			System.out.println("Customer wants financing.");
			runCreditHistory(cust, vehicle);
		} else if (vehicle.getPrice() <= cust.getCashOnHand()){
			System.out.println("Customer doesn't want financing.");
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Please bring more money to buy car.");
		}
	}
	
	public void processTransaction(Customer cust, Vehicle vehicle) {
		double change = cust.getCashOnHand() - vehicle.getPrice();
		
		System.out.println("Here is your new car! You get $" + change + " back.");		
	}
	
	public void runCreditHistory(Customer cust, Vehicle vehicle) {	
		if (cust.getcreditScore() >= 670) {
			System.out.println("Your credit score is good!");	
			processTransaction(cust, vehicle);
		} else {
			System.out.println("Your credit score is bad! You cannot buy a car.");	
		}		
	}

}