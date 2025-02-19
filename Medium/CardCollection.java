import java.util.*;

class CardCollection {
    private List<String> cards;

    public CardCollection() {
        cards = new ArrayList<>(Arrays.asList("Ace", "King", "Queen", "Jack", "10", "9", "8"));
    }

    public void shuffleCards() {
        Collections.shuffle(cards);
    }

    public void displayCards() {
        System.out.println("Card Collection: " + cards);
    }

    public static void main(String[] args) {
        CardCollection collection = new CardCollection();
        System.out.println("Before Shuffle:");
        collection.displayCards();
        collection.shuffleCards();
        System.out.println("After Shuffle:");
        collection.displayCards();
    }
}
