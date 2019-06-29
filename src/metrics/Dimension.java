package metrics;

public class Dimension {

	private double width, height;
	
	public Dimension(double width, double height){
		this.width = width;
		this.height = height;
	}

	public Dimension(int width, int height){
		this.width = (double) width;
		this.height = (double) height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public void scaleWidth(double scaleFactor){
		this.width *= scaleFactor;
	}
	
	public void scaleHeight(double scaleFactor){
		this.height *= scaleFactor;
	}
	
	public void scaleDimension(double scaleFactor){
		this.scaleWidth(scaleFactor);
		this.scaleHeight(scaleFactor);
	}
	
	public void changeWidth(double am){
		this.width+=am;
	}
	
	public void changeHeight(double am){
		this.height+=am;
	}
	
}
