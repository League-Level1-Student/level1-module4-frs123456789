
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2018
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private AudioClip sound;
	JPanel insideLeftPanel = new JPanel();
	JPanel insideRightPanel = new JPanel();
	JPanel RightOfTheRightPanel = new JPanel();
JButton fifthButton = new JButton();
JButton sixthButton = new JButton();
JButton seventhButton = new JButton();
JButton eighthButton = new JButton();
JButton ninethButton = new JButton();
JButton tenthButton = new JButton();
JButton eleventhButton = new JButton();
JButton twelthButton = new JButton();

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		insideLeftPanel.setPreferredSize(new Dimension(75,300));
		insideRightPanel.setPreferredSize(new Dimension(100,300));
		RightOfTheRightPanel.setPreferredSize(new Dimension (75,300));
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
	quizPanel.add(insideLeftPanel);
		quizPanel.add(insideRightPanel);
		quizPanel.add(RightOfTheRightPanel);
		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("Jeopardy Game");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel header;
		header = createHeader("Guitars");
		
		JPanel header1;
		header1 = createHeader("Countertops");
		
		JPanel header2;
		header2 = createHeader("Music");
		
		insideRightPanel.add(header1);

		// 4. Add the header component to the quizPanel
		insideLeftPanel.add(header);
		RightOfTheRightPanel.add(header2);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
		firstButton = createButton("$200");
		// 7. Add the firstButton to the quizPanel

		// 8. Write the code to complete the createButton() method below. Check that
		// your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method
		thirdButton = createButton("$600");
		fourthButton = createButton("$800");

		secondButton = createButton("$400");
		fifthButton = createButton("$200");
		sixthButton = createButton("$400");
		seventhButton = createButton("$600");
		eighthButton = createButton("$800");
		ninethButton = createButton("$200");
		tenthButton = createButton("$400");
		eleventhButton = createButton("$600");
		twelthButton = createButton("$800");
		
				
		// 10. Add the secondButton to the quizPanel
		insideLeftPanel.add(firstButton);
		insideLeftPanel.add(secondButton);
		insideLeftPanel.add(thirdButton);
		insideLeftPanel.add(fourthButton);
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		fifthButton.addActionListener(this);
		sixthButton.addActionListener(this);
		seventhButton.addActionListener(this);
		eighthButton.addActionListener(this);
		ninethButton.addActionListener(this);
		tenthButton.addActionListener(this);
		eleventhButton.addActionListener(this);
		twelthButton.addActionListener(this);
		insideRightPanel.add(fifthButton);
		insideRightPanel.add(sixthButton);
		insideRightPanel.add(seventhButton);
		insideRightPanel.add(eighthButton);
		RightOfTheRightPanel.add(ninethButton);
		RightOfTheRightPanel.add(tenthButton);
		RightOfTheRightPanel.add(eleventhButton);
		RightOfTheRightPanel.add(twelthButton);
		// 12. Write the code to complete the actionPerformed() method below

		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions

		/*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */

		frame.pack();
	//	quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
	}

	private JButton createButton(String dollarAmount) {

		// Create a new JButton
		JButton jb = new JButton();
		// Set the text of the button to the dollarAmount
		jb.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount++;
		// Return your new button instead of the temporary button

		return jb;
	}

	public void actionPerformed(ActionEvent e) {

		// Remove this temporary message after testing:
		

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
		if (buttonPressed == firstButton) {
			askQuestion("What guitar is better, The Fender Telecaster or The Fender Telecaster Thinline?",
					"The Fender Telecaster Thinline", 200);
		}
		if (buttonPressed == secondButton) {
			askQuestion("Does the Fender Telecaster have single coil pickups?", "yes", 400);
		}
		if (buttonPressed == thirdButton) {
			askQuestion("Which guitar is older, The Fender Telecaster or The Fender Stratocaster",
					"The Fender Telecaster", 600);
		}
		if (buttonPressed == fourthButton) {
			askQuestion("Are Squier Guitars expensive.", "no", 800);
		}
		if (buttonPressed == fifthButton) {
			askQuestion("Are concrete countertops durable?", "yes", 200);
		}
		if (buttonPressed == sixthButton) {
			askQuestion("What countertop is more durable? Marble or Manufactured Stone", "Manufactured Stone", 400);
		}
		if (buttonPressed == seventhButton) {
			askQuestion("Can you crack a countertop?","yes", 600);
		}
		if (buttonPressed == eighthButton) {
			askQuestion("Is marble an elegant material?", "yes", 800);
		}
		if (buttonPressed == ninethButton) {
			askQuestion("What is the most famous song from the wizard of oz?", "Somewhere Over The Rainbow", 200);
		}
		if(buttonPressed == tenthButton) {
			askQuestion("Who played the 53rd SuperBowl halftime show?", "Maroon Five", 400);
		}
		if(buttonPressed == eleventhButton) {
			askQuestion("How old was Elvis when he died?", "42", 200);
		}
		if(buttonPressed == twelthButton) {
			askQuestion("How many flats are in the key of Aflat", "4", 800);
		}

		// Call the askQuestion() method

		// Complete the code in the askQuestion() method. When you play the game, the
		// score should change.

		// If the buttonPressed was the secondButton

		// Call the askQuestion() method with a harder question

		// Clear the text on the button that was pressed (set the button text to
		// nothing)

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {

		// Use the playJeopardyTheme() method to play music while the use thinks of an
		// answer
		playJeopardyTheme();
		// Remove this temporary message and replace it with a pop-up that asks the user
		// the question
		String answer = JOptionPane.showInputDialog(question);

		// Stop the theme music when they have entered their response. Hint: use the
		// sound variable
		sound.stop();
		// If the answer is correct
		if (correctAnswer.equals(answer)) {
			score += prizeMoney;
			JOptionPane.showMessageDialog(null, "You are correct!");
		}
		// Increase the score by the prizeMoney

		// Pop up a message to tell the user they were correct

		// Otherwise
		else {
			score -= prizeMoney;
			JOptionPane.showMessageDialog(null, "You are not correct!");
		}
		// Decrement the score by the prizeMoney

		// Pop up a message to tell the user they were wrong and give them the correct
		// answer

		// Call the updateScore() method
		updateScore();
	}

	public void playJeopardyTheme() {
		try {
			sound = JApplet.newAudioClip(getClass().getResource("jeopardy.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
