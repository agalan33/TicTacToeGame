import java.awt.Graphics;

public class shapeXO {
	
	private int xPos;
	private int xPos2;
	
	private int yPos;
	private int yPos2;
	
	private boolean selectedShape;
	
	
	
	public void draw(Graphics x){

		if (selectedShape == true){
			x.drawLine(this.xPos, this.yPos, this.xPos2, this.yPos2);
			x.drawLine(this.xPos2, this.yPos, this.xPos, this.yPos2);

		}
		else{
			x.drawOval((this.xPos+this.xPos2)/2,(this.yPos+this.yPos2)/2 , 120, 120);
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