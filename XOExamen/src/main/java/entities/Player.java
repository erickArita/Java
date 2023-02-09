package entities;

public class Player {

    private String name;
    private String mark;
    private int wins = 0;
    private int losses = 0;

    public Player(String name, int wins, int losses, String mark) {
        this.name = name;
        this.mark = mark;
        this.wins = wins;
        this.losses = losses;
    }

    public Player(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }


    public String getName() {
        return name;
    }

    public void win() {
        wins++;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void lose() {
        losses++;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public String getMark() {
        return mark;
    }

}
