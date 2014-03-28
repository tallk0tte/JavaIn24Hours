package hour7;

import java.util.Scanner;

public class iftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Checking account");
		int account = scan.nextInt();
		
		if(account <= 0){
			System.out.println("Overdrawn.");
		}
		else{
			System.out.println("It's okay");
		}
	}

}
