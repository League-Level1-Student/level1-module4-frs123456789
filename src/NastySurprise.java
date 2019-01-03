import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton jb1 = new JButton("Trick");
	JButton jb2 = new JButton("Treat");
public static void main(String[] args) {
NastySurprise ns = new NastySurprise();
ns.setup();
}
void setup() {
	
JFrame jf = new JFrame();
JPanel jp = new JPanel();


jp.add(jb2);
jp.add(jb1);
jf.add(jp);
jf.pack();
jf.setVisible(true);
jb1.addActionListener(this);	
jb2.addActionListener(this);

	
}



private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	JButton jbidk = (JButton) e.getSource();

	if(jbidk == jb1) {
		showPictureFromTheInternet("https://ybxzcgnc7b-flywheel.netdna-ssl.com/wp-content/uploads/2018/07/small-dog-breed-long.jpg");
	}
	else {
		showPictureFromTheInternet("https://pics.me.me/whats-the-difference-between-hillary-and-putinp-putin-can-winan-32014056.png");
	}
}
	
}
