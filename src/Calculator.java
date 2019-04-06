import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Calculator {
	
	int cnt = 0;
	int neg = 0;
	int cntB = 0;
	int cntP = 0;
	
	public Calculator() {
		
// Define JFrame, JPanel, JButton, JLabel
		JLabel mainLabel = new JLabel("", SwingConstants.RIGHT);
		
		JPanel panel1 = new JPanel(new GridLayout(1,4));
		JPanel panel2 = new JPanel(new GridLayout(1,4));
		JPanel panel3 = new JPanel(new GridLayout(1,4));
		JPanel panel4 = new JPanel(new GridLayout(1,4));
		JPanel panel5 = new JPanel(new GridLayout(1,4));
		
		JButton buttonCE = new JButton("CE");
		JButton buttonC = new JButton("C");
		JButton buttonBack = new JButton("←");
		JButton buttonDiv = new JButton("÷");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton buttonMult = new JButton("×");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton buttonSub = new JButton("–");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton buttonAdd = new JButton("+");
		JButton buttonNegate = new JButton("±");
		JButton button0 = new JButton("0");
		JButton buttonPoint = new JButton(".");
		JButton buttonEquals = new JButton("=");
		
		JFrame mainFrame = new JFrame();
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setLayout(new GridLayout(6,1));
	
// Add JPanel, JButton, JLabel to JFrame
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

// Button ActionListeners
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(mainLabel.getText() + "0");
			}
		});
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(mainLabel.getText() + "1");
			}
		});
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(mainLabel.getText() + "2");
			}
		});
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(mainLabel.getText() + "3");
			}
		});
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(mainLabel.getText() + "4");
			}
		});
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(mainLabel.getText() + "5");
			}
		});
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(mainLabel.getText() + "6");
			}
		});
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(mainLabel.getText() + "7");
			}
		});
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(mainLabel.getText() + "8");
			}
		});
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText(mainLabel.getText() + "9");
			}
		});
		buttonPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(mainLabel.getText().equals("")) && cntP == 0) {
					mainLabel.setText(mainLabel.getText() + ".");
					cntP = 1;
				}
			}
		});
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cntB == 0 && !(mainLabel.getText().equals(""))) {
					mainLabel.setText(mainLabel.getText() + "+");
					cntB = 1;
					cntP = 0;
				}
			}
		});
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cntB == 0 && !(mainLabel.getText().equals(""))) {
					mainLabel.setText(mainLabel.getText() + "–");
					cntB = 1;
					cntP = 0;
				}
			}
		});
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cntB == 0 && !(mainLabel.getText().equals(""))) {
					mainLabel.setText(mainLabel.getText() + "×");
					cntB = 1;
					cntP = 0;
				}
			}
		});
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cntB == 0 && !(mainLabel.getText().equals(""))) {
					mainLabel.setText(mainLabel.getText() + "÷");
					cntB = 1;
					cntP = 0;
				}
			}
		});
		buttonBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainLabel.getText().length() != 0) {
					mainLabel.setText(mainLabel.getText().substring(0, mainLabel.getText().length() - 1));
				}
			}
		});
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainLabel.setText("");
				cnt = 0;
				cntB = 0;
				cntP = 0;
			}
		});
		buttonCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cnt = 0;
				cntP = 0;
				if(mainLabel.getText().contains("+")) {
					mainLabel.setText(mainLabel.getText().substring(0, mainLabel.getText().indexOf("+") + 1));
				}
				else if(mainLabel.getText().contains("–")) {
					mainLabel.setText(mainLabel.getText().substring(0, mainLabel.getText().indexOf("–") + 1));
				}
				else if(mainLabel.getText().contains("×")) {
					mainLabel.setText(mainLabel.getText().substring(0, mainLabel.getText().indexOf("×") + 1));
				}
				else if(mainLabel.getText().contains("÷")) {
					mainLabel.setText(mainLabel.getText().substring(0, mainLabel.getText().indexOf("÷") + 1));
				}
				else {
					mainLabel.setText("");
				}
			}
		});
		buttonNegate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mainLabel.getText().contains("+") && cnt == 0) {
					mainLabel.setText(mainLabel.getText().substring(0, mainLabel.getText().indexOf("+") + 1) + " -" + mainLabel.getText().substring(mainLabel.getText().indexOf("+") + 1, mainLabel.getText().length()));
					cnt = 1;
				}
				else if(mainLabel.getText().contains("–") && cnt == 0) {
					mainLabel.setText(mainLabel.getText().substring(0, mainLabel.getText().indexOf("–") + 1) + " -" + mainLabel.getText().substring(mainLabel.getText().indexOf("–") + 1, mainLabel.getText().length()));
					cnt = 1;
				}
				else if(mainLabel.getText().contains("×") && cnt == 0) {
					mainLabel.setText(mainLabel.getText().substring(0, mainLabel.getText().indexOf("×") + 1) + " -" + mainLabel.getText().substring(mainLabel.getText().indexOf("×") + 1, mainLabel.getText().length()));
					cnt = 1;
				}
				else if(mainLabel.getText().contains("÷") && cnt == 0) {
					mainLabel.setText(mainLabel.getText().substring(0, mainLabel.getText().indexOf("÷") + 1) + " -" + mainLabel.getText().substring(mainLabel.getText().indexOf("÷") + 1, mainLabel.getText().length()));
					cnt = 1;
				}
				else if(!(mainLabel.getText().contains("+")) && !(mainLabel.getText().contains("–")) && !(mainLabel.getText().contains("×")) && !(mainLabel.getText().contains("÷")) && !(mainLabel.getText().contains("-"))) {
					mainLabel.setText("-" + mainLabel.getText());
					neg = 1;
				}
			}
		});
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Calculator main = new Calculator();
	}
}
