package com.test.game.texas.comparing;

import com.test.game.texas.bean.Player;

import java.util.Map;

/**
 * 葫芦的大小比较(直接比较三条)
 */
public class FullHouseComparingImpl extends AbstractComparing {

    public int compare(Player o1, Player o2) {
        Map<Integer, Integer> p1CardMap = o1.getCardsRankCountMap();
        Map<Integer, Integer> p2CardMap = o2.getCardsRankCountMap();

        return this.multiComparing(p1CardMap, p2CardMap, 3);
    }

}
