package hour13;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class SalutionFrame extends JFrame {
	
	public SalutionFrame(){
		super("Hello World!");
		setLookAndFeel();
		setSize(350,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception exc){
			
		}
	}
	public static void main(String[] args){
		SalutionFrame sal = new SalutionFrame();
	}

}
