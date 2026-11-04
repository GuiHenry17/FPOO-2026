package br.edu.utfpr.tsi.fpoo.tic_tac_toe.view;

import br.edu.utfpr.tsi.fpoo.tic_tac_toe.App;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.shared.Mark;

public class GameView {
	private int xPos;
	private int yPos;
	
	private static String BLANK_LINE = "     |     |     ";
	private static String VALUES_LINE = "   %s   |    %s  |    %s  ";
	private static String HASH_LINE = "_____|_____|_____";
	
	public void setPosition (Integer x, Integer y) {
		this.xPos = x;
		this.yPos = y;
	}
	
	public void showTable(Mark[][] table) {
		System.out.println(BLANK_LINE);
		System.out.println(BLANK_LINE);
		System.out.println(HASH_LINE);
		System.out.println(BLANK_LINE);
		System.out.println(BLANK_LINE);
		System.out.println(HASH_LINE);
		System.out.println(BLANK_LINE);
		System.out.println(BLANK_LINE);
		System.out.println(BLANK_LINE);
	}

	public static void main(String[] args) {
        GameView app = new GameView();
        app.showTable(null);
    }
}
