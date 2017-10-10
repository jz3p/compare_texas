package com.test.game.texas.ranking;

import com.test.game.texas.bean.Player;
import com.test.game.texas.RankingEnum;

import java.util.Iterator;
import java.util.Map;

/**
 * 解析玩家手中的牌是不是四条(四张连续相同的牌)
 */
public class FourOfTheKindRankingImpl extends AbstractRanking {

    protected RankingResult doResolve(Player player) {

        RankingResult result = null;
        Map<Integer, Integer> rankCount = player.getCardsRankCountMap();

        boolean hasFour = false;

        Iterator<Map.Entry<Integer, Integer>> it = rankCount.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == 5 - 1) {
                hasFour = true;
                break;
            }
        }

        if (hasFour) {
            result = new RankingResult();
            result.setRankingEnum(RankingEnum.FOUR_OF_THE_KIND);
        }

        return result;
    }

}
