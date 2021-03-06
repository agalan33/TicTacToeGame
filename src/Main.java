import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame ticTacFrame = new JFrame();
		TicTacPanel ticPanel  = new TicTacPanel();
		ticTacFrame.add(ticPanel);
		ticTacFrame.setVisible(true);
		ticTacFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		ticTacFrame.setTitle("Tic Tac Toe!");
		
		//Method to find Dimension of the screen and store it as a coordinate int.
				Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			    int centerX = (int) ((dimension.getWidth() - ticTacFrame.getWidth()) / 2);
			    int centerY = (int) ((dimension.getHeight() - ticTacFrame.getHeight()) / 2);
				
				ticTacFrame.setLocation(centerX -300, centerY -300);
				ticTacFrame.setSize(600, 600);
				ticTacFrame.setResizable(false);
				ticPanel.addMouseListener(new MouseAdapter() {
					
					@Override 
					public void mousePressed(MouseEvent e) {
							int x = e.getX();
							int y = e.getY();
							boolean shape = false;
							System.out.println(x +" " +y);
							ticPanel.gameMove(x, y,shape);
					}
				});
				
				
				
				
				


	}

}
