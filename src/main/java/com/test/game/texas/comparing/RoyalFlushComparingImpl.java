package com.test.game.texas.comparing;

import com.test.game.texas.bean.Player;

/**
 * 皇家同花顺的大小比较(唯一, 不考虑花色, 返回0)
 */
public class RoyalFlushComparingImpl extends AbstractComparing {
    public int compare(Player o1, Player o2) {
        return 0;
    }
}
