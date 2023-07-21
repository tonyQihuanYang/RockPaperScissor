package org.rockpaperscissor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test_when_given_rock_and_scissor_returns_winner() {
        String player1 = "rock";
        String player2 = "scissor";

        assertEquals(Main.rockpaperscissorgame(player1, player2), player1);
    }

    @Test
    void test_when_given_rock_and_paper_returns_paper() {
        String player1 = "rock";
        String player2 = "paper";

        assertEquals(Main.rockpaperscissorgame(player1, player2), player2); 
    }

    @Test
    void test_when_given_paper_and_scissor_returns_winner() {
        String player1 = "paper";
        String player2 = "scissor";

        assertEquals(Main.rockpaperscissorgame(player1, player2), player2);
    }

    @Test
    void test_when_given_scissor_and_paper_returns_winner() {
        String player1 = "scissor";
        String player2 = "paper";

        assertEquals(Main.rockpaperscissorgame(player1, player2), player1);
    }

    @Test
    void test_when_given_scissor_and_scissor_returns_scissor() {
        String player1 = "scissor";
        String player2 = "scissor";

        assertEquals(Main.rockpaperscissorgame(player1, player2), player1);
    }

    @Test
    void test_when_given_paper_and_rock_and_rock_returns_rock() {
        String player1 = "rock";
        String player2 = "rock";
        String player3 = "paper";

        assertEquals(Main.rockpaperscissorgame(player1, player2, player3), player3);
    }

    @Test
    void test_when_given_invalid_inputs_throws_exception() {
        String player1 = "blahblahblah";
        String player2 = "rock";
        String player3 = "paper";

        assertThrows(InvalidInputException.class, () -> Main.rockpaperscissorgame(player1, player2, player3));
    }
}