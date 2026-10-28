package br.edu.utfpr.tsi.fpoo.tic_tac_toe.view;

import br.edu.utfpr.tsi.fpoo.tic_tac_toe.util.Terminal;

public class AppView {

	public void showWelcome(){
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@           _____     _____  _____  ___  _____  _____  ___  _____              @");
		System.out.println("@             |    |  |        |   |   | |        |   |   | |                  @");
		System.out.println("@             |    |  |        |   | = | |        |   |   | |====              @");
		System.out.println("@             |    |  |____    |   |   | |____    |   |___| |____              @");
		System.out.println("@______________________________________________________________________________@");
		System.out.println("@                                                                              @");
		System.out.println("@                            UTFPR - CAMPUS TOLEDO                             @");
		System.out.println("@              CURSO SUPERIOR DE TECNLOGIA EM SISTEMAS PARA INTERNET - TSI     @");
		System.out.println("@                   FUNDAMENTOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS             @");
		System.out.println("@                                                                              @");
		System.out.println("@                                   __|_|__                                    @");
		System.out.println("@                                   __|_|__                                    @");
		System.out.println("@                                     | |                                      @");
		System.out.println("@                                                                              @");
		System.out.println("@   EQUIPE                                                                     @");
		System.out.println("@                                                                              @");
		System.out.println("@   Guilherme Pereira Barbosa                                                  @");
		System.out.println("@   Guilherme Henrique Pereira                                                 @");
		System.out.println("@                                                                              @");
		System.out.println("@   ORIENTADOR                                                                 @");
		System.out.println("@    Prof. Dr. V. L. Dalle Molle                                               @");
		System.out.println("@                                                                              @");
		System.out.println("@                                                                              @");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@                                                                              @");
		System.out.println("@                                   2026-2                                     @");
		System.out.println("@                                                                              @");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		
	}
	
	public void showGoodBye(){
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@           _____     _____  _____  ___  _____  _____  ___  _____              @");
		System.out.println("@             |    |  |        |   |   | |        |   |   | |                  @");
		System.out.println("@             |    |  |        |   | = | |        |   |   | |====              @");
		System.out.println("@             |    |  |____    |   |   | |____    |   |___| |____              @");
		System.out.println("@______________________________________________________________________________@");
		System.out.println("@                                                                              @");
		System.out.println("@                            UTFPR - CAMPUS TOLEDO                             @");
		System.out.println("@              CURSO SUPERIOR DE TECNLOGIA EM SISTEMAS PARA INTERNET - TSI     @");
		System.out.println("@                   FUNDAMENTOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS             @");
		System.out.println("@                                                                              @");
		System.out.println("@                                   __|_|__                                    @");
		System.out.println("@                                   __|_|__                                    @");
		System.out.println("@                                     | |                                      @");
		System.out.println("@                                                                              @");
		System.out.println("@                       AAAAA DDDD  EEEEE U   U  SSSSS                         @");
		System.out.println("@                       A   A D   D E     U   U  S                             @");
		System.out.println("@                       AAAAA D   D EEEEE U   U   SSS                          @");
		System.out.println("@                       A   A D   D E     U   U      S                         @");
		System.out.println("@                       A   A DDDD  EEEEE UUUUU  SSSSS                         @");
		System.out.println("@                                                                              @");
		System.out.println("@                                                                              @");
		System.out.println("@                                                                              @");
		System.out.println("@                                                                              @");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@                                                                              @");
		System.out.println("@                                   2026-2                                     @");
		System.out.println("@                                                                              @");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		
	}
	
	public void showInformation(String message) {
		 Terminal.setBackgroundColor(Terminal.BG_BRIGHT_BRANCO);
	     Terminal.setTextColor(Terminal.BLUE);
	     System.out.println(message);
	}
	
	public void showAlert(String message) {
		 Terminal.setBackgroundColor(Terminal.BG_MAGENTA);
	     Terminal.setTextColor(Terminal.YELLOW);
	     System.out.println(message);
	}
	
	public void showError(String message) {
		 Terminal.setBackgroundColor(Terminal.BG_YELLOW);
	     Terminal.setTextColor(Terminal.RED);
	     System.out.println(message);
	}
	
    public void congratulateWinner(String mark) {
    	Terminal.setBackgroundColor(Terminal.BG_BRIGHT_BRANCO);
    	Terminal.setTextColor(Terminal.RED);
        System.out.println("************************************************************");
        System.out.println("                   VITÓRIA! O PLAYER " + mark + " GANHA!               ");
        System.out.println("************************************************************");
    }
	
	public static void main (String args[]) {
		AppView game = new AppView();
		game.showWelcome();
		game.showGoodBye();
		game.showInformation("Informação!");
		game.showAlert("Alerta!");
		game.showError("Erro!");
		game.congratulateWinner("X");
		
	}
	
}
