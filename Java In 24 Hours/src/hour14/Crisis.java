package hour14;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Crisis extends JFrame {
	
	JButton panicButton;
	JButton dontPanicButton;
	JButton blameButton;
	JButton mediaButton;
	JButton saveButton;
	
	
	public Crisis(){
		super("Crisis");
		setLookAndFeel();
		setSize(350, 130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		
		panicButton = new JButton("Panic");
		dontPanicButton = new JButton("Don't Panic");
		blameButton = new JButton("Blame Others");
		mediaButton = new JButton("Notify the Media");
		saveButton = new JButton("Save Yourself");
		
		add(panicButton);
		add(dontPanicButton);
		add(blameButton);
		add(mediaButton);
		add(saveButton);
		
		
	}
	
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception exc){
			//ignore error
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crisis cri = new Crisis();
		
		GridLayout grid = new GridLayout(2, 3);
		
		
	}

}
