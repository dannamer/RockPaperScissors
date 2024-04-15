package dannamer.rockpaperscissors.main;

import dannamer.rockpaperscissors.logic.GameLogic;
import dannamer.rockpaperscissors.domian.Player;
import dannamer.rockpaperscissors.domian.HandTypes;
import dannamer.rockpaperscissors.domian.GameResult;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        HandTypes hand = new HandTypes();

        Scanner scanner = new Scanner(System.in);

        Player playerOne = new Player("Хасбик");
        Player playerTwo = new Player("Хабиб");

        GameLogic gameLogic = new GameLogic(hand.getSubTypesList().size());

        while (playerOne.getScore() < 3 && playerTwo.getScore() < 3) {
            GameResult.printCurrentScore(playerOne, playerTwo);
            hand.printHandTypes();

            System.out.print("Выбор " + playerOne.getName() + ": ");
            playerOne.chooseSign(scanner.nextInt());

            System.out.print("Выбор " + playerTwo.getName() + ": ");
            playerTwo.chooseSign(scanner.nextInt());

            gameLogic.playRound(playerOne, playerTwo);

        }

        // Выводим итоговый результат игры
        if (playerOne.getScore() == 3) {
            System.out.println(playerOne.getName() + " побеждает игру!");
        } else {
            System.out.println(playerTwo.getName() + " побеждает игру!");
        }
    }
}
