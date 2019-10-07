package com.codenjoy.dojo.battlecity.actions.move;

import com.codenjoy.dojo.services.Direction;

public class MoveActions implements IMoveActions {
    @Override
    public String up() {
        return Direction.UP.toString();
    }

    @Override
    public String down() {
        return Direction.DOWN.toString();
    }

    @Override
    public String left() {
        return Direction.LEFT.toString();
    }

    @Override
    public String right() {
        return Direction.RIGHT.toString();
    }
}
