import java.awt.Color;
import java.awt.Graphics;


public class ShapeXO {
	
	private int xPos;
	private int xPos2;
	private int yPos;
	private int yPos2;
	private boolean selectedShape = true;
	
	public void draw(Graphics x){
		if (selectedShape == true){
			x.setColor(Color.GREEN);
			x.drawLine(this.xPos, this.yPos, this.xPos2, this.yPos2);
			x.drawLine(this.xPos2, this.yPos, this.xPos, this.yPos2);
		}
		else{
			x.setColor(Color.GREEN);
			x.drawOval(this.xPos,this.yPos , 150, 150);
		}
	}
	public void setShapeInfo(int x1,int y1, int x2,int y2, boolean selShape){
		this.xPos = x1;
		this.yPos = y1;
		this.xPos2 = x2;
		this.yPos2 = y2;
		this.selectedShape = selShape;	
	}
}