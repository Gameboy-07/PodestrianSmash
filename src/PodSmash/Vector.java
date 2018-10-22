package PodSmash;

public class Vector {

	public double dx,dy;
	
	public Vector(double dx, double dy){
		this.dx = dx;
		this.dy = dy;
	}
	
	public double getMag(){
		return Math.sqrt((dx*dx) + (dy*dy));
	}
	
	public void scale(double factor){
		dx*=factor;
		dy*=factor;
	}
	
	public double getCross(Vector v){
		return (v.dx*dy) - (v.dy*dx);
	}
	
	
	
}
