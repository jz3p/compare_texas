package com.test.game.texas.comparing;

import com.test.game.texas.bean.Player;

/**
 * 顺子的大小比较(按顺序比较)
 */
public class StraightComparingImpl extends AbstractComparing {

    public int compare(Player o1, Player o2) {
        return this.seqComparing(o1, o2);
    }

}
