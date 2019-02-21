import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	Date timeAtStart = new Date();
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	int molesWhacked = 0;
public static void main(String[] args) {
new WhackAMole();	
}Random ran = new Random();
	public WhackAMole() {
		// TODO Auto-generated constructor stub



		
drawButtons(ran.nextInt(24));
		
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	void drawButtons(int ran) {
		
		for(int i = 0; i<24; i++) {
			JButton b = new JButton();
			if(i == ran) {  
				b.setText("Mole!");
			}
			jp.add(b);
			jf.add(jp);
			jf.setVisible(true);
			jf.setSize(250,300);
			jf.add(jp);
			jf.setVisible(true);
			jf.setSize(250,300);
			b.addActionListener(this);
		}
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(((JButton) e.getSource()).getText().equals("Mole!")) {
			molesWhacked = molesWhacked +1;
			jf.remove(jp);
			jp = new JPanel();
			jf.add(jp);
			drawButtons(ran.nextInt(24));
			
		}
		if(molesWhacked == 10) {
			endGame(timeAtStart, 10);
		}
	}
	
}
