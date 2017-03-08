import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacPanel extends JPanel {
	
	public void paintComponent(Graphics t){
		
		JTextField button = new JTextField();
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
        t.drawRect(x1+10, y1+10, width -20, height - 20);
        
        t.setColor(Color.CYAN);
        t.drawString("Click for X, second player Click for O",x1+20 , y1+30 );
        t.drawString("Click on Button to Start", x1+20, y1+50);
        t.drawString("Good Luck!", x1+20, y1+70);
        
        
        
        t.setColor(Color.RED);
        t.drawRect(x1+20, y1+200, 100, 60);
        t.drawString("Button", x1+30, y1+240);
        
        
       
   
	} 
}
	


	
    
    
  


