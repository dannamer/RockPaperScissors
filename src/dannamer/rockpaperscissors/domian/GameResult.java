package dannamer.rockpaperscissors.domian;

public class GameResult {

    public static void printGameResult(Player playerOne, Player playerTwo) {
        if (playerOne.getScore() > playerTwo.getScore()) {
            System.out.println(playerOne.getName() + " победил с счетом " + playerOne.getScore() + " против " + playerTwo.getScore());
        } else {
            System.out.println(playerTwo.getName() + " победил с счетом " + playerTwo.getScore() + " против " + playerOne.getScore());
        }
    }

    public static void printCurrentScore(Player playerOne, Player playerTwo) {
        System.out.println(playerOne.getName() + " " + playerOne.getScore() + " : " + playerTwo.getScore() + " " + playerTwo.getName());
    }
}
