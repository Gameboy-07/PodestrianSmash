package Combat;

public class Move {

	private int totalFrames = 0;
	
	private Action[] totalActions;
	
	public Move(Action[] actions, int startUp, int endLag){
		for(Action action : actions){
			totalFrames += action.getFrames();
		}
		totalFrames += startUp+endLag;
		Action start = Action.getEmptyAction(startUp);
		Action end = Action.getEmptyAction(endLag);
		totalActions = new Action[actions.length+2];
		totalActions[0] = start;
		totalActions[actions.length+1] = end;
		for(int i = 1; i < actions.length+1; i++)
			totalActions[i] = actions[i-1];
	}
	
	public int getTotalFrames(){
		return totalFrames;
	}
	
	
	
}
