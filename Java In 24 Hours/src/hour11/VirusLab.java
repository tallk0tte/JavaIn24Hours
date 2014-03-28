package hour11;

public class VirusLab {

	public static void main(String[] args) {
		int numViruses = 200;//Integer.parseInt(200);
		
		
		if(numViruses > 0 ){
			Virus[] virii = new Virus[numViruses];
			for(int i = 0; i < numViruses; i++){
				virii[i] = new Virus();
			}//end for
			System.out.println("There are " + Virus.getVirusCount() + " viruses.");
		
		}//end if
	}//end main
}//end class
