import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	
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
			drawButtons(ran.nextInt(24));
		}
	}

}
