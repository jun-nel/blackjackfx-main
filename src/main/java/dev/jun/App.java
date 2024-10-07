package dev.jun;

import dev.jun.app.models.cards.Deck;
import dev.sol.app.FXApplication;

public class App extends FXApplication {

    @Override
    public void initialize() throws Exception {
    }

    public static void main(String[] args) {
        // launch();
        Deck deck = new Deck();
        deck.getCards().forEach(card -> {
            System.out.println(card.display());
        });

    }

}