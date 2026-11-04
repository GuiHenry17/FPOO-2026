package br.edu.utfpr.tsi.fpoo.tic_tac_toe;

import br.edu.utfpr.tsi.fpoo.tic_tac_toe.util.Terminal;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.view.AppView;

public class App {

    private App() {
        mount();
    }

    private void mount() {
        //todo
    }

    private void go() {
        Terminal.clear();
        AppView.showWelcome();
        
        try {
            Thread.sleep(15000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Terminal.clear();
        AppView.showGoodBye();
    }

    public static void main(String[] args) {
        App app = new App();
        app.go();
    }
}