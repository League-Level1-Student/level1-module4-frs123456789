import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
public static void main(String[] args) {
	SlotMachine sm = new SlotMachine();
sm.setup();
}
JButton jb = new JButton("SPIN");
JFrame jf = new JFrame();
JPanel jp = new JPanel();
JLabel jl = new JLabel();
JLabel jl1 = new JLabel();
JLabel jl2 = new JLabel();
void setup(){
	jb.addActionListener(this);
	jf.setVisible(true);
	jf.add(jp);
	jp.add(jb);
	jp.add(jl);
	jp.add(jl2);
	jp.add(jl1);
	jl.setPreferredSize(new Dimension(100,100));
	jl1.setPreferredSize(new Dimension(100,100));
	jl2.setPreferredSize(new Dimension(100,100));
	jb.setPreferredSize(new Dimension(100,25));
	spin();
}
void spin() {
	jp.remove(jl);
	jp.remove(jl1);
	jp.remove(jl2);
	Random gen = new Random();
	int num = gen.nextInt(3);
if(num == 0) {
		jl = loadImageFromComputer("cherry.png");
	}
	else if(num == 1) {
		jl = loadImageFromComputer("grape.png");
	}
	else {
		jl = loadImageFromComputer("lemon.png");	
	}
int num1 = gen.nextInt(3);
if(num1 == 0) {
	jl1 = loadImageFromComputer("cherry.png");
}
else if(num1 == 1) {
	jl1 = loadImageFromComputer("grape.png");
}
else {
	jl1 = loadImageFromComputer("lemon.png");	
}
int num2 = gen.nextInt(3);
if(num2== 0) {
	jl2 = loadImageFromComputer("cherry.png");
}
else if(num2 == 1) {
	jl2 = loadImageFromComputer("grape.png");
}
else {
	jl2 = loadImageFromComputer("lemon.png");	
}
jp.add(jl);
jp.add(jl2);
jp.add(jl1);
jf.pack();
	if(num == num1 && num1 == num2) {
		JOptionPane.showMessageDialog(null,"Вы выиграли много рублей");
	}
	
}
public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed = (JButton) e.getSource();
	if(pressed == jb) {
		spin();
	}
}
		
		


}
