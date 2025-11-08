import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main class that implements a simple card game.
 * Players take turns drawing cards and the highest card wins each round.
 */
public class CardGame {
    private List<Player> players;
    private Deck deck;
    private Scanner scanner;

    public CardGame() {
        players = new ArrayList<>();
        deck = new Deck();
        scanner = new Scanner(System.in);
    }

    public void initializePlayers() {
        System.out.println("Welcome to the Card Game!");
        System.out.print("Enter number of players (2-4): ");
        int numPlayers = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 1; i <= numPlayers; i++) {
            System.out.print("Enter name for Player " + i + ": ");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }
    }

    public void playGame() {
        deck.shuffle();
        
        // Deal 5 cards to each player
        for (int i = 0; i < 5; i++) {
            for (Player player : players) {
                Card card = deck.drawCard();
                if (card != null) {
                    player.addCard(card);
                }
            }
        }

        int round = 1;
        while (players.get(0).handSize() > 0) {
            System.out.println("\nRound " + round);
            playRound();
            round++;
        }

        System.out.println("\nGame Over!");
    }

    private void playRound() {
        List<Card> playedCards = new ArrayList<>();
        
        // Each player plays a card
        for (Player player : players) {
            System.out.println("\n" + player);
            System.out.print(player.getName() + ", choose a card to play (1-" + player.handSize() + "): ");
            int choice = scanner.nextInt() - 1;
            Card played = player.playCard(choice);
            System.out.println(player.getName() + " played: " + played);
            playedCards.add(played);
        }

        // Determine the winner of the round
        int winningIndex = 0;
        for (int i = 1; i < playedCards.size(); i++) {
            if (compareCards(playedCards.get(i), playedCards.get(winningIndex)) > 0) {
                winningIndex = i;
            }
        }

        System.out.println("\n" + players.get(winningIndex).getName() + " wins the round!");
    }

    private int compareCards(Card card1, Card card2) {
        // Simple comparison: compare ranks only
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int rank1 = java.util.Arrays.asList(ranks).indexOf(card1.getRank());
        int rank2 = java.util.Arrays.asList(ranks).indexOf(card2.getRank());
        return Integer.compare(rank1, rank2);
    }

    public static void main(String[] args) {
        CardGame game = new CardGame();
        game.initializePlayers();
        game.playGame();
    }
}