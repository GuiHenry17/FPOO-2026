package br.edu.utfpr.tsi.fpoo.tic_tac_toe.control;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.edu.utfpr.tsi.fpoo.tic_tac_toe.model.GameTable;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.shared.Mark;

import static br.edu.utfpr.tsi.fpoo.tic_tac_toe.shared.Mark.*;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.util.TimeUtils;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.view.GameView;

public class GameControl {
	
	private final GameView gameView;
	private final GameTable gameTable;
	
	public GameControl(GameView gameView, GameTable gameTable) {
		super();
		this.gameView = gameView;
		this.gameTable = gameTable;
	}
	
	public void go() {
		gameTable.reset();
		gameView.showTable(gameTable.getAll());
		
		playRandom();
	}
	
	private void playRandom() {
		
		Integer[][] positions = {{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
		List<Integer[]> list = Arrays.asList(positions);
		Collections.shuffle(list);
		Mark mark = X;
		for(Integer[] pos : list) {
			gameTable.setMark(pos[0], pos[1], mark);
			gameView.showTable(gameTable.getAll());
			TimeUtils.pauseSeconds(5);
			mark = (mark == X) ? O : X;
		}
	}
}
