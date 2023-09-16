import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ATMTwoPointO extends JFrame{

    public ATMTwoPointO(){
		setResizable(false);
		setLocationRelativeTo(null);
		initializingATM();
		pack();
		setSize(600, 350);
		setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    void initializingATM()
    {
        JLabel displayArea = new JLabel("<html>Instruction Area: <br> Please select a function from the buttons below <br> Current Balance: \u00A3" + balance + "</html>");
		displayArea.setOpaque(true);
		displayArea.setBackground(Color.white);
		displayArea.setPreferredSize(new Dimension(100, 100));
        JPanel bottomArea = new JPanel();
		bottomArea.setLayout(new BorderLayout(0,0));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout(0,0));
		JLabel inputDisplay = new JLabel("Input Area:");
		inputDisplay.setBorder(BorderFactory.createLineBorder(Color.black));
		bottomArea.add(inputDisplay, BorderLayout.NORTH);
    }

}