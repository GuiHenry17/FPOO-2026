package br.edu.utfpr.tsi.fpoo.tic_tac_toe.shared;

public enum Mark {

	X, O, BLANK;
	
	@Override
	public String toString() {
		return (this == BLANK) ? " " : super.toString();	
		}
}
