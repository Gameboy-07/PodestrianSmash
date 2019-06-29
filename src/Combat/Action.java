package Combat;

public class Action {
	
	private HurtBox[] boxes;
	
	private int frames;
	
	public Action(HurtBox[] boxes, int frames){
		this.boxes = boxes;
		this.frames = frames;
	}
	
	public int getFrames(){
		return frames;
	}
	
	public HurtBox[] getBoxes(){
		return boxes;
	}
	
	public static Action getEmptyAction(int frames){
		return new Action(new HurtBox[0],frames);
	}
	
}
