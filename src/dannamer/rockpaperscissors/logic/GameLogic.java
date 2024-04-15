package dannamer.rockpaperscissors.logic;

import dannamer.rockpaperscissors.domian.Player;

public class GameLogic {
    private final int numberOfHands; // Общее количество фигур в игре

    public GameLogic(int numberOfHands) {
        this.numberOfHands = numberOfHands;
    }

    public void playRound(Player playerOne, Player playerTwo) {
        int OneHand = playerOne.getChosenSign();
        int TwoHand = playerTwo.getChosenSign();

        if (OneHand == TwoHand) {
            System.out.println("Ничья!");
            return;
        }

        int result = (numberOfHands + OneHand - TwoHand) % numberOfHands;

        if (result <= numberOfHands / 2) {
            System.out.println(playerOne.getName() + " побеждает Раунд!");
            playerOne.win();
        } else {
            System.out.println(playerTwo.getName() + " побеждает Раунд!");
            playerTwo.win();
        }
    }
}
