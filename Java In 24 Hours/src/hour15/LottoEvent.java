package hour15;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

public class LottoEvent implements ItemListener, ActionListener, Runnable {
	
	LottoMadness gui;
	Thread playing;
	
	public LottoEvent(LottoMadness in){
		gui = in;
	}
	
	public void actionPerformed(ActionEvent event){
		String command = ecent.getActionCommand();
		if(command.equals("Play")){
			startPlaying();
		}
		if(command.equals("Stop")){
			stopPlaying();
		}
		if(command.equals("Reset")){
			clearAllFields();
		}
	}
	
	void startPlaying(){
		playing = new Thread(this);
		playing.start();
		gui.play.setEnabled(false);
		gui.stop.setEnabled(true);
		gui.reset.setEnabled(false);
		gui.quickpick.setEnabled(false);
		gui.personal.setEnabled(false);
	}//end startPlaying
	
	void stopPlaying(){
		gui.stop.setEnabed(false);
		gui.play.setEnabled(true);
		gui.reset.setEnabled(true);
		gui.quickpick.setEnabled(true);
		gui.personal.setEnabled(true);
		playing = null;
	}//end stopPlaying
	
	void clearAllFields(){
		for(int i = 0; i < 6; i++){
			gui.numbers[i].setText(null);
			gui.winners[i].setText(null);
		}
		gui.got3.setText("0");
		gui.got4.setText("0");
		gui.got5.setText("0");
		gui.got6.setText("0");
		gui.drawings.setText("0");
		gui.years.setText("0");
	}//end clearAllFields
	
	public void ItemStateChanged(ItemEvent event){
		Object item =  event.getItem();
		if(item ==  gui.quickpick){
			for(int i = 0; i < 6; i++){
				int pick;
				do{
					pick = (int) Math.floor(Math.random() * 50 + 1);
				}while(numbersGone(pick, gui.numbers, i));
			}//end if for
		}//end if
		else{
			for(int i = 0; i < 6; i++){
				gui.numbers[i].setText(null);
			}//end else for
		}//end else
	}//end ItemStateChanged
	
	void addOneToField(JTextField field){
		int num = Integer.parseInt("0" + field.getText());
		num++;
		field.setText("" + num);
	}//end AddOneToField

	boolean numberGone(int num, JTextField[] pastNums, int count){
		for(int i = 0; i < count; i++){
			if(Integer.parseInt(pastNums[i].getText()) == num){
				return true;
			}//end numberGone if
		}//end numberGone for
		return false;
	}//end numberGone
	
	boolean matchedOne(JTextField wn, JTextField[] allPicks){
		for(int i = 0; i < 6; i++){
			String winText = win.getText();
			if(winText.equals(allPicks[i].getText() )){
				return true;
			}//end if
		}//end for
		return false;
	}//end matchedOne
	
	public void run(){
		Thread thisThread = Thread.currentThread();
		while(playing == thisThread){
			addOneToField(gui.drawings);
			int draw = Integer.parseInt(gui.drawings.getText());
			float numYears = (float)draw / 104;
			gui.years.setText("" + numYears);
			
			int matches = 0;
			for(int i = 0; i < 6; i++){
				int ball;
				do{
					ball = (int) Math.floor(Math.random() * 50 + 1);
				}while(numberGone(ball, gui.winners, i));
				gui.winners[i].setText("" + ball);
				if(matchedOne(gui.winners[i], gui.numbers)){
					matches++;
				}
			}//end for
			
			switch (matches){
			case 3:
				addOneToField(gui.got3);
				break;
			case 4:
				addOneToField(gui.got4);
				break;
			case 5:
				addOneToField(gui.got5);
				break;
			case 6:
				addOneToField(gui.got6);
				gui.stop.setEnabled(false);
				gui.play.setEnabled(true);
				playing = null;
			}//end switch matches
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				//do nothing
			}
		}//end while
	}//end run
	
}//end class
