package com.codenjoy.dojo.battlecity.actions.battle;

import com.codenjoy.dojo.services.Direction;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class BattleActionsTest {
    private IBattleActions iBattleActions;

    @Before
    public void initFields() {
        iBattleActions = new BattleActions();
    }

    @Test
    public void shootCall_returnsShootCommand() {
        assertThat(iBattleActions.shoot()).isEqualTo(Direction.ACT());
    }

    @Test
    public void shootCall_returnsNotMoveUpCommand() {
        assertThat(iBattleActions.shoot()).isNotEqualTo(Direction.UP.toString());
    }

}
