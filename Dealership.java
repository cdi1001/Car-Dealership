package car_dealership;

public class Dealership {

	public static void main(String[] args) {	
		Customer cust1 = new Customer();
		cust1.setName("Tom Bombadil");
		cust1.setAddress("123 Fake St.");
		cust1.setCashOnHand(12000);
		cust1.setcreditScore(700);
		
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setColour("blue");
		vehicle1.setModel("Chevrolet Cobalt");
		vehicle1.setPrice(11500);
		
		Employee emp3 = new Employee();
		emp3.setEmpNum("003");
		emp3.setName("Sterling Archer");
		
		cust1.purchaseCar(vehicle1, emp3, true);
	}

}