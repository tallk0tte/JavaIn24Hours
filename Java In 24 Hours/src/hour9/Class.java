package hour9;

import java.util.Arrays;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"Lauren", "Audrina", "Heidi", "Whitney", "Stephanie", "Spencer", "Lisa",
				"Brody", "Frankie", "Holly", "Jordan", "Brian", "Jason" };
		
		System.out.println("The Original Order: ");
		//Loops through the names in the string in the order they were added.
		for(int i = 0; i < names.length; i++){
			System.out.print(i + ": " + names[i] + " ");
		}
		System.out.println();
		System.out.println();
		//Sorts the names in an alpabetic order.
		Arrays.sort(names);
		System.out.println("The New Order: ");
		//does the exact same thing but takes the sorted array and loops it through
		for(int i = 0; i < names.length; i++){
			System.out.print(i + ": " + names[i] + " ");
		}
		System.out.println();
	}//end main
}//end class
