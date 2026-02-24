package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_BlueHeart extends Entity{

	GamePanel gp;
	public static final String objName = "Blue Heart";
	
	public OBJ_BlueHeart(GamePanel gp) {
		super(gp);

		this.gp = gp;
		
		type = type_pickupOnly;
		name = objName;
		down1 = setup("/objects/blueheart", gp.tileSize, gp.tileSize);
		
	}
	public void setDialogues() {
		
		dialogues[0][0] = "";
		dialogues[0][1] = "You Found the Blue Heart, the legendary treasure!";
	}
	public boolean use(Entity entity) {
		
		gp.playSE(18);
		gp.ui.addMessage("You pick up a beautiful blue gem.");
		gp.ui.addMessage("LEGENDARY TREASURE!");
		gp.player.coin += value;
		return true;
	}
	
}
