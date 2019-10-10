package com.codenjoy.dojo.battlecity.handler;

import com.codenjoy.dojo.battlecity.actions.move.MoveActions;
import com.codenjoy.dojo.battlecity.client.Board;

/**
 * This class decides what action is the best and performs it.
 */
public class MainHandler {

    public String handle(Board nowTable) {
        return new MoveActions().up();
    }

}
