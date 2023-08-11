package com.varun.enums;

public class Card implements Comparable<Card> {
    private Rank rank;
    private Suit suit;

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }

    @Override
    public int compareTo(Card o) {
        int res = this.suit.compareTo(o.suit);

        return res == 0 ? this.rank.compareTo(o.rank) : res;
    }
}
