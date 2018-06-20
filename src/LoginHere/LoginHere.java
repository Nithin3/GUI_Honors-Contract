package LoginHere;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;

public class LoginHere {

	private static String usrname;
	private static String pass;
	private static String confirmPass;
	private JFrame frame;
	private JTextField textUsername;
	private JPasswordField textPassword;
	private static int choice;
	private static Scanner scan = new Scanner(System.in);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		System.out.println("Thank you for using our ApplicationStop.");
		menu();
		System.out.println("To Proceed, Please Create an Account.");
		createsUsrNameAndPass();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginHere window = new LoginHere();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void menu(){
		System.out.println("Here is the menu of different applications you can use: \n"+
							"1: SoS Game(Tic-Tac-Toe) \n"+
							"2: Calculator");
		
		System.out.println("Please enter your choice : ");
		choice = scan.nextInt();
		
	}
	public static void createsUsrNameAndPass(){
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Username :");
		 usrname = in.nextLine();
		 System.out.println("Enter Password :");
		 pass = in.nextLine();
		 System.out.println("Confirm your Password :");
		 confirmPass = in.nextLine();
		 
		 if(pass.equals(confirmPass)){
		 System.out.println("Thank you for creating an account! Have a nice one!");
		 }
		 else if(pass!=confirmPass){
			 System.out.println("Passwords do not match");
			 System.out.println();
			 System.out.println("-------------------------------------------------");
			 System.out.println();
			 System.exit(0);
		 }
		
		 
	}

	/**
	 * Create the application.
	 */
	public LoginHere() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Login System");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setBounds(150, 150, 450, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogIn = new JLabel("LOG IN");
		lblLogIn.setBounds(210, 43, 61, 16);
		frame.getContentPane().add(lblLogIn);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(80, 102, 83, 16);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(80, 162, 68, 16);
		frame.getContentPane().add(lblPassword);
		
		textUsername = new JTextField();
		textUsername.setBounds(205, 97, 130, 26);
		frame.getContentPane().add(textUsername);
		textUsername.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(205, 157, 130, 26);
		frame.getContentPane().add(textPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//If the entered details match that of the account created, program goes to the other class and implements it
				if(textUsername.getText().contains(usrname) && textPassword.getText().contains(pass)){
					textUsername.setText("");
					textPassword.setText("");
				
					if(choice == 1){
						SosGame.main(null);
					}
					
					else if(choice == 2)
						Calculator.main(null);
					
					
				}
				// else, if the details are incorrect, a message pops up saying it is invalid details
				else{
					JOptionPane.showMessageDialog(null, "Invalid Username or Password","Login Error", JOptionPane.ERROR_MESSAGE);
					textUsername.setText("");
					textPassword.setText("");
				}
			}
		});
		btnLogin.setBounds(102, 222, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		//If Reset button is pressed, everything becomes empty
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUsername.setText("");
				textPassword.setText("");
				
				
			}
		});
		btnReset.setBounds(244, 222, 117, 29);
		frame.getContentPane().add(btnReset);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, 73, 438, 12);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 198, 444, 12);
		frame.getContentPane().add(separator_1);
	}

}
