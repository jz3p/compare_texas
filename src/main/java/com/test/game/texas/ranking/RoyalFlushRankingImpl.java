package com.test.game.texas.ranking;

import com.test.game.texas.bean.Card;
import com.test.game.texas.CardRankEnum;
import com.test.game.texas.bean.Player;
import com.test.game.texas.RankingEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * 解析玩家手中的牌是不是皇家同花顺
 */
public class RoyalFlushRankingImpl extends AbstractRanking {

    protected RankingResult doResolve(Player player) {

        RankingResult result = null;

        List<Card> cards = player.getCards();
        if (isSameSuit(cards)) {
            List<CardRankEnum> ranks = new ArrayList<CardRankEnum>();
            for (Card card : cards) {
                ranks.add(card.getRank());
            }
            if (ranks.contains(CardRankEnum.CARD_TEN)
                    && ranks.contains(CardRankEnum.CARD_JACK)
                    && ranks.contains(CardRankEnum.CARD_QUEUE)
                    && ranks.contains(CardRankEnum.CARD_KING)
                    && ranks.contains(CardRankEnum.CARD_ACE)) {
                result = new RankingResult();
                result.setRankingEnum(RankingEnum.ROYAL_FLUSH);
            }
        }

        return result;
    }

}
