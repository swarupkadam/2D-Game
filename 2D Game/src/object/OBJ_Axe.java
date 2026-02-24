package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Axe extends Entity{

	public static final String objName = "Hatchet";
	
	public OBJ_Axe(GamePanel gp) {
		super(gp);
		
		type = type_axe;
		name = objName;
		down1 = setup("/objects/axe", gp.tileSize, gp.tileSize);
		attackValue = 2;
		attackArea.width = 30;
		attackArea.height = 30;
		description = "[" + name + "]\nBit rusty but still can\ncut some trees.";
		price = 4;
		knockBackPower = 2;
		motion1_duration = 3;
		motion2_duration = 10;
	}

}
