 
/*
 * Output:
 *  
 */

 import java.awt.Color;
 import java.awt.Graphics;
 
 import javax.swing.JFrame;
 import javax.swing.JPanel;
 
 public class DrawPanelTest extends JPanel {
 
   public void paint(Graphics g) {
     g.setColor(Color.red);
     
     g.drawRect(30,30,100,100);
   }
 
   public static void main(String[] args) {
     JFrame frame = new JFrame();
     frame.getContentPane().add(new DrawPanelTest());
 
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(1000,500);
     frame.setVisible(true);
   }
 }           
      