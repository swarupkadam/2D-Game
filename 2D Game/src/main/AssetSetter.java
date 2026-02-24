package main;

import entity.NPC_Merchant;
import entity.NPC_OldMan;
import monster.MON_GreenSlime;
import monster.MON_Orc;
import object.OBJ_Axe;
import object.OBJ_BlueHeart;
import object.OBJ_Boots;
import object.OBJ_Chest;
import object.OBJ_Coin_Bronze;
import object.OBJ_Door;
import object.OBJ_Heart;
import object.OBJ_Key;
import object.OBJ_Lantern;
import object.OBJ_ManaCrystal;
import object.OBJ_Potion_Red;
import object.OBJ_Shield_Blue;
import object.OBJ_Tent;
import tile_interactive.IT_DryTree;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		int mapNum = 0;
		int i = 0;
//		gp.obj[mapNum][i] = new OBJ_Coin_Bronze(gp);
//		gp.obj[mapNum][i].worldX = gp.tileSize*15;
//		gp.obj[mapNum][i].worldY = gp.tileSize*25;
		i++;
		gp.obj[mapNum][i] = new OBJ_Lantern(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*29;
		gp.obj[mapNum][i].worldY = gp.tileSize*25;
		i++;
		gp.obj[mapNum][i] = new OBJ_BlueHeart(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*10;
		gp.obj[mapNum][i].worldY = gp.tileSize*8;
		i++;
		gp.obj[mapNum][i] = new OBJ_Tent(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*26;
		gp.obj[mapNum][i].worldY = gp.tileSize*17;
		i++;
//		gp.obj[mapNum][i] = new OBJ_Shield_Blue(gp);
//		gp.obj[mapNum][i].worldX = gp.tileSize*20;
//		gp.obj[mapNum][i].worldY = gp.tileSize*41;
//		i++;
		gp.obj[mapNum][i] = new OBJ_Axe(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*36;
		gp.obj[mapNum][i].worldY = gp.tileSize*6;
		i++;
//		gp.obj[mapNum][i] = new OBJ_Heart(gp);
//		gp.obj[mapNum][i].worldX = gp.tileSize*31;
//		gp.obj[mapNum][i].worldY = gp.tileSize*22;
//		i++;
//		gp.obj[mapNum][i] = new OBJ_ManaCrystal(gp);
//		gp.obj[mapNum][i].worldX = gp.tileSize*39;
//		gp.obj[mapNum][i].worldY = gp.tileSize*24;
//		i++;
		gp.obj[mapNum][i] = new OBJ_Door(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*10;
		gp.obj[mapNum][i].worldY = gp.tileSize*12;
		i++;
		gp.obj[mapNum][i] = new OBJ_Door(gp);
		gp.obj[mapNum][i].worldX = gp.tileSize*13;
		gp.obj[mapNum][i].worldY = gp.tileSize*29;
		i++;
		gp.obj[mapNum][i] = new OBJ_Chest(gp);
		gp.obj[mapNum][i].setLoot(new OBJ_Key(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*30;
		gp.obj[mapNum][i].worldY = gp.tileSize*32;
		i++;
		gp.obj[mapNum][i] = new OBJ_Chest(gp);
		gp.obj[mapNum][i].setLoot(new OBJ_Potion_Red(gp));
		gp.obj[mapNum][i].worldX = gp.tileSize*37;
		gp.obj[mapNum][i].worldY = gp.tileSize*41;
		i++;
	}
	public void setNPC() {
		
		// MAP 0
		int mapNum = 0;
		int i = 0;
		gp.npc[mapNum][i] = new NPC_OldMan(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*21;
		gp.npc[mapNum][i].worldY = gp.tileSize*25;
		
		
		// MAP 1
		mapNum = 1;
		i = 0;
		gp.npc[mapNum][i] = new NPC_Merchant(gp);
		gp.npc[mapNum][i].worldX = gp.tileSize*25;
		gp.npc[mapNum][i].worldY = gp.tileSize*22;
		
	}
	public void setMonster() {
		
		int mapNum = 0;
		int i = 0;
		gp.monster[mapNum][i] =  new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*40;
		gp.monster[mapNum][i].worldY = gp.tileSize*40;
		i++;
		gp.monster[mapNum][i] =  new MON_Orc(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*12;
		gp.monster[mapNum][i].worldY = gp.tileSize*34;
		i++;
		gp.monster[mapNum][i] =  new MON_Orc(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*12;
		gp.monster[mapNum][i].worldY = gp.tileSize*35;
		i++;
		gp.monster[mapNum][i] =  new MON_Orc(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*12;
		gp.monster[mapNum][i].worldY = gp.tileSize*36;
		i++;
		gp.monster[mapNum][i] =  new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*38;
		gp.monster[mapNum][i].worldY = gp.tileSize*42;
		i++;
		gp.monster[mapNum][i] =  new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*33;
		gp.monster[mapNum][i].worldY = gp.tileSize*40;
		i++;
		gp.monster[mapNum][i] =  new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*24;
		gp.monster[mapNum][i].worldY = gp.tileSize*34;
		i++;
		gp.monster[mapNum][i] =  new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*23;
		gp.monster[mapNum][i].worldY = gp.tileSize*41;
		i++;
		gp.monster[mapNum][i] =  new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*20;
		gp.monster[mapNum][i].worldY = gp.tileSize*39;
		i++;
		gp.monster[mapNum][i] =  new MON_GreenSlime(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*20;
		gp.monster[mapNum][i].worldY = gp.tileSize*41;
		i++;
		
	}
	public void setInteractiveTile() {
		
		int mapNum = 0;
		int i = 0;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 35, 13);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 34, 13);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 33, 13);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 32, 13);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 31, 13);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 13);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 13);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 32, 25);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 33, 25);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 33);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 34);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 29, 34);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 28, 34);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 34);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 32);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 31);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 33);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 27, 30);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 26, 30);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 25, 30);i++;
		
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 9, 41);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 9, 42);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 10, 42);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 11, 42);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 42);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 12, 41);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 41);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 30, 41);i++;
		gp.iTile[mapNum][i] = new IT_DryTree(gp, 13, 30);i++;
		
	}
}
