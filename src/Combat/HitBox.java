package Combat;

import metrics.Angle;
import metrics.Dimension;
import metrics.Position;
import metrics.Rectangle;
import metrics.Vector;

public class HitBox extends Rectangle{

	private double launchStrength, damage;
	
	private Angle launchAngle;
	
	private int hitStun;
	
	public HitBox(Dimension d, Position pos, Angle launchAngle, double launchStrength, double damage, int hitStun) {
		super(d, pos);
		this.launchAngle = launchAngle;
		this.launchStrength = launchStrength;
		this.damage = damage;
		this.hitStun = hitStun;
	}
	
	public Vector getLaunchVector(){
		return launchAngle.vectorFromMagnitude(launchStrength);
	}
	
	public double getDamage(){
		return damage;
	}
	
	public int getHitStun(){
		return hitStun;
	}
	
}
