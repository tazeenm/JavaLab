package java5;

//Write a Java Swing application to allow the user to enter a number N, a button "Prime" which on clicking generates the first N prime numbers and places them in a text area, a button "Factorial" which on clicking obtains the factorial of N and appends it to the text area!

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing{
	public static void main(String[] args){
		JFrame frame = new JFrame();

		JTextField textField = new JTextField(20);
		textField.setBounds(130,100,100, 40); //x axis, y axis, width, height 

		JButton primeButton = new JButton("Prime");
		primeButton.setBounds(130,150,100, 40); //x axis, y axis, width, height

		JButton factButton = new JButton("Factorial");
		factButton.setBounds(130,200,100, 40); //x axis, y axis, width, height 

		JButton clearButton = new JButton("Clear");
		clearButton.setBounds(130,250,100, 40); //x axis, y axis, width, height 
		

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Serif", Font.ITALIC, 16));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(100,300,200,200); //x axis, y axis, width, height 

		primeButton.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae){
			String textFieldValue = textField.getText();
			if(textFieldValue.length() > 0){
				textArea.append("Prime Numbers: \n");
				try{
					for(String s : getPrimes(Integer.parseInt(textFieldValue)) ){
						textArea.append(s+"\n");
					}
				}catch(Exception e){
					textArea.append("Invalid input \n \n");
				}
				
			}else{
				textArea.append("Enter some number! \n");
			}
		   }
		});

		factButton.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae){
			String textFieldValue = textField.getText();
			if(textFieldValue.length() > 0)
				try{
					textArea.append("\nFactorial: \n"+factorial(Integer.parseInt(textFieldValue))+"\n");
				}catch(Exception e){
					textArea.append("Invalid input \n \n");
				}
			else
				textArea.append("Enter some number! \n");
		   }
		});

		clearButton.addActionListener(new ActionListener(){
		   public void actionPerformed(ActionEvent ae){
			textArea.setText("");
			textField.setText("");
		   }
		});


		frame.setLayout(null);
		frame.setSize(400,600);
		frame.add(textField);
		frame.add(primeButton);
		frame.add(factButton);
		frame.add(clearButton);
		frame.add(scroll);
		frame.setVisible(true);
	}

	public static long factorial(int n) {
		long fact = 1; // this  will be the result
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static ArrayList<String> getPrimes(int N){
		int count=0;
		ArrayList<String> result = new ArrayList<>();
		int num=2;
		while(count!=N)// while count!= number of prime numbers entered keep searching.. 
		{
			boolean prime=true;// to determine whether the number is prime or not
			for (int i=2;i<=Math.sqrt(num);i++)//efficiency matters
			{
				if (num%i==0)
				{
					prime=false;// if number divides any other number its not a prime so set prime to false and break the loop.
					break;
				}

			}
			if (prime)
			{
				count++;
				result.add(""+num);
			}
			num++;
		}
		return result;	
	}
}
