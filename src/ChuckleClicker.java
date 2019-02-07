import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker cc = new ChuckleClicker();
		cc.makeButtons();

	}

	JButton jb1 = new JButton("Joke");
	JButton jb2 = new JButton("Punchline");

	void makeButtons() {

		JFrame jf = new JFrame();
		jf.setVisible(true);
		JPanel jp = new JPanel();

		jp.add(jb1);
		jp.add(jb2);
		jf.add(jp);
		jf.pack();
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == jb1) {
			JOptionPane.showMessageDialog(null, "Is your refrigerator running?");
		}

		else if (e.getSource() == jb2) {
			JOptionPane.showMessageDialog(null, "Well you better go catch it!");
		}

	}
}
