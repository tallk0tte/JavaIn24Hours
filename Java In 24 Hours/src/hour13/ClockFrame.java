package hour13;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class ClockFrame extends JFrame {
		public ClockFrame(){
			super("Clock");
			setLookAndFeel();
			setSize(400,120);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			FlowLayout flo = new FlowLayout();
			setLayout(flo);
			ClockPanel time = new ClockPanel();
			add(time);
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClockFrame frame = new ClockFrame(); 

	}

}
