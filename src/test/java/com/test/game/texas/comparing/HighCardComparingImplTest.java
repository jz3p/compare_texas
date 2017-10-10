package com.test.game.texas.comparing;
import com.test.game.texas.bean.Card;
import com.test.game.texas.CardRankEnum;
import com.test.game.texas.CardSuitEnum;
import com.test.game.texas.bean.Player;
import junit.framework.TestCase;
import org.junit.Test;

public class HighCardComparingImplTest extends TestCase {

    @Test
    public void testComparing() {
        Card card1 = new Card(CardSuitEnum.DIAMONDS, CardRankEnum.CARD_FOUR);
        Card card2 = new Card(CardSuitEnum.CLUBS, CardRankEnum.CARD_THREE);
        Card card3 = new Card(CardSuitEnum.DIAMONDS, CardRankEnum.CARD_SIX);
        Card card4 = new Card(CardSuitEnum.CLUBS, CardRankEnum.CARD_SEVEN);
        Card card5 = new Card(CardSuitEnum.HEARTS, CardRankEnum.CARD_EIGHT);

        Player p = new Player();
        p.addCard(card1);
        p.addCard(card2);
        p.addCard(card3);
        p.addCard(card4);
        p.addCard(card5);
    }
}
