package com.test.game.texas.comparing;

import com.test.game.texas.bean.Player;

/**
 * 同花顺的大小比较(比较最大牌即可)
 */
public class FlushComparingImpl extends AbstractComparing {

    public int compare(Player o1, Player o2) {
        return this.seqComparing(o1, o2);
    }

}
