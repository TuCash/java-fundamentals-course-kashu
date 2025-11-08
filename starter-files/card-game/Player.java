import java.util.ArrayList;
import java.util.List;

/**
 * Represents a player in the card game.
 */
public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard(int index) {
        if (index >= 0 && index < hand.size()) {
            return hand.remove(index);
        }
        return null;
    }

    public List<Card> getHand() {
        return new ArrayList<>(hand);
    }

    public String getName() {
        return name;
    }

    public int handSize() {
        return hand.size();
    }

    @Override
    public String toString() {
        return name + "'s hand: " + hand;
    }
}