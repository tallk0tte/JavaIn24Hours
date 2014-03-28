package hour7;

public class game {
	public static void main(String args[]){
		int total = 0;
		int score = 7;
		
		if(score == 7){
			System.out.println("You won a touchdown!");
		}//end if
		if(score == 3){
			System.out.println("You kick a field goa.");
		}
		total = total + score;
		System.out.println("Total score: "+ score);
	}

}
