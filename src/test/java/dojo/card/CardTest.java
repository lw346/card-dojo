package dojo.card;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CardTest {
    @Test
    void cardsWithSameSuitAndValueAreEqual() {
        Card cardA = new Card(Suit.HEARTS, Value.TWO);
        Card cardB = new Card(Suit.HEARTS, Value.TWO);

        assertEquals(cardB, cardA);
    }

    @Test
    void cardsWithSameSuitButDifferentValueAreNotEqual() {
        Card cardA = new Card(Suit.HEARTS, Value.TWO);
        Card cardB = new Card(Suit.HEARTS, Value.THREE);

        assertNotEquals(cardB, cardA);
    }


    @Test
    void cardsWithDifferentSuitAndSameValueAreNotEqual() {
        Card cardA = new Card(Suit.HEARTS, Value.TWO);
        Card cardB = new Card(Suit.CLUBS, Value.TWO);

        assertNotEquals(cardB, cardA);
    }
}
