/**
 * 
 */
package hour10;

import java.util.Scanner;

/**
 * @author fohlin
 *
 */
public class NewRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Write the number you want the square root of: ");
		int number = scan.nextInt();
		if(args.length > 0){
			number = Integer.parseInt(args[0]);
		}
		System.out.println("The squareroot of " + number + " is " + Math.sqrt(number));

	}

}
