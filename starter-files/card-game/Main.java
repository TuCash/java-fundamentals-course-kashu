/*
 Main.java — single-file console card game that compiles on OnlineGDB

 Paste into OnlineGDB (filename: Main.java) and Run.
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}

/* ---------- Game logic ---------- */
class Game {
    private final Scanner scanner = new Scanner(System.in);
    private final Deck deck = new Deck();
    private final List<Player> players = new ArrayList<>();
    private final Map<Player, Integer> score = new HashMap<>();

    public void start() {
        System.out.println("=== Simple Console Card Game ===");
        int numPlayers = askInt("Enter number of players (2-4): ", 2, 4);

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter name for player " + i + ": ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) name = "Player" + i;
            Player p = new Player(name);
            players.add(p);
            score.put(p, 0);
        }

        deck.shuffle();
        dealInitialHands(5);

        int round = 1;
        while (players.get(0).handSize() > 0) {
            System.out.println("\n--- Round " + round + " ---");
            playRound();
            round++;
        }

        announceFinalWinner();
    }

    private void dealInitialHands(int cardsEach) {
        for (int i = 0; i < cardsEach; i++) {
            for (Player p : players) {
                Card c = deck.drawCard();
                if (c != null) p.addCard(c);
            }
        }
    }

    private void playRound() {
        List<Card> played = new ArrayList<>();
        for (Player p : players) {
            System.out.println("\n" + p.getName() + "'s hand:");
            p.printHandWithIndices();
            int choice = askInt(p.getName() + ", choose a card index to play (1-" + p.handSize() + "): ", 1, p.handSize()) - 1;
            Card c = p.playCard(choice);
            System.out.println(p.getName() + " played: " + c);
            played.add(c);
        }

        int winIdx = 0;
        for (int i = 1; i < played.size(); i++) {
            if (compareCards(played.get(i), played.get(winIdx)) > 0) {
                winIdx = i;
            }
        }
        Player winner = players.get(winIdx);
        System.out.println("\n" + winner.getName() + " wins the round!");
        score.put(winner, score.get(winner) + 1);
        printScores();
    }

    private void printScores() {
        System.out.println("\nCurrent scores:");
        for (Player p : players) {
            System.out.println(p.getName() + ": " + score.get(p));
        }
    }

    private void announceFinalWinner() {
        System.out.println("\n=== Game Over ===");
        int max = Collections.max(score.values());
        List<Player> winners = new ArrayList<>();
        for (Map.Entry<Player, Integer> e : score.entrySet()) {
            if (e.getValue() == max) winners.add(e.getKey());
        }
        if (winners.size() == 1) {
            System.out.println("Overall winner: " + winners.get(0).getName() + " with " + max + " rounds won!");
        } else {
            System.out.print("It's a tie between: ");
            for (int i = 0; i < winners.size(); i++) {
                System.out.print(winners.get(i).getName());
                if (i < winners.size() - 1) System.out.print(", ");
            }
            System.out.println(" (each with " + max + " wins)");
        }
    }

    private int compareCards(Card c1, Card c2) {
        return Integer.compare(c1.rankValue(), c2.rankValue());
    }

    private int askInt(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            try {
                int val = Integer.parseInt(line);
                if (val < min || val > max) {
                    System.out.println("Please enter a number between " + min + " and " + max + ".");
                    continue;
                }
                return val;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number, try again.");
            }
        }
    }
}

/* ---------- Player ---------- */
class Player {
    private final String name;
    private final List<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card c) {
        if (c != null) hand.add(c);
    }

    public Card playCard(int index) {
        if (index >= 0 && index < hand.size()) {
            return hand.remove(index);
        }
        return null;
    }

    public int handSize() {
        return hand.size();
    }

    public String getName() {
        return name;
    }

    public void printHandWithIndices() {
        for (int i = 0; i < hand.size(); i++) {
            System.out.println((i + 1) + ") " + hand.get(i));
        }
    }

    @Override
    public String toString() {
        return name + "'s hand: " + hand;
    }
}

/* ---------- Deck & Card ---------- */
class Deck {
    private final List<Card> cards = new ArrayList<>();
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

    public Deck() {
        for (String s : SUITS) {
            for (String r : RANKS) {
                cards.add(new Card(s, r));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) return null;
        return cards.remove(0);
    }

    public int remaining() {
        return cards.size();
    }
}

class Card {
    private final String suit;
    private final String rank;
    private static final Map<String, Integer> RANK_VALUE;
    static {
        RANK_VALUE = new HashMap<>();
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        for (int i = 0; i < ranks.length; i++) {
            RANK_VALUE.put(ranks[i], i + 2); // 2 -> 2, Ace -> 14
        }
    }

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int rankValue() {
        return RANK_VALUE.getOrDefault(rank, 0);
    }

    public String toString() {
        return rank + " of " + suit;
    }
}
