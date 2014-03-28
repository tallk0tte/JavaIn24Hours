package hour9;

public class SpaceRemover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mostFamous = "Rudolph the Red-Nosed Reindeer";//declares mostFamous with the text
		char[] mfl = mostFamous.toCharArray();//adds most famous to the char array.
		
		//The forloop checks the entire word and if there's a space, a dot is added.
		for(int dex = 0; dex < mfl.length; dex++){
			char current = mfl[dex];
			if (current != ' '){
				System.out.print(current);
			}else{
				System.out.print('.');
			}
		}
		System.out.println();
	}//end main
}//end class
