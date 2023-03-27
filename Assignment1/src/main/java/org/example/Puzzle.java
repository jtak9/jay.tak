package org.example;

public class Puzzle {
    private String pzlID;
    private String pzlQues;
    private String pzlAns;
    private String pzlPassed;
    private String pzlFailed;
    private int attempts;
    private boolean pzlSolved;

    public Puzzle (String pzlID, String pzlQues, String pzlAns, String pzlPassed, String pzlFailed,
                   int attempts, boolean pzlSolved) {
        this.pzlID = pzlID;
        this.pzlQues = pzlQues;
        this.pzlAns = pzlAns;
        this.pzlPassed = pzlPassed;
        this.pzlFailed = pzlFailed;
        this.attempts = attempts;
        this.pzlSolved = pzlSolved;
    }

    public String getPzlID() {
        return pzlID;
    }

    public String getPzlQues() {
        return pzlQues;
    }

    public String getPzlAns() {
        return pzlAns;
    }

    public String getPzlPassed() {
        return pzlPassed;
    }

    public String getPzlFailed() {
        return pzlFailed;
    }

    public int getAttempts() {
        return attempts;
    }

    public boolean isPzlSolved() {
        return pzlSolved;
    }

    public void setPzlSolved() {
        this.pzlSolved = true;
    }
}