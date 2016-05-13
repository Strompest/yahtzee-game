package com.fuzzy;

import com.fuzzy.game.DiceManager;
import com.fuzzy.game.DiceSelection;
import com.fuzzy.gui.screen.GamePhase;
import com.fuzzy.gui.screen.GameScreenManager;

/**
 * Created by 17Obradovijohn on 5/12/2016.
 */
public class Yahtzee {

    private static DiceManager manager;
    private static DiceSelection selection;
    private static GameScreenManager screen;

    public static void init() {
        screen = new GameScreenManager(GamePhase.MENU);
        manager = new DiceManager();
        selection = new DiceSelection();
    }

    public static DiceManager getManager() {
        return manager;
    }

    public static DiceSelection getSelection() {
        return selection;
    }

    public static GameScreenManager getScreen() {
        return screen;
    }
}
