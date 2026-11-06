package br.edu.utfpr.tsi.fpoo.tic_tac_toe;

import br.edu.utfpr.tsi.fpoo.tic_tac_toe.control.GameControl;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.model.GameTable;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.util.Terminal;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.util.TimeUtils;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.view.AppView;
import br.edu.utfpr.tsi.fpoo.tic_tac_toe.view.GameView;

public class App {
	
	private AppView appView;
	
	private GameView gameView;
	private GameTable gameTable;
	private GameControl gameControl;

    private void mount() {
        
    	gameView = new GameView();
    	gameTable = new GameTable();
    	gameControl = new GameControl(gameView, gameTable);
    }
    

    private App() {
    	appView = new AppView();
        mount();
    }


    private void go() {
        Terminal.clear();
        appView.showWelcome();
        TimeUtils.pauseSeconds(10);
        Terminal.clear();
        gameControl.go();
        TimeUtils.pauseSeconds(3);
        Terminal.clear();
        appView.showGoodBye();
    }

    public static void main(String[] args) {
        App app = new App();
        app.go();
    }
}