package jliu2882;

public class Main {

    public static void main(String[] args) {
	    String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
        String[] suits = {"Diamonds","Clubs","Hearts","Spades"};
        int[] pointValue = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        Deck deckTester = new Deck(ranks, suits, pointValue);


        System.out.println("Deck Empty? " + deckTester.isEmpty());

        deckTester.shuffle();

        int deckSize = deckTester.size();
        for(int i = 0; i < deckSize;i++) {
            deckTester.deal();
        }

        System.out.println("Deck Empty? " + deckTester.isEmpty());
    }
}
