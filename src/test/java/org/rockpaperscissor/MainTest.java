package org.rockpaperscissor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class MainTest {

  @Test
  void game_whenTwoPlayers_withSameHand_tied() {
    Player p1 = new Player("P1", HAND.ROCK);
    Player p2 = new Player("P2", HAND.ROCK);

    assertEquals(Main.rockpaperscissorgame(List.of(p1, p2)), Main.TIED);
  }

  @Test
  void game_whenMoreThanTwoPlayers_withThreeHand_tied() {
    Player p1 = new Player("P1", HAND.ROCK);
    Player p2 = new Player("P2", HAND.PAPER);
    Player p3 = new Player("P3", HAND.SCISSOR);

    assertEquals(Main.rockpaperscissorgame(List.of(p1, p2, p3)), Main.TIED);
  }

  @Test
  void game_whenTwoPlayers_withRockAndPaper_paperWin() {
    Player p1 = new Player("P1", HAND.ROCK);
    Player p2 = new Player("P2", HAND.PAPER);

    assertEquals(Main.rockpaperscissorgame(List.of(p1, p2)), p2.getName());
  }

  @Test
  void game_whenTwoPlayers_withRockAndScissor_RockWin() {
    Player p1 = new Player("P1", HAND.ROCK);
    Player p2 = new Player("P2", HAND.SCISSOR);

    assertEquals(Main.rockpaperscissorgame(List.of(p1, p2)), p1.getName());
  }

  @Test
  void game_whenTwoPlayers_withPaperAndScissor_scissorWin() {
    Player p1 = new Player("P1", HAND.PAPER);
    Player p2 = new Player("P2", HAND.SCISSOR);

    assertEquals(Main.rockpaperscissorgame(List.of(p1, p2)), p2.getName());
  }

  @Test
  void game_whenMoreThanTwoPlayers_withRockAndPaper_paperWin() {
    Player p1 = new Player("P1", HAND.ROCK);
    Player p2 = new Player("P2", HAND.PAPER);
    Player p3 = new Player("P3", HAND.ROCK);
    Player p4 = new Player("P4", HAND.PAPER);
    String expectedWinnerNames = p2.getName() + ", " + p4.getName();

    assertEquals(Main.rockpaperscissorgame(List.of(p1, p2, p3, p4)), expectedWinnerNames);
  }

  @Test
  void game_whenMoreThanTwoPlayers_withScissorAndPaper_scissorWin() {
    Player p1 = new Player("P1", HAND.SCISSOR);
    Player p2 = new Player("P2", HAND.PAPER);
    Player p3 = new Player("P3", HAND.SCISSOR);
    Player p4 = new Player("P4", HAND.PAPER);
    Player p5 = new Player("P4", HAND.PAPER);
    String expectedWinnerNames = p1.getName() + ", " + p3.getName();

    assertEquals(Main.rockpaperscissorgame(List.of(p1, p2, p3, p4, p5)), expectedWinnerNames);
  }

  @Test
  void game_whenMoreThanTwoPlayers_withScissorAndRock_RockWin() {
    Player p1 = new Player("P1", HAND.SCISSOR);
    Player p2 = new Player("P2", HAND.ROCK);
    Player p3 = new Player("P3", HAND.SCISSOR);
    Player p4 = new Player("P4", HAND.SCISSOR);
    Player p5 = new Player("P4", HAND.SCISSOR);
    String expectedWinnerNames = p2.getName();

    assertEquals(Main.rockpaperscissorgame(List.of(p1, p2, p3, p4, p5)), expectedWinnerNames);
  }

  @Test
  void game_whenMoreThanTwoPlayers_withScissorAndPaper_paperWin() {
    Player p1 = new Player("P1", HAND.SCISSOR);
    Player p2 = new Player("P2", HAND.PAPER);
    Player p3 = new Player("P3", HAND.SCISSOR);
    String expectedWinnerNames = p1.getName() + ", " + p3.getName();

    assertEquals(Main.rockpaperscissorgame(List.of(p1, p2, p3)), expectedWinnerNames);
  }
}
