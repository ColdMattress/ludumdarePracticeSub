package game;

import javax.swing.JFrame;

public class Game {
	
	private JFrame main;
	
	public Game(){
		
		main = new JFrame("Game");
		main.setSize(400,400);
		
		main.setVisible(true);
	}
	
	public static void main(String[] args){
		new Game();
	}
	
}
