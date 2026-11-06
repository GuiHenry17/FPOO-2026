package br.edu.utfpr.tsi.fpoo.tic_tac_toe.control;

import br.edu.utfpr.tsi.fpoo.tic_tac_toe.shared.BoardPosition;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.shared.Mark;

public interface Player {

	BoardPosition play();

	void setName(String name);

	String getName();

	void setMark(Mark mark);

	Mark getMark();
}
