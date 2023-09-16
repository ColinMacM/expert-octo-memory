import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GuestLogin extends JFrame {
   public GuestLogin(){
      super("Login Screen"); //title is Login Screen
      setLayout(new BorderLayout()); //creates a new object called BorderLayout for making layout easier
	   setResizable(false); //cannot change the size, just to make life easier
	   setLocationRelativeTo(null); 
      loginInitializing();
      pack();
  	   setSize(250, 110);
	   setVisible(true);
	   this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	
   }

   public static void main(String[] args)
   {

      new RunProgramHere();
   }

    void loginInitializing(){
        JLabel guestLabel = new JLabel("Guest Name");
        JTextField guestTextField = new JTextField();
        JLabel pinLabel = new JLabel("Guest Pin"); //creates a new label for the admin password
        JPasswordField pinText = new JPasswordField(); //creates the text to enter the admin password
        JButton quit = new JButton("Quit");
        JButton adminLogin = new JButton("Admin Login");
        JPanel panel = new JPanel(); //creates the background
        panel.setLayout(new FlowLayout(FlowLayout.CENTER)); //initializes what layout we will be making
        
        panel.add(guestLabel);
        panel.add(guestTextField);
        panel.add(quit);
        panel.add(pinLabel); //adds it to the panel
        panel.add(pinText); //adds it to the panel
        panel.add(adminLogin);
        guestTextField.setBackground(Color.white);
        pinText.setBackground(Color.white); //sets the textbox for pin as white
        
        add(guestLabel, BorderLayout.NORTH);
        add(guestTextField, BorderLayout.CENTER);
        add(pinLabel, BorderLayout.NORTH); //layouts the label as the top
        add(pinText, BorderLayout.CENTER); //layouts the text on bottom
        add(panel, BorderLayout.SOUTH); //the panel just to add the buttons at the bottom
         
  	    quit.addActionListener(new ActionListener(){ //i'm not gonna question why theres only two opening brackets and only one closing brackets. it compiles?
  	       public void actionPerformed(ActionEvent event) {
	   		   System.exit(0);
	   		}	
	   });
      pinText.addActionListener(new ActionListener(){
	   	public void actionPerformed(ActionEvent event) {
	   		char[] passwordGuess = passwordText.getPassword();
	   		String passwordString = new String(passwordGuess);
	   		if(passwordString.equals(adminPassword)){
	   			JOptionPane.showMessageDialog(null, "Password is correct! Logging in...");
	   			dispose();
	   			new ATMTwoPointO();
	   		}
            else
               JOptionPane.showMessageDialog(null, "That password is incorrect!");
        	}	
      });
      adminLogin.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, "Switching to Guest Login.");
            dispose();
            new RunProgramHere();
         }
      });
   }  
}