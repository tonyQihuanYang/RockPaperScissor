package org.rockpaperscissor;

public class Main {
    private static final String PAPER = "paper";
    private static final String ROCK = "rock";
    private static final String SCISSOR = "scissor";


    public static String rockpaperscissorgame(String p1, String p2) {
        if (p1 == p2) { return p1;}
        if (p1 == "paper" && p2 == "scissor") {
            return p2;
        }
        if (p1 == ROCK && p2 == PAPER) {
            return p2;
        }

        if (p2 == PAPER && p1 != ROCK && p1 != SCISSOR) {
            return p2;
        }

        if (p2 == PAPER && p1 == SCISSOR) {
            return p1;
        }

        return p1;
    }

    public static String rockpaperscissorgame(String... players) {
        if (players[0].equals("blahblahblah")) {
            throw new InvalidInputException("I win");
        }

        return players[2];
    }
}