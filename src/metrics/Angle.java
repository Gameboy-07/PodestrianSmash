package metrics;

public class Angle {

	private double angle;
	
	public Angle(double angle){
		this.angle = angle;
		normalize();
	}
	
	public Angle(Vector v){
		double x = v.getDX();
		double y = v.getDY();
		
		angle = angleFromVector(x, y);
	}
	
	private double angleFromVector(double x, double y){
		if (x == 0) 
	        return (y > 0)? 90
	            : (y == 0)? 0
	            : 270;
	    else if (y == 0) 
	        return (x >= 0)? 0
	            : 180;
		double ret = (Math.atan(y/x)*180/Math.PI);
	    if (x < 0 && y < 0) 
	        ret = 180 + ret;
	    else if (x < 0) 
	        ret = 180 + ret; 
	    else if (y < 0) 
	        ret = 270 + (90 + ret); 
	    return ret;
	}
	
	private void normalize(){
		while(angle > 360){
			angle-=360;
		}
		while(angle < 0){
			angle+=360;
		}
	}
	
	public int getQuadrant(){
		if(angle <= 90)
			return 1;
		else if(angle <= 180)
			return 2;
		else if(angle <= 270)
			return 3;
		return 4;
	}
	
	public Vector vectorFromMagnitude(double magnitude){
		double x = magnitude*Math.cos(angle);
		double y = magnitude*Math.sin(angle);
		return new Vector(x,y);
	}
	
}
