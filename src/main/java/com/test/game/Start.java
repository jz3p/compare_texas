package com.test.game;

import com.test.game.texas.CardRankEnum;
import com.test.game.texas.CardSuitEnum;
import com.test.game.texas.bean.Card;
import com.test.game.texas.bean.Player;
import com.test.game.texas.ranking.RankingFacade;

public class Start {

    public static void main(String[] args) {
        Card card1 = new Card(CardSuitEnum.HEARTS, CardRankEnum.CARD_THREE);
        Card card2 = new Card(CardSuitEnum.HEARTS, CardRankEnum.CARD_FIVE);
        Card card3 = new Card(CardSuitEnum.HEARTS, CardRankEnum.CARD_TWO);
        Card card4 = new Card(CardSuitEnum.HEARTS, CardRankEnum.CARD_SEVEN);
        Card card5 = new Card(CardSuitEnum.HEARTS, CardRankEnum.CARD_JACK);

        Player me = new Player();
        me.addCard(card1);
        me.addCard(card2);
        me.addCard(card3);
        me.addCard(card4);
        me.addCard(card5);

        Player you = new Player();
        you.addCard(card1);
        you.addCard(card2);
        you.addCard(card3);
        you.addCard(card4);
        you.addCard(card5);

        RankingFacade.getInstance().resolve(me);
        RankingFacade.getInstance().resolve(you);
        System.out.println(me);
        System.out.println(you);
    }
}
