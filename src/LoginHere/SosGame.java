package LoginHere;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class SosGame {

	private JFrame frmSos;
	private String currentPlayer = "s";
	
	private int count = 0;

	/**
	 * Launch the application.
	 */
	//Main function
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SosGame window = new SosGame();
					window.frmSos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SosGame() {
		initialize();
	}
	
	// This method changes player after a player plays his/her move
	private void changePlayer() {

        if (currentPlayer.equals("s")) {

            currentPlayer = "o";

        }

        else {

            currentPlayer = "s";

        }

    }
	
	//This method checks the winner overall
	private void winCheck(JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5,JButton btn6,JButton btn7,JButton btn8,JButton btn9 ){
	
		//If there is a win either in rows, or columns or diagonally, print a message congratulating the winner
		
		if(checkRowsForWin(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) == true || checkColsForWin(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9) == true || checkDiagForWin(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9)==true){
			
			JOptionPane.showMessageDialog(frmSos, "Congratulations! You are the winner", "SOS GAME", JOptionPane.INFORMATION_MESSAGE);
		}
		
		//If there is no win and they played for 9 times, print a message stating that the game is a draw
		else if(count == 9){
			JOptionPane.showMessageDialog(frmSos, "The Game is a Draw");
		}
			
		
	}
	
	//This method checks if there is a win in any of the rows
	private boolean checkRowsForWin(JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5,JButton btn6,JButton btn7,JButton btn8,JButton btn9) {
		
		String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        
            if (b1.equalsIgnoreCase("s") && b2.equalsIgnoreCase("s") && b3.equalsIgnoreCase("s")) {
                return true;
            }else if(b4.equalsIgnoreCase("s") && b5.equalsIgnoreCase("s") && b6.equalsIgnoreCase("s")){
            	return true;
            }else if(b7.equalsIgnoreCase("s") && b8.equalsIgnoreCase("s") && b9.equalsIgnoreCase("s")){
            	return true;
            }
            
            else if (b1.equalsIgnoreCase("o") && b2.equalsIgnoreCase("o") && b3.equalsIgnoreCase("o")) {
                return true;
            }else if(b4.equalsIgnoreCase("o") && b5.equalsIgnoreCase("o") && b6.equalsIgnoreCase("o")){
            	return true;
            }else if(b7.equalsIgnoreCase("o") && b8.equalsIgnoreCase("o") && b9.equalsIgnoreCase("o")){
            	return true;
            }
            
            else{
                return false;
                    }

    }

	//This method checks if there is a win in any of the columns
	private boolean checkColsForWin(JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5,JButton btn6,JButton btn7,JButton btn8,JButton btn9) {

        String b1 = btn1.getText();
        String b2 = btn2.getText();
        String b3 = btn3.getText();
        String b4 = btn4.getText();
        String b5 = btn5.getText();
        String b6 = btn6.getText();
        String b7 = btn7.getText();
        String b8 = btn8.getText();
        String b9 = btn9.getText();
        
        
            if (b1.equalsIgnoreCase("s") && b4.equalsIgnoreCase("s") && b7.equalsIgnoreCase("s")) {
                return true;
            }else if(b2.equalsIgnoreCase("s") && b5.equalsIgnoreCase("s") && b8.equalsIgnoreCase("s")){
            	return true;
            }else if(b3.equalsIgnoreCase("s") && b6.equalsIgnoreCase("s") && b9.equalsIgnoreCase("s")){
            	return true;
            }
            
            else if (b1.equalsIgnoreCase("o") && b4.equalsIgnoreCase("o") && b7.equalsIgnoreCase("o")) {
                return true;
            }else if(b2.equalsIgnoreCase("o") && b5.equalsIgnoreCase("o") && b8.equalsIgnoreCase("o")){
            	return true;
            }else if(b3.equalsIgnoreCase("o") && b6.equalsIgnoreCase("o") && b9.equalsIgnoreCase("o")){
            	return true;
            }

            else{
        return false;
            }

    }
	
	//This method checks if there is a win in any of the diagonals
	private boolean checkDiagForWin(JButton btn1, JButton btn2, JButton btn3, JButton btn4, JButton btn5,JButton btn6,JButton btn7,JButton btn8,JButton btn9) {

        String b1 = btn1.getText();
        String b3 = btn3.getText();
        String b5 = btn5.getText();
        String b7 = btn7.getText();
        String b9 = btn9.getText();
        
   
            if (b1.equalsIgnoreCase("s") && b5.equalsIgnoreCase("s") && b9.equalsIgnoreCase("s")) {
                return true;
            }else if(b3.equalsIgnoreCase("s") && b5.equalsIgnoreCase("s") && b7.equalsIgnoreCase("s")){
            	return true;
            }
            
            else if (b1.equalsIgnoreCase("o") && b5.equalsIgnoreCase("o") && b9.equalsIgnoreCase("o")) {
                return true;
            }else if(b3.equalsIgnoreCase("o") && b5.equalsIgnoreCase("o") && b7.equalsIgnoreCase("o")){
            	return true;
            }
            else{    
        return false;
            }

    }
	

	

	/**
	 * Initialize the contents of the frame.
	 */
	//This method gives up a game window where the user could enjoy his/her game
	
	private void initialize() {
		frmSos = new JFrame();
		frmSos.setTitle("SoS");
		frmSos.pack();
		frmSos.setLocationRelativeTo(null);
		frmSos.setBounds(150, 150, 450, 300);
		frmSos.setVisible(true);
		frmSos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSos.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frmSos.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 2, 2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btn1 = new JButton("");
		JButton btn2 = new JButton("");
		JButton btn3 = new JButton("");
		JButton btn4 = new JButton("");
		JButton btn5 = new JButton("");
		JButton btn6 = new JButton("");
		JButton btn7 = new JButton("");
		JButton btn8 = new JButton("");
		JButton btn9 = new JButton("");
		
		//What if button1 is pressed
		btn1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				btn1.setText(currentPlayer);
				count++;
				changePlayer();
				winCheck(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		btn1.setFont(new Font("Arial Black", Font.BOLD, 66));
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		//What if button2 is pressed
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btn2.setText(currentPlayer);
				count++;
				changePlayer();
				winCheck(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		btn2.setFont(new Font("Arial Black", Font.BOLD, 66));
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		//What if button3 is pressed
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btn3.setText(currentPlayer);
				count++;
				changePlayer();
				winCheck(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		btn3.setFont(new Font("Arial Black", Font.BOLD, 66));
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		//What if button4 is pressed
		btn4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btn4.setText(currentPlayer);
				count++;
				changePlayer();
				winCheck(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		btn4.setFont(new Font("Arial Black", Font.BOLD, 66));
		panel_4.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		//What if button5 is pressed
		btn5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btn5.setText(currentPlayer);
				count++;
				changePlayer();
				winCheck(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		btn5.setFont(new Font("Arial Black", Font.BOLD, 66));
		panel_5.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		//What if button6 is pressed
		btn6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btn6.setText(currentPlayer);
				count++;
				changePlayer();
				winCheck(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		btn6.setFont(new Font("Arial Black", Font.BOLD, 66));
		panel_6.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		//What if button7 is pressed
		btn7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btn7.setText(currentPlayer);
				count++;
				changePlayer();
				winCheck(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		btn7.setFont(new Font("Arial Black", Font.BOLD, 66));
		panel_7.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		//What if button8 is pressed
		btn8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btn8.setText(currentPlayer);
				count++;
				changePlayer();
				winCheck(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		btn8.setFont(new Font("Arial Black", Font.BOLD, 40));
		panel_8.add(btn8, BorderLayout.CENTER);
		
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		//What if button9 is pressed
		btn9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				btn9.setText(currentPlayer);
				count++;
				changePlayer();
				winCheck(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
			}
		});
		btn9.setFont(new Font("Arial Black", Font.BOLD, 66));
		panel_9.add(btn9, BorderLayout.CENTER);
		
		JPanel panel_10 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_10.getLayout();
		panel_8.add(panel_10, BorderLayout.SOUTH);
		
		//When the reset button is pressed, everything becomes empty and the count becomes 0
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				currentPlayer = "s";
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
				count = 0;
			}
		});
		btnReset.setVerticalAlignment(SwingConstants.BOTTOM);
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 13));
		panel_10.add(btnReset);
	}

}

