package ATM;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;
class Actiontest extends JFrame{
	private JLabel label2;
	private JLabel label3;
	private JTextField Field2;
	private JTextField Field3;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JPanel panel;
	private JPanel panel1;
	private JTextField Field;
	private JLabel label;
	MyListener2 list2 =new  MyListener2();
	MyListener list = new MyListener();
	MyListener1  list1 = new MyListener1();
	
	public Actiontest(){
		setTitle("ATM");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 panel = new JPanel();
		 panel1 = new JPanel();
		
		panel.setLayout(new BorderLayout());
		panel1.setLayout(new GridLayout(2,1));
		panel.add(new JLabel("Hello"),BorderLayout.PAGE_START);
		button1= new JButton("input");
		panel1.add(button1,BorderLayout.LINE_START);
		button1.addActionListener(list);
		button2= new JButton("output");
		panel1.add(button2,BorderLayout.LINE_START);
		button2.addActionListener(list);
		button3= new JButton("send");
		panel1.add(button3,BorderLayout.LINE_START);
		button3.addActionListener(list);
		button4 = new JButton("print");
		panel1.add(button4,BorderLayout.LINE_END);
		button4.addActionListener(list);
		button5 = new JButton("out");
		panel1.add(button5,BorderLayout.LINE_END);
		button5.addActionListener(list);	
		add(panel);
		panel.add(panel1);
		
		setVisible(true);
	}
		
		private class MyListener implements ActionListener{

			
			public void actionPerformed(ActionEvent e){
				if(e.getSource()== button1){
					panel1.remove(button1);
					panel1.remove(button2);
					panel1.remove(button3);
					panel1.remove(button4);
					panel1.remove(button5);
					remove(panel);
					panel1.setLayout(new GridLayout(4,2));
					label = new JLabel("ID");
					Field = new JTextField();	
					Field.addActionListener(list1);
					label2 = new JLabel("money");
					Field2 = new JTextField();	
					button2 = new JButton("ok");
					Field3 = new JTextField();
					button2.addActionListener(list1);
					Field2.addActionListener(list1);
					panel1.add(label);
					panel1.add(Field);
					panel1.add(label2);
					panel1.add(Field2);
					panel1.add(button2);
					panel.add(panel1);
					setSize(400,400);
					add(panel);
					setVisible(true);
				}
				else if(e.getSource()== button2){
					panel1.remove(button1);
					panel1.remove(button2);
					panel1.remove(button3);
					panel1.remove(button4);
					panel1.remove(button5);
					remove(panel);
					panel1.setLayout(new GridLayout(4,2));
					label = new JLabel("ID");
					Field = new JTextField();	
					Field.addActionListener(list1);
					label2 = new JLabel("money");
					Field2 = new JTextField();	
					button1 = new JButton("ok");
					Field3 = new JTextField();
					button1.addActionListener(list1);
					Field2.addActionListener(list1);
					panel1.add(label);
					panel1.add(Field);
					panel1.add(label2);
					panel1.add(Field2);
					panel1.add(button1);
					panel.add(panel1);
					setSize(400,400);
					add(panel);
					setVisible(true);
				}
				else if(e.getSource()== button3){
					panel1.remove(button1);
					panel1.remove(button2);
					panel1.remove(button3);
					panel1.remove(button4);
					panel1.remove(button5);
					remove(panel);
					panel1.setLayout(new GridLayout(4,2));
					label = new JLabel("ID");
					Field = new JTextField();	
					Field.addActionListener(list1);
					label2 = new JLabel("money");
					Field2 = new JTextField();	
					button3 = new JButton("ok");
					label3 = new JLabel("other ID");
					Field3 = new JTextField();
					button3.addActionListener(list1);
					Field2.addActionListener(list1);
					Field3.addActionListener(list1);
					panel1.add(label);
					panel1.add(Field);
					panel1.add(label2);
					panel1.add(Field2);
					panel1.add(label3);
					panel1.add(Field3);
					panel1.add(button3);
					panel.add(panel1);
					setSize(400,400);
					add(panel);
					setVisible(true);
				}
				else if (e.getSource()== button4){
					panel1.remove(button1);
					panel1.remove(button2);
					panel1.remove(button3);
					panel1.remove(button4);
					panel1.remove(button5);
					remove(panel);
					panel1.setLayout(new GridLayout(4,2));
					label = new JLabel("ID");
					Field = new JTextField();	
					Field.addActionListener(list1);
					button4 = new JButton("ok");
					button4.addActionListener(list1);
					panel1.add(label);
					panel1.add(Field);
					panel1.add(button4);
					panel.add(panel1);
					setSize(400,400);
					add(panel);
					setVisible(true);
				}
			else if (e.getSource()== button5){
			System.exit(0);
			}
	}
		}
		private static HashMap<String, Integer> account = new HashMap<String, Integer>();
			 class MyListener1 implements ActionListener{
		
				
				
				 
				public void actionPerformed(ActionEvent e){
					String name = Field.getText();
					account.put("1234567890123", new Integer(500));
					account.put("0987654321098", new Integer(1000));
				
					if(e.getSource()== button2){
						String money = Field2.getText();
						if (account.containsKey(name) == true){
							int i = Integer.parseInt(money);
							int b=account.get(name);
							panel1.remove(label);
							panel1.remove(Field);
							panel1.remove(label2);
							panel1.remove(Field2);
							panel1.remove(button2);
							panel.remove(panel1);
							remove(panel);
							int c = i+b;
							label = new JLabel("Balance"+c);
							panel1.add(label);
							button1=new JButton("end");
							button1.addActionListener(list2);
							panel1.add(button1);
							setSize(100,100);
							panel.add(panel1);
							add(panel);
							setVisible(true);
							account.put(name,c); 
						}
						else if(account.containsKey(name) == false){
			
							panel1.remove(label);
							panel1.remove(Field);
							panel1.remove(label2);
							panel1.remove(Field2);
							panel1.remove(button2);
							panel.remove(panel1);
							remove(panel);
							label = new JLabel("NO.");
							setSize(150,150);
							panel1.add(label);
							panel.add(panel1);
							add(panel);
							setVisible(true);
							
						}
					
					}
					if(e.getSource()== button1){
						String money = Field2.getText();
						if (account.containsKey(name) == true){
							
							int i = Integer.parseInt(money);
							int b=account.get(name);
							if(i <=b){
							panel1.remove(label);
							panel1.remove(Field);
							panel1.remove(label2);
							panel1.remove(Field2);
							panel1.remove(button1);
							panel.remove(panel1);
							remove(panel);
							int c = b-i;
							label = new JLabel("Balance"+c);
							panel1.add(label);
							setSize(100,100);
							panel.add(panel1);
							add(panel);
							setVisible(true);
							account.put(name,c);
						}
							else {
								panel1.remove(label);
								panel1.remove(Field);
								panel1.remove(label2);
								panel1.remove(Field2);
								panel1.remove(button1);
								panel.remove(panel1);
								remove(panel);
								label = new JLabel("don't have money");
								setSize(150,150);
								panel1.add(label);
								panel.add(panel1);
								add(panel);
								setVisible(true);
							}
						}
						else if(account.containsKey(name) == false){
			
							panel1.remove(label);
							panel1.remove(Field);
							panel1.remove(label2);
							panel1.remove(Field2);
							panel1.remove(button1);
							panel.remove(panel1);
							remove(panel);
							label = new JLabel("NO");
							setSize(150,150);
							panel1.add(label);
							panel.add(panel1);
							add(panel);
							setVisible(true);
							
						}
					
					}
					if(e.getSource()== button3){
						String money = Field2.getText();
						String other = Field3.getText();
						if (account.containsKey(name) == true){
							if(account.containsKey(other) == true){
								int i = Integer.parseInt(money);
								int b=account.get(name);
								int d = account.get(other);
								if(i <=b){
									panel1.remove(label);
									panel1.remove(Field);
									panel1.remove(label2);
									panel1.remove(Field2);
									panel1.remove(button3);
									panel1.remove(label3);
									panel1.remove(Field3);
									panel.remove(panel1);
									remove(panel);
									int c = b-i;
									int t = d+i;
									label = new JLabel("balance"+c);
									label2 = new JLabel("send"+b);
									panel1.add(label);
									panel1.add(label2);
									setSize(100,100);
									panel.add(panel1);
									add(panel);
									setVisible(true);
									account.put(other,t);
									account.put(name,c);
									}
								else if (i>b){
									panel1.remove(label);
									panel1.remove(Field);
									panel1.remove(label2);
									panel1.remove(Field2);
									panel1.remove(button3);
									panel1.remove(label3);
									panel1.remove(Field3);
									panel.remove(panel1);
									remove(panel);
									label = new JLabel("Don't have Money");
									setSize(150,150);
									panel1.add(label);
									panel.add(panel1);
									add(panel);
									setVisible(true);
								}
							}
							else {
								panel1.remove(label);
								panel1.remove(Field);
								panel1.remove(label2);
								panel1.remove(Field2);
								panel1.remove(button3);
								panel1.remove(label3);
								panel1.remove(Field3);
								panel.remove(panel1);
								remove(panel);
								label = new JLabel("other ID No");
								setSize(150,150);
								panel1.add(label);
								panel.add(panel1);
								add(panel);
								setVisible(true);
							}
						}
						else if(account.containsKey(name) == false){
			
							panel1.remove(label);
							panel1.remove(Field);
							panel1.remove(label2);
							panel1.remove(Field2);
							panel1.remove(button3);
							panel1.remove(label3);
							panel1.remove(Field3);
							panel.remove(panel1);
							remove(panel);
							label = new JLabel("ID NO");
							setSize(150,150);
							panel1.add(label);
							panel.add(panel1);
							add(panel);
							setVisible(true);
							
							}
					}
					else if(e.getSource()== button4){
						if (account.containsKey(name) == true){
							panel1.remove(label);
							panel1.remove(Field);
							panel1.remove(button4);
							remove(panel);
							int c = account.get(name);
							label = new JLabel("Balance"+c);
							panel1.add(label);
							setSize(100,100);
							panel.add(panel1);
							add(panel);
							setVisible(true);
						
						}
						
						else if(account.containsKey(name) == false){
			
							panel1.remove(label);
							panel1.remove(Field);
							panel1.remove(button4);
							panel.remove(panel1);
							remove(panel);
							label = new JLabel("NO");
							setSize(150,150);
							panel1.add(label);
							panel.add(panel1);
							add(panel);
							setVisible(true);
							
						}
					
					}
					
					}
					}

			 private class MyListener2 implements ActionListener{
					
					public void actionPerformed(ActionEvent e){
						
						if(e.getSource()== button1){
							
							
							Actiontest a = new Actiontest();
						}
					}
					}
				


}
public class Action {
	
	public static void main(String argsp[]){
		Actiontest a = new Actiontest();
		
	}

}
