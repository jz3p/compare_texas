package com.test.game.texas.ranking;

import com.test.game.texas.CardRankEnum;
import com.test.game.texas.CardSuitEnum;
import com.test.game.texas.RankingEnum;
import com.test.game.texas.bean.*;
import junit.framework.TestCase;
import org.junit.Test;

public class FourOfTheKindRankingImplTest extends TestCase {


    @Test
    public void testIsFourOfTheKindRanking() {

        Card card13 = new Card(CardSuitEnum.HEARTS, CardRankEnum.CARD_KING);
        Card card1313 = new Card(CardSuitEnum.DIAMONDS, CardRankEnum.CARD_KING);
        Card card131313 = new Card(CardSuitEnum.SPADES, CardRankEnum.CARD_KING);
        Card card13131313 = new Card(CardSuitEnum.CLUBS, CardRankEnum.CARD_KING);
        Card card9 = new Card(CardSuitEnum.HEARTS, CardRankEnum.CARD_NINE);

        Card otherSuitCard = new Card(CardSuitEnum.DIAMONDS, CardRankEnum.CARD_TEN);

        Player p = new Player();
        p.addCard(card13);
        p.addCard(card1313);
        p.addCard(card131313);
        p.addCard(card13131313);
        p.addCard(card9);

        IRanking ranking = new FourOfTheKindRankingImpl();

        RankingResult result = ranking.resolve(p);
        assertTrue(result != null);

        assertEquals(result.getRankingEnum(), RankingEnum.FOUR_OF_THE_KIND);

        Player p2 = new Player();
        p2.addCard(card13);
        p2.addCard(card1313);
        p2.addCard(card131313);
        p2.addCard(card9);
        p2.addCard(otherSuitCard);

        IRanking ranking2 = new FourOfTheKindRankingImpl();

        RankingResult result2 = ranking2.resolve(p2);
        assertTrue(result2 == null);

    }

}