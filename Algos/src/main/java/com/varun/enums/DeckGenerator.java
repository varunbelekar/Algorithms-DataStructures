package com.varun.enums;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DeckGenerator {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card();
                card.setRank(rank);
                card.setSuit(suit);
                cards.add(card);
            }
        }
        System.out.println(cards);
        Collections.shuffle(cards);
        System.out.println("Shuffled list");
        System.out.println(cards);

        Collections.sort(cards);
        System.out.println("natural sorted list");
        System.out.println(cards);

        System.out.println("custom sorting");
        cards.sort(Comparator.comparing(Card::getRank).thenComparing(Card::getSuit));
        System.out.println(cards);
    }
}
