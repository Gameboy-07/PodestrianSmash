package metrics;

public class Position {

	private double x,y;
	
	public Position(double x, double y){
		this.setX(x);
		this.setY(y);
	}
	
	public Position(int x, int y){
		this.setX(x);
		this.setY(y);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void moveBy(Vector v){
		this.x+=v.getDX();
		this.y+=v.getDY();
	}
	
}
