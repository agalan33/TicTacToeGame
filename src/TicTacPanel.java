import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JPanel;

public class TicTacPanel extends JPanel {
	
	
	private static final long serialVersionUID = -501362397574239722L;

	public void paintComponent(Graphics t){
		
		super.paintComponent(t);
        Insets myInsets = this.getInsets();
        int x1 = myInsets.left;
        int y1 = myInsets.top;
        int x2 = getWidth() - myInsets.right - 1;
        int y2 = getHeight() - myInsets.bottom - 1;
        int width = x2 - x1;
        int height = y2 - y1;
        
        t.setColor(Color.BLACK);
        t.fillRect(x1, y1, width + 1, height + 1);
        
        t.setColor(Color.GREEN);
        t.drawLine(width/3, 0, x2/3, y2);
        t.drawLine(2*width/3, 0, 2*x2/3, y2);
        t.drawLine(0, height/3, x2, y2/3);
        t.drawLine(0, 2*height/3, x2, 2*y2/3);
        
        
        
        
		
		
        
        
       
   
	}
} 

	


	
    
    
  


