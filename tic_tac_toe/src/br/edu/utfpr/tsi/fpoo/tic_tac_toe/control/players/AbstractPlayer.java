package br.edu.utfpr.tsi.fpoo.tic_tac_toe.control.players;

import br.edu.utfpr.tsi.fpoo.tic_tac_toe.control.Player;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.shared.Mark;

public abstract class AbstractPlayer implements Player {

	private String name;
	private Mark mark;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setMark(Mark mark) {
		this.mark = mark;
	}

	@Override
	public Mark getMark() {
		return mark;
	}
}
