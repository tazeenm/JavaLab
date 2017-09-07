package swing;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		//frame.setBounds(100, 300, 40, 60);
		
		JButton primeButton = new JButton("Prime");
		primeButton.setBounds(100, 150, 40, 60);
		
		JButton factButton = new JButton("Prime");
		primeButton.setBounds(100, 200, 40, 60);
		
		JButton clearButton = new JButton("Prime");
		primeButton.setBounds(100, 300, 40, 60);
		
		JTextField textField = new JTextField();
		textField.setBounds(100, 100, 40, 60);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(100, 200, 40, 80);
		textArea.setFont(new Font("Serif", Font.ITALIC,20));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		primeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String value = textField.getText();
				if(value.length() > 0) {
					textArea.append("Primes\n");
					try {
						for(String s : getPrimes(Integer.parseInt(value))) {
							textArea.append(s);
						}
					} catch(Exception e) {
						textArea.append("Invalid Input\n");
					}
				} else {
					textArea.append("Enter a number\n");
				} 
				
			}});
		
		factButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String value = textField.getText();
				if(value.length() > 0) {
					try {
						textArea.append("Factorial\n" + factorial(Integer.parseInt(value)));
					} catch(Exception e1) {
						textArea.append("Invalid\n");
					}
				} else {
					textArea.append("Enter a number\n");
				}
				
			}
			
		});
		
		clearButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText("");
				textArea.setText("");				
			}
			
		});
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(100,200,40,80);
		
		frame.setLayout(null);
		frame.setSize(400, 600);
		frame.add(textArea);
		frame.add(textField);
		frame.add(scroll);
		frame.add(primeButton);
		frame.add(factButton);
		frame.add(clearButton);
		frame.setVisible(true);
	}
	
	public static long factorial(int num) {
		long res = 1;
		for(int i=0; i<=num; i++ ) {
			res *= num;
		}
		return res;
		
	}
	
	public static ArrayList<String> getPrimes(int num1) {
		ArrayList<String> result = new ArrayList<String>();
		int count = 0;
		boolean prime=true;
		int n = 2;
		while(count != num1) {
			for(int i=2; i<Math.sqrt(n); i++) {
				if((n % i) == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				count++;
				result.add("" + n);
			}
			n++;
		}
		return result;
		
	}

}
