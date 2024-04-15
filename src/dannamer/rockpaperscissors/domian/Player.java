package dannamer.rockpaperscissors.domian;

public class Player {
    private final String name;
    private int chosenSign;
    private int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void chooseSign(int signIndex) {
        chosenSign = signIndex - 1;
    }

    public int getChosenSign() {
        return chosenSign;
    }

    public int getScore() {
        return score;
    }

    public void win() {
        score++;
    }
}
