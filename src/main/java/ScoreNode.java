// Fernando Branco
// CIS 2353
// Fall 2021
// Project 2

public class ScoreNode {

    private String name;
    private int score;
    private ScoreNode nextNode;


        ScoreNode(String name, int score) {
            this.score = score;
            this.name = name;
            this.nextNode = null;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ScoreNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ScoreNode nextNode) {
        this.nextNode = nextNode;
    }
}

