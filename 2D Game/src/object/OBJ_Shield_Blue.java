package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Shield_Blue extends Entity{

	public static final String objName = "Blue shield";
	
	public OBJ_Shield_Blue(GamePanel gp) {
		super(gp);
		
		type = type_shield;
		name = objName;
		down1 = setup("/objects/shield_blue", gp.tileSize, gp.tileSize);
		defenceValue = 10;
		description = "[" + name + "]\nShield but Blue.";
		price = 5;
	}
}
