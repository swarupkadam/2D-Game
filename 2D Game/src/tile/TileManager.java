package tile;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.UtilityTool;

public class TileManager {
	
	GamePanel gp;
	public Tile[] tile;
	public int mapTileNum[][][];	
	boolean drawPath = false;
	
	public TileManager(GamePanel gp) {
		
		this.gp = gp;
		
		tile = new Tile[50];
		mapTileNum = new int[gp.maxMap][gp.maxWorldCol][gp.maxWorldRow];
	
		getTileImage();
		loadMap("/maps/FINALMAINMAP.txt" ,0);
		loadMap("/maps/interior01.txt", 1);
	}
	
	public void getTileImage() {

		setup(0, "earth", false);
		setup(1, "floor01", false);
		setup(2, "grass00", false);
		setup(3, "grass01", false);
		setup(4, "hut", false);
		setup(5, "road00", false);
		setup(6, "road01", false);
		setup(7, "road02", false);
		setup(8, "road03", false);
		setup(9, "road04", false);
		setup(10, "road05", false);
		setup(11, "road06", false);
		setup(12, "road07", false);
		setup(13, "road08", false);
		setup(14, "road09", false);
		setup(15, "road10", false);
		setup(16, "road11", false);
		setup(17, "road12", false);
		setup(18, "table01", true);
		setup(19, "tree", true);
		setup(20, "wall", true);
		setup(21, "water00", true);
		setup(22, "water01", true);
		setup(23, "water02", true);
		setup(24, "water03", true);
		setup(25, "water04", true);
		setup(26, "water05", true);
		setup(27, "water06", true);
		setup(28, "water07", true);
		setup(29, "water08", true);
		setup(30, "water09", true);
		setup(31, "water10", true);
		setup(32, "water11", true);
		setup(33, "water12", true);
		setup(34, "water13", true);
		setup(35, "xstairs", false);
		setup(36, "ystairs", false);
		setup(37, "zblack", true);
			
	}
	public void setup(int index, String imageName, boolean collision) {
		
		UtilityTool uTool = new UtilityTool();
		
		try {
			tile[index] = new Tile();
			tile[index].image = ImageIO.read(getClass().getResourceAsStream("/tiles/"+ imageName +".png"));
			tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize, gp.tileSize);
			tile[index].collision = collision;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void loadMap(String filePath, int map) {
		try {
			InputStream is = getClass().getResourceAsStream(filePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			int col = 0;
			int row = 0;
			
			while(col < gp.maxWorldCol && row < gp.maxWorldRow) {
				String line= br.readLine();
				
				while(col < gp.maxWorldCol) {
					String numbers[] = line.split(" ");
					
					int num = Integer.parseInt(numbers[col]);
					
					mapTileNum[map][col][row] = num;
					col++;
				}
				if(col == gp.maxWorldCol) {
					col = 0;
					row++;
				}
			}
			br.close();
			
		}catch(Exception e){
			
		}
	}
	public void draw(Graphics2D g2) {
		
		int worldCol = 0;
		int worldRow = 0;

		
		while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {
			
			int tileNum = mapTileNum[gp.currentMap][worldCol][worldRow];
			
			int worldX = worldCol * gp.tileSize;
			int worldY = worldRow * gp.tileSize;
			int screenX = worldX - gp.player.worldX + gp.player.screenX;
			int screenY = worldY - gp.player.worldY + gp.player.screenY;
			
			// Stop moving the camera at the edge
//			if(gp.player.screenX > gp.player.worldX) {
//				screenX = worldX;
//			}
//			if(gp.player.screenY > gp.player.worldY) {
//				screenY = worldY;
//			}9
//			int rightOffset = gp.screenWidth - gp.player.screenX;
//			if(rightOffset > gp.worldWidth - gp.player.worldX) {
//				screenX = gp.screenWidth - (gp.worldWidth - worldX);
//			}
//			int bottomOffset = gp.screenHeight - gp.player.screenY;
//			if(bottomOffset > gp.worldHeight - gp.player.worldY) {
//				screenY = gp.screenHeight - (gp.worldHeight - worldY);
//			}
						
			if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
			   worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
			   worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
			   worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {
				
				g2.drawImage(tile[tileNum].image, screenX, screenY, null);
				
			}
//			else if(gp.player.screenX > gp.player.worldX ||
//					gp.player.screenY > gp.player.worldY ||
//					rightOffset > gp.worldWidth - gp.player.worldX ||
//					bottomOffset > gp.worldHeight - gp.player.worldY) {
//				g2.drawImage(tile[tileNum].image, screenX, screenY, null);
//			}
			
			worldCol++;
			
			if(worldCol == gp.maxWorldCol) {
				worldCol = 0;
				worldRow++;
			}
		}
		
		if(drawPath == true) {
			g2.setColor(new Color(255,0,0,70));
			
			for(int i = 0; i < gp.pFinder.pathList.size(); i++) {
				
				int worldX = gp.pFinder.pathList.get(i).col * gp.tileSize;
				int worldY = gp.pFinder.pathList.get(i).row * gp.tileSize;
				int screenX = worldX - gp.player.worldX + gp.player.screenX;
				int screenY = worldY - gp.player.worldY + gp.player.screenY;
				
				g2.fillRect(screenX, screenY, gp.tileSize, gp.tileSize);
			}
		}
	}
}




















