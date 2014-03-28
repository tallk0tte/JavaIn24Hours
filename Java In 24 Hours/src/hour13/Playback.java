package hour13;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class Playback extends JFrame {
	
	public Playback() {
		super("Playback");
		setLookAndFeel();
		setSize(400,120);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pause = new JButton("Pause");
		
		add(play);
		add(stop);
		add(pause);
		setVisible(true);
		
		
	}
	private void setLookAndFeel(){
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}
		catch(Exception exc){
			
		}
	}

	public static void main(String[] args) {
		Playback play = new Playback();
	}

}
