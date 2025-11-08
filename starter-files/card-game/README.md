# Card Game Project

This is a simple console-based card game implementation in Java. The game allows 2-4 players to play a card game where each player is dealt 5 cards and they take turns playing cards, with the highest card winning each round.

## Structure

The project consists of four main classes:

- `Card.java`: Represents a playing card with suit and rank
- `Deck.java`: Represents a deck of 52 playing cards
- `Player.java`: Represents a player with a hand of cards
- `CardGame.java`: Main game logic and user interface

## How to Play

1. Compile all Java files:
```bash
javac *.java
```

2. Run the game:
```bash
java CardGame
```

3. Follow the console prompts to:
   - Enter the number of players (2-4)
   - Enter player names
   - Take turns selecting cards to play

## Game Rules

- Each player starts with 5 cards
- Players take turns playing one card from their hand
- The highest card played in each round wins
- Game continues until all cards have been played
- Card ranking: 2 < 3 < 4 < ... < 10 < Jack < Queen < King < Ace