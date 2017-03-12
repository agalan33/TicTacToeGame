import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TicTacPanel extends JPanel {
	
	
	private static final long serialVersionUID = -501362397574239722L;
	ShapeXO shape = new ShapeXO();

	private boolean firstMove = false;

        
        public void gameMove(int x1, int y1, boolean shapeX0){
        
        	if(y1<200){
        		System.out.println("ho");
        		if(x1<200){
        			firstMove = true;
            		shape.setShapeInfo(20, 20, (600/3)-20 , (600/3)-20, shapeX0);
            		repaint();
        		}
        		else if(x1>2*(600/3)){
        			firstMove = true;
            		shape.setShapeInfo(2*(600/3)+20, 20, 600-20 , (600/3)-20, shapeX0);
            		repaint();
        		}
        		else{
        			firstMove = true;
            		shape.setShapeInfo((600/3) + 20, 20, 2*(600/3)-20 , (600/3)-20, shapeX0);
            		repaint();
        		}
        		
        	}
        	else if(y1>400){
        		if(x1<200){
        			firstMove = true;
            		shape.setShapeInfo(20, 420, (600/3)-20 , 600-20, shapeX0);
            		repaint();
        		}
        		else if(x1>2*(600/3)){
        			firstMove = true;
            		shape.setShapeInfo(2*(600/3)+20, 420, 600-20 , 600-20, shapeX0);
            		repaint();
        		}
        		else{
        			firstMove = true;
            		shape.setShapeInfo((600/3) + 20, 420, 2*(600/3)-20 , 600-20, shapeX0);
            		repaint();
        		}
        		
        	}
        	else{
        		if(x1<200){
        			firstMove = true;
            		shape.setShapeInfo(20, 220, (600/3)-20 , 400-20, shapeX0);
            		repaint();
        		}
        		else if(x1>2*(600/3)){
        			firstMove = true;
            		shape.setShapeInfo(2*(600/3)+20, 220, 600-20 , 400-20, shapeX0);
            		repaint();
        		}
        		else{
        			firstMove = true;
            		shape.setShapeInfo((600/3) + 20, 220, 2*(600/3)-20 , 400-20, shapeX0);
            		repaint();
        		}
        	}
        	
        	   
        		
        		
        	
        	
        }
        
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
            t.drawLine(0, 200, x2, 200);
            t.drawLine(0, 400, x2, 400);
            
            
            
            if(firstMove){
            	shape.draw(t);
            	
            	
            }
            
            
            
    	}
        
        
        
		
		
        
        
       
   
	
} 

	


	
    
    
  


