package metrics;

public class Rectangle {

	private Dimension size;
	
	private Position pos;
	
	public Rectangle(Dimension d, Position pos){
		this.size = d;
		this.setPos(pos);
	}
	
	public Rectangle(double x, double y, double width, double height){
		this.size = new Dimension(width, height);
		this.setPos(new Position(x, y));
	}

	public Dimension getSize() {
		return size;
	}

	public void setSize(Dimension size) {
		this.size = size;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}
	
	public boolean overlaps(Rectangle r){
		Position tL = r.pos;
		Position bR = new Position(tL.getX()+r.size.getWidth(),tL.getY()+r.size.getHeight());
		Position tbR = new Position(pos.getX()+size.getWidth(),pos.getY()+size.getHeight());
		if(pos.getX() > bR.getX() || tL.getX() > tbR.getX())
			return false;
		if(pos.getY() < bR.getY() || tL.getY() < tbR.getY())
			return false;
		return true;
	}
	
}
