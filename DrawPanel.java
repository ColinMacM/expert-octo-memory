import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = 3000;
        int height = 3000;
        int gridRows=height/gridCellSize, gridColumns=1000, gridCellSize = 2000/gridColumns;
        for(int y = 0; y < gridRows; y++)
        {
           for(int x = 0; x < gridColumns; x++)
           {
              g.drawRect(x * gridCellSize, y * gridCellSize, gridCellSize, gridCellSize);
           }
        }
    }
}