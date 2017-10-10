package com.test.game.texas.ranking;

import com.test.game.texas.bean.Card;
import com.test.game.texas.CardSuitEnum;
import com.test.game.texas.bean.Player;

import java.util.List;

/**
 * 抽象牌型解析接口
 */
public abstract class AbstractRanking implements IRanking {

    public RankingResult resolve(Player player) {
        this.preResolve(player);
        RankingResult result = this.doResolve(player);
        this.postResolve(player, result);
        return result;
    }

    private void preResolve(Player player) {

    }

    private void postResolve(Player player, RankingResult result) {
        if (result != null) {
            result.setHighCard((player.getCards().get(0)));
        }
        player.setRankingResult(result);
    }

    protected abstract RankingResult doResolve(Player player);

    /**
     * 判断当前牌型是否同色
     * @param cards
     * @return
     */
    protected boolean isSameSuit(List<Card> cards) {
        if (cards == null || cards.size() == 0) {
            return false;
        }
        if (cards.size() == 1) {
            return true;
        }
        if (cards.size() > 1) {
            Card card = cards.get(0);
            CardSuitEnum suitEnum = card.getSuit();
            for (int i = 1; i < cards.size(); i++) {
                if (suitEnum != cards.get(i).getSuit()) {
                    return false;
                }
            }
        }
        return true;
    }
}
