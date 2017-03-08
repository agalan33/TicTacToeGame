import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame();
		TicTacPanel ticPanel  = new TicTacPanel();
		mainFrame.add(ticPanel);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		mainFrame.setTitle("Tic Tac Toe!");
		
		//Method to find Dimension of the screen and store it as a coordinate int.
				Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
			    int centerX = (int) ((dimension.getWidth() - mainFrame.getWidth()) / 2);
			    int centerY = (int) ((dimension.getHeight() - mainFrame.getHeight()) / 2);
				
				mainFrame.setLocation(centerX -200, centerY -150);
				mainFrame.setSize(400, 300);
				mainFrame.setResizable(false);
				
				


	}

}
