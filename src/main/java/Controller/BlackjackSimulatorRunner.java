package Controller;

import domain.BlackjackGame;
import domain.BlackjackSimulator;

public class BlackjackSimulatorRunner {

    private final BlackjackSimulator blackjackSimulator;

    public BlackjackSimulatorRunner(BlackjackSimulator blackjackSimulator) {
        this.blackjackSimulator = blackjackSimulator;
    }

    public void run() {
        BlackjackGame notPlayedGame = blackjackSimulator.createNotPlayedGame();
        BlackjackGame initializeHandOutGame = blackjackSimulator.InitialHandOutGame(notPlayedGame);
        BlackjackGame handOutPlayersGame = blackjackSimulator.handOutPlayers(initializeHandOutGame);
        BlackjackGame handOutDealerGame = blackjackSimulator.handOutDealer(handOutPlayersGame);
        blackjackSimulator.decideWinOrLose(handOutDealerGame);
    }
}
