package hour15;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class KeyViewer extends JFrame implements KeyListener {
	JTextField keyText = new JTextField(80);
	JLabel keyLabel = new JLabel("Press any key in the text field. ");
	
	KeyViewer(){
		//Names the window
		super("KeyViewer");
		
		//Calls on a try/catch method
		setLookAndFeel();
		
		//Sets size and closes the operation
		setSize(500, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Tells it to listen to the keys
		keyText.addKeyListener(this);
		
		BorderLayout bord = new BorderLayout();
		add(keyLabel, BorderLayout.NORTH);
		add(keyText, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void keyTyped(KeyEvent input){
		char key = input.getKeyChar();
		keyLabel.setText("You pressed " + key);
	}
	
	public void keyPressed(KeyEvent txt){
		//do nothing
	}
	public void keyReleased(KeyEvent txt){
		//do nothing
	}
	
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception exc){
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	KeyViewer frame = new KeyViewer();

	}//end main
}//end class
