package com.test.game.texas.ranking;

import com.test.game.texas.bean.Card;
import com.test.game.texas.bean.Player;
import com.test.game.texas.RankingEnum;

import java.util.List;

/**
 * 解析玩家手中的牌是不是同花(花色连续一样)
 */
public class FlushRankingImpl extends AbstractRanking {

    protected RankingResult doResolve(Player player) {

        RankingResult result = null;

        List<Card> cards = player.getCards();
        if (this.isSameSuit(cards)) {
            result = new RankingResult();
            result.setRankingEnum(RankingEnum.FLUSH);
        }

        return result;
    }

}
