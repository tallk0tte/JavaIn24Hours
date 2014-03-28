package hour10;


public class Modem {

	int speed;
	public void displaySpeed(){
		System.out.println("Speed: " + speed);
	}
	
	public static void main(String[] args){
		Modem device = new Modem();
		
		//Sets a value to speed
		device.speed = 2000;
		
		//Calls on the displaySpeed method.
		device.displaySpeed();
	}
}


