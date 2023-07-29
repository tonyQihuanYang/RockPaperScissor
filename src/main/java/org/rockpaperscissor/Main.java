package org.rockpaperscissor;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
  public static final String TIED = "TIED";

  public static String rockpaperscissorgame(List<Player> players) {
    Set<HAND> handSets = players.stream().map(Player::getHand).collect(Collectors.toSet());
    if (isTie(handSets)) {
      return TIED;
    }
    HAND winnerHand = getWinnerHand(handSets);
    String winners = players.stream().filter(player -> player.getHand().equals(winnerHand)).map(Player::getName).reduce(
        "",
        (winnierNames, name) -> winnierNames += name + ", ");
    return winners.substring(0, winners.length() - 2);
  }

  private static boolean isTie(Set<HAND> handSets) {
    if (handSets.size() == 1 || handSets.size() == 3) {
      return true;
    }
    return false;
  }

  private static HAND getWinnerHand(Set<HAND> handSets) {
    if (handSets.containsAll(List.of(HAND.PAPER, HAND.ROCK))) {
      return HAND.PAPER;
    }
    if (handSets.containsAll(List.of(HAND.SCISSOR, HAND.ROCK))) {
      return HAND.ROCK;
    }
    if (handSets.containsAll(List.of(HAND.PAPER, HAND.SCISSOR))) {
      return HAND.SCISSOR;
    }
    // TODO: throw execption if happen?
    return HAND.SCISSOR;
  }
}

enum HAND {
  PAPER,
  ROCK,
  SCISSOR
}

class Player {
  private String name;
  private HAND hand;

  public Player(String name, HAND hand) {
    this.name = name;
    this.hand = hand;
  }

  public String getName() {
    return name;
  }

  public HAND getHand() {
    return hand;
  }
}
