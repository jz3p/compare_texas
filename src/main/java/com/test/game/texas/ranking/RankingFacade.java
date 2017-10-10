package com.test.game.texas.ranking;

import com.test.game.texas.bean.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * 牌型校验统一入口
 */
public class RankingFacade implements IRanking {

    private final static List<IRanking> rankings = new ArrayList<IRanking>();
    private static RankingFacade instance = null;
    private final static Object lock = new Object();

    static {
        rankings.add(new RoyalFlushRankingImpl());
        rankings.add(new StraightFlushRankingImpl());
        rankings.add(new FourOfTheKindRankingImpl());
        rankings.add(new FullHouseRankingImpl());
        rankings.add(new FlushRankingImpl());
    }

    private RankingFacade() {
    }

    public static RankingFacade getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new RankingFacade();
                }
            }
        }
        return instance;
    }

    public RankingResult resolve(Player player) {
        RankingResult result = null;
        for (IRanking ranking : RankingFacade.rankings) {
            result = ranking.resolve(player);
            if (result != null) {
                return result;
            }
        }
        return result;
    }

}
