package hour10;

public class ModemTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CableModem surfBoard = new CableModem();
		DslModem gateway = new DslModem();
		
		surfBoard.speed = 500000;
		gateway.speed = 400000;
		
		System.out.println("Trying the cable modem: ");
		surfBoard.displaySpeed();
		surfBoard.connect();
		
		System.out.println();
		
		System.out.println("Trying the DLS modem: ");
		gateway.displaySpeed();
		gateway.connect();
		

	}

}
