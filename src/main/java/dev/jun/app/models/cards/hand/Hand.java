package dev.jun.app.models.cards.hand;

import java.util.Collections;
import java.util.Comparator;

import dev.jun.app.models.cards.Card;
import dev.jun.app.models.cards.Deck;
import dev.sol.base.collections.FXObservableList;

public abstract class Hand extends FXObservableList<Card> {
    public Card select(int position) {
        return get(position);
    }

    public void add(Deck deck) {
        Card card = deck.deal();
        if (card != null) {
           add(card);
        }

    }

    public void remove(Card card, Deck deck) {
        if (contains(card)) {
            remove(card);
            deck.add(card);
        }

    }

    public void remove(Card card) {
        if (contains(card)) {
            remove(card);
        }

    }

    public void clear(Deck deck) {
        deck.returnCards(this);
         clear();

    }

    public int count() {
        return size();
    }

    public void sortBySuit() {
        Collections.sort(this, Comparator.comparing(Card::gesuit));
    }

    public void sortByValue() {
        Collections.sort(this, Comparator.comparing(Card::getValue));

    }

    public void shuffle(){
        Collections.shuffle(this);
    }
    

    protected abstract int calculate();

}
