package com.codenjoy.dojo.battlecity.handler;

import com.codenjoy.dojo.battlecity.client.Board;

public interface IMainHandler {
    /**
     * All that handler decides should be put in this method.
     *
     * @param board Board to be handled.
     */
    String handle(Board board);
}
