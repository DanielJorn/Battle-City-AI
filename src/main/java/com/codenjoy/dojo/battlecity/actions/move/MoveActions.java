package com.codenjoy.dojo.battlecity.actions.move;

import com.codenjoy.dojo.services.Direction;

public class MoveActions {

    public String up() {
        return Direction.UP.toString();
    }

    public String down() {
        return Direction.DOWN.toString();
    }

    public String left() {
        return Direction.LEFT.toString();
    }

    public String right() {
        return Direction.RIGHT.toString();
    }
}
