package br.edu.utfpr.tsi.fpoo.tic_tac_toe.view;

import br.edu.utfpr.tsi.fpoo.tic_tac_toe.util.Terminal;

public class AppView {

    public static void showWelcome() {
        Terminal.resetAll();
        Terminal.setTextColor(Terminal.CYAN);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@            _____     _____  _____  ___  _____  _____  ___  _____              @");
        System.out.println("@              |    |  |        |   |   | |        |   |   | |                  @");
        System.out.println("@              |    |  |        |   | = | |        |   |   | |====              @");
        System.out.println("@              |    |  |____    |   |   | |____    |   |___| |____              @");
        System.out.println("@______________________________________________________________________________ @");
        System.out.println("@                                                                               @");
        Terminal.setTextColor(Terminal.YELLOW);
        System.out.println("@                            UTFPR - CAMPUS TOLEDO                              @");
        System.out.println("@              CURSO SUPERIOR DE TECNOLOGIA EM SISTEMAS PARA INTERNET - TSI     @");
        System.out.println("@                   FUNDAMENTOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS              @");
        Terminal.setTextColor(Terminal.CYAN);
        System.out.println("@                                                                               @");
        System.out.println("@                                   __|_|__                                     @");
        System.out.println("@                                   __|_|__                                     @");
        System.out.println("@                                     | |                                       @");
        System.out.println("@                                                                               @");
        Terminal.setTextColor(Terminal.GREEN);
        System.out.println("@   EQUIPE                                                                      @");
        System.out.println("@                                                                               @");
        System.out.println("@   Guilherme Pereira Barbosa                                                   @");
        System.out.println("@   Guilherme Henrique Pereira                                                  @");
        System.out.println("@                                                                               @");
        System.out.println("@   ORIENTADOR                                                                  @");
        System.out.println("@    Prof. Dr. V. L. Dalle Molle                                                @");
        Terminal.setTextColor(Terminal.CYAN);
        System.out.println("@                                                                               @");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@                                                                               @");
        System.out.println("@                                   2026-2                                      @");
        System.out.println("@                                                                               @");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Terminal.resetAll();
    }

    public static void showGoodBye() {
        Terminal.resetAll();
        Terminal.setTextColor(Terminal.MAGENTA);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@            _____     _____  _____  ___  _____  _____  ___  _____              @");
        System.out.println("@              |    |  |        |   |   | |        |   |   | |                  @");
        System.out.println("@              |    |  |        |   | = | |        |   |   | |====              @");
        System.out.println("@              |    |  |____    |   |   | |____    |   |___| |____              @");
        System.out.println("@______________________________________________________________________________ @");
        System.out.println("@                                                                               @");
        Terminal.setTextColor(Terminal.YELLOW);
        System.out.println("@                            UTFPR - CAMPUS TOLEDO                              @");
        System.out.println("@              CURSO SUPERIOR DE TECNOLOGIA EM SISTEMAS PARA INTERNET - TSI     @");
        System.out.println("@                   FUNDAMENTOS DE PROGRAMAÇÃO ORIENTADA A OBJETOS              @");
        Terminal.setTextColor(Terminal.MAGENTA);
        System.out.println("@                                                                               @");
        System.out.println("@                                   __|_|__                                     @");
        System.out.println("@                                   __|_|__                                     @");
        System.out.println("@                                     | |                                       @");
        System.out.println("@                                                                               @");
        Terminal.setTextColor(Terminal.BRIGHT_MAGENTA);
        System.out.println("@                       AAAAA DDDD  EEEEE U   U  SSSSS                          @");
        System.out.println("@                       A   A D   D E     U   U  S                              @");
        System.out.println("@                       AAAAA D   D EEEEE U   U   SSS                           @");
        System.out.println("@                       A   A D   D E     U   U      S                          @");
        System.out.println("@                       A   A DDDD  EEEEE UUUUU  SSSSS                          @");
        Terminal.setTextColor(Terminal.MAGENTA);
        System.out.println("@                                                                               @");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("@                                                                               @");
        System.out.println("@                                   2026-2                                      @");
        System.out.println("@                                                                               @");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Terminal.resetAll();
    }

    public void showInformation(String msg) {
        Terminal.resetAll();
        Terminal.setTextColor(Terminal.BLUE);
        Terminal.setBackgroundColor(Terminal.BG_WHITE);
        System.out.println(" [INFORMAÇÃO] " + msg + " ");
        Terminal.resetAll();
    }

    public void showAlert(String msg) {
        Terminal.resetAll();
        Terminal.setTextColor(Terminal.YELLOW);
        Terminal.setBackgroundColor(Terminal.BG_MAGENTA);
        System.out.println(" [ALERTA] " + msg + " ");
        Terminal.resetAll();
    }

    public void showError(String msg) {
        Terminal.resetAll();
        Terminal.setTextColor(Terminal.RED);
        Terminal.setBackgroundColor(Terminal.BG_YELLOW);
        System.out.println(" [ERRO] " + msg + " ");
        Terminal.resetAll();
    }

    public void congratulateWinner(String mark) {
        Terminal.resetAll();
        Terminal.setTextColor(Terminal.BRIGHT_VERDE);
        System.out.println(" Meus parabéns! O player '" + mark + "', com sua técnica infálivel, dominou o jogo e venceu!");
        Terminal.resetAll();
    }

    public void declareTie() {
        Terminal.resetAll();
        Terminal.setTextColor(Terminal.BRIGHT_AMARELO);
        System.out.println("  Poxa vida, deu velha! Empate, ambos deram seu melhor!");
        Terminal.resetAll();
    }

    public void consoleLoser(String mark) {
        Terminal.resetAll();
        Terminal.setTextColor(Terminal.BRIGHT_RED);
        System.out.println("  Que pena, player '" + mark + "'! Não desista, você vai ganhar da próxima vez!");
        Terminal.resetAll();
    }
    
}