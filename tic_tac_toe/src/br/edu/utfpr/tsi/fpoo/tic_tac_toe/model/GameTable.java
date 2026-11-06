package br.edu.utfpr.tsi.fpoo.tic_tac_toe.model;

import static br.edu.utfpr.tsi.fpoo.tic_tac_toe.shared.Mark.*;

import br.edu.utfpr.tsi.fpoo.tic_tac_toe.shared.Mark;

public class GameTable {
	
	private Mark[][] table = new Mark[3][3];
	
	public void reset() {

		for(int lin=0; lin<3; lin++) {
			for (int col=0; col<3; col++) {
				table[lin][col] = BLANK;
			}
		}
	}
	
	public Mark getMark(Integer lin, Integer col) {
		return table[lin][col];
	}
	
	public void setMark(Integer lin, Integer col, Mark mark) {
		table[lin][col] = mark;
	}
	
	public Mark[][] getAll() {
		return table.clone();
	}
	
}
