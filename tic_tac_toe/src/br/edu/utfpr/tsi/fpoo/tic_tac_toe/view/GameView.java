package br.edu.utfpr.tsi.fpoo.tic_tac_toe.view;

import br.edu.utfpr.tsi.fpoo.tic_tac_toe.model.GameTable;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.shared.Mark;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.util.Terminal;

public class GameView {

	private static final String BLANK_LINE = "     |     |     ";
	private static final String VALUES_LINE = "  %s  |  %s  |  %s  ";
	private static final String HASH_LINE = "_____|_____|_____";

	private int xPos;
	private int yPos;

	public void setPosition(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public void showTable(Mark[][] table) {
		Terminal.gotoXY(xPos, yPos);
		System.out.println(BLANK_LINE);
		Terminal.gotoXY(xPos, yPos + 1);
		System.out.println(String.format(VALUES_LINE, table[0][0], table[0][1], table[0][2]));
		Terminal.gotoXY(xPos, yPos + 2);
		System.out.println(HASH_LINE);

		Terminal.gotoXY(xPos, yPos + 3);
		System.out.println(BLANK_LINE);
		Terminal.gotoXY(xPos, yPos + 4);
		System.out.println(String.format(VALUES_LINE, table[1][0], table[1][1], table[1][2]));
		Terminal.gotoXY(xPos, yPos + 5);
		System.out.println(HASH_LINE);

		Terminal.gotoXY(xPos, yPos + 6);
		System.out.println(BLANK_LINE);
		Terminal.gotoXY(xPos, yPos + 7);
		System.out.println(String.format(VALUES_LINE, table[2][0], table[2][1], table[2][2]));
		Terminal.gotoXY(xPos, yPos + 8);
		System.out.println(BLANK_LINE);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		GameTable gameTable = new GameTable();
		gameTable.reset();
		gameTable.setMark(0, 0, Mark.X);
		gameTable.setMark(0, 1, Mark.O);
		gameTable.setMark(0, 2, Mark.X);
		gameTable.setMark(1, 0, Mark.O);
		gameTable.setMark(1, 1, Mark.X);
		gameTable.setMark(1, 2, Mark.O);
		gameTable.setMark(2, 0, Mark.X);
		gameTable.setMark(2, 1, Mark.O);
		gameTable.setMark(2, 2, Mark.X);

		GameView gameView = new GameView();
		gameView.setPosition(10, 5);

		Terminal.clear();
		gameView.showTable(gameTable.getAll());
	}
}
