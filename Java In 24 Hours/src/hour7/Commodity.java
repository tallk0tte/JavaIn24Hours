package hour7;

public class Commodity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String command ="BUY";
		int balance = 550;
		int quantity = 42;
		
		switch(command){
		case "BUY":
			quantity += 5;
			balance -= 20;
		case "SELL":
			quantity -= 5;
			balance += 15;
		}//end switch
		System.out.println("Balance: "+ balance + "\n" + "Quantity: " + quantity);
	}//end class
}//end main
