import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Calculator {
	
	public Calculator() {
		
		JLabel mainLabel = new JLabel("", SwingConstants.RIGHT);
		
		JPanel panel1 = new JPanel(new GridLayout(1,4));
		JPanel panel2 = new JPanel(new GridLayout(1,4));
		JPanel panel3 = new JPanel(new GridLayout(1,4));
		JPanel panel4 = new JPanel(new GridLayout(1,4));
		JPanel panel5 = new JPanel(new GridLayout(1,4));
		
		JButton buttonCE = new JButton("CE");
		JButton buttonC = new JButton("C");
		JButton buttonBack = new JButton("<-");
		JButton buttonDiv = new JButton("/");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonMult = new JButton("*");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton buttonSub = new JButton("-");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton buttonAdd = new JButton("+");
		JButton buttonNegate = new JButton("+/-");
		JButton button0 = new JButton("0");
		JButton buttonPoint = new JButton(".");
		JButton buttonEquals = new JButton("=");
		
		JFrame mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setLayout(new GridLayout(6,1));
		
		mainFrame.add(mainLabel);
		mainFrame.add(panel1);
		mainFrame.add(panel2);
		mainFrame.add(panel3);
		mainFrame.add(panel4);
		mainFrame.add(panel5);
		
		panel1.add(buttonCE);
		panel1.add(buttonC);
		panel1.add(buttonBack);
		panel1.add(buttonDiv);
		
		panel2.add(button7);
		panel2.add(button8);
		panel2.add(button9);
		panel2.add(buttonMult);
		
		panel3.add(button4);
		panel3.add(button5);
		panel3.add(button6);
		panel3.add(buttonSub);
		
		panel4.add(button1);
		panel4.add(button2);
		panel4.add(button3);
		panel4.add(buttonAdd);
		
		panel5.add(buttonNegate);
		panel5.add(button0);
		panel5.add(buttonPoint);
		panel5.add(buttonEquals);
		
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Calculator main = new Calculator();
	}
}
