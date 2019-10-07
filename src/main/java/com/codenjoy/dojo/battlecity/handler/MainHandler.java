package com.codenjoy.dojo.battlecity.handler;

import com.codenjoy.dojo.battlecity.actions.move.MoveActions;
import com.codenjoy.dojo.battlecity.client.Board;

/**
 * This class delegates the deciding whether action is the best for a given board to various handlers, and makes that action
 */
public class MainHandler implements IMainHandler {

    @Override
    public String handle(Board nowTable) {
        return new MoveActions().up();

        //return "";
    }
}
