package com.test.game.texas.bean;

import com.test.game.texas.CardRankEnum;
import com.test.game.texas.CardSuitEnum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 一副扑克牌.
 */
public class Poker {

    private List<Card> cards;
    private Random random;

    public Poker() {
        this.random = new Random();
        this.init();
    }

    private void init() {
        this.cards = new ArrayList<Card>();
        for (CardSuitEnum suitEnum : CardSuitEnum.values()) {
            for (CardRankEnum rankEnum : CardRankEnum.values()) {
                cards.add(new Card(suitEnum, rankEnum));
            }
        }
        Collections.shuffle(this.cards);
    }

    public int getSize() {
        return this.cards.size();
    }

    public Card dispatch() {
        return cards.remove(random.nextInt(cards.size()));
    }
}