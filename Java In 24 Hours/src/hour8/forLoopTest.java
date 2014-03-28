package hour8;

public class forLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Sets the dex to 0.
		 * As long as dex is below 1000 continue the loop.
		 * It will display ever number divisible by 12
		 * dex++ will add 1 to the number, it'll go up by 1 each time it passes the loop.
		 * If number reaches 1000, it'll stop.
		 */
		for(int dex = 0; dex < 1000; dex++){
			if(dex % 12 == 0){
				System.out.println("#: " + dex);
			}
		}

	}

}
