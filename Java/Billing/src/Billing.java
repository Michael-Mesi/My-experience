
public class Billing {			//public class holding the computeBill members
	public double computeBill(double price) {	//computes the cost of a single photo book 
		double total = price + (price * 0.08);	//adds 8% tax to the bill
		return total;	//returns total
		
	}
	public double computeBill(double price, int quantity){	//computes the cost of a specified number of photo books 
		double total = price * quantity;					//gets  price of all of the books
		total += total * 0.08;								// calculates tax of books
		return total;										//returns total cost
	}
	public double computeBill(double price, int quantity, double coupon) {	//calculates the cost of a set number of books with the use of a coupon.
		double total = price * quantity;			//gets total price of books
		total -= coupon;							//subtracts coupon
		total += total * 0.08;						//computes tax
		return total;								//returns total 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price = 29.99;						//test price
		int quantity = 17;							//test quantity
		double coupon = 15.00;						//test coupon
		Billing test = new Billing();				//test Billing object
		System.out.println(test.computeBill(price)); //computes the cost of a single photo book
		System.out.println(test.computeBill(price, quantity));//computes the cost of a specified number of photo books
		System.out.println(test.computeBill(price, quantity, coupon));//calculates the cost of a set number of books with the use of a coupon.
		
	}

}
