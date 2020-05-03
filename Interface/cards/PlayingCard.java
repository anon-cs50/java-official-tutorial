package cards;

public class PlayingCard implements Card {

    private Card.Rank rank;
    private Card.Suit suit;

    public PlayingCard(Card.Rank rank, Card.Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public Card.Suit getSuit() {
        return suit;
    }

    @Override
    public Card.Rank getRank() {
        return rank;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            return ((Card) obj).getRank() == this.rank && ((Card) obj).getSuit() == this.suit;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return ((suit.value() - 1) * 13) + rank.value();
    }

    public int compareTo(Card o) {
        return this.hashCode() - o.hashCode();
    }

    public String toString() {
        return this.rank.text() + " of " + this.suit.text();
    }

    public static void main(String[] args) {
        new PlayingCard(Rank.ACE, Suit.DIAMONDS);
        new PlayingCard(Rank.KING, Suit.SPADES);
    }
}
