import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestPrep implements ActionListener {
	
public static void main(String[] args) {
TestPrep tp = new TestPrep();
tp.setup();
}

JFrame jf = new JFrame("There are 40 people on a 2 level cruise ship. 10 out of the 40 people go to the upper level. They look down at the 30 people below see 34 heads. How is this possible?");
JPanel jp = new JPanel();
JButton jb1 = new JButton("Submit");
JButton jb2 = new JButton("Hint");
JTextField jtf = new JTextField();
String answer = "30 foreheads";
void setup() {
	jtf.setPreferredSize(new Dimension(175,25));
	jf.add(jp);
	jp.add(jb1);
	jp.add(jb2);
	jp.add(jtf);
	jf.setVisible(true);
	jf.pack();
	jb1.addActionListener(this);	
	jb2.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed = (JButton) e.getSource();
	if(pressed == jb2) {
		JOptionPane.showMessageDialog(null,"HUH, Maybe synonyms?");
	}
	if(pressed == jb1) {
	if(answer == jtf.getText()) {
		JOptionPane.showMessageDialog(null, "You are correct!");
	}
	}
}

}
