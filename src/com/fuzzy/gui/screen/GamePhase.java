package com.fuzzy.gui.screen;

import com.fuzzy.gui.screen.impl.BlankScreen;
import com.fuzzy.gui.screen.impl.GameScreen;
import com.fuzzy.gui.screen.impl.MenuScreen;

/**
 * Created by 17Obradovijohn on 5/4/2016.
 */
public enum GamePhase {

    MENU(MenuScreen.class), GAME(GameScreen.class), NONE(BlankScreen.class);

    private Class<? extends Screen> screenClass;

    GamePhase(Class<? extends Screen> screenClass) {
        this.screenClass = screenClass;
    }

    public Screen initialize() {
        try {
            return screenClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Class<? extends Screen> getScreenClass() {
        return screenClass;
    }
}
