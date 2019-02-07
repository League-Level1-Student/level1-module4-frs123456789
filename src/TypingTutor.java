import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	char currentLetter;

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	public static void main(String[] args) {
		TypingTutor tt = new TypingTutor();
		tt.setup();
	}
	JLabel jl = new JLabel();
	JFrame jf = new JFrame("Type or Die");
	void setup() {
		

		jf.setVisible(true);

		currentLetter = generateRandomLetter();
		
		jl.setText(currentLetter+"");
		jf.add(jl);
		jl.setFont(jl.getFont().deriveFont(28.0f));
		jl.setHorizontalAlignment(JLabel.CENTER);
		jf.addKeyListener(this);
		
		
		
		
		
		
		jf.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You Typed " + e.getKeyChar());
		if(e.getKeyChar() == currentLetter) {
			System.out.println("You are correct!");
			jf.setBackground(Color.green);
		}
		else {
			System.out.println("Y'all are wrong");
			jf.setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		jl.setText(currentLetter+"");
	}
}
