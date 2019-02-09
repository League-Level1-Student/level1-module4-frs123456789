import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculator {
public static void main(String[] args) {
	
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
jf.setVisible(true);
JButton jb1 = new JButton("Add");
JButton jb2 = new JButton("Sub");
JButton jb3 = new JButton("Mul");
JButton jb4 = new JButton("Div");
jf.add(jp);
jp.add(jb1);
jp.add(jb2);
jp.add(jb3);
jp.add(jb4);




jf.pack();	
	
}
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

}
