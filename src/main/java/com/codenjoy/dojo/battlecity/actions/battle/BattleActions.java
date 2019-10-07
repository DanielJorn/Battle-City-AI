package com.codenjoy.dojo.battlecity.actions.battle;

import com.codenjoy.dojo.services.Direction;

public class BattleActions implements IBattleActions {

    @Override
    public String shoot() {
        return Direction.ACT();
    }
}
