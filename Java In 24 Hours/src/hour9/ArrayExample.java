package hour9;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		String[] naughtyChild;
		int[] reindeerWeight;
		boolean[] hostileAirTravelNations;
		
		int[] elfSeniority = new int[250];
		
		String[] reindeerNames = {"Dasher", "Rudolph", "Prancer", "Vixen", "Comet", "Donder"};
		System.out.println("Ch0ose a number: ");
		int choice = scan.nextInt();
		
		
		System.out.println(reindeerNames[choice]);

	}

}
