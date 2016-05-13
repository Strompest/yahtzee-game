package com.fuzzy.gui.screen;

import com.fuzzy.GameSettings;

import javax.swing.*;

/**
 * Created by 17Obradovijohn on 5/3/2016.
 */
public class GameScreenManager extends JFrame {

    private Screen currentScreen;
    private GamePhase phase;

    public GameScreenManager() {
        this(GamePhase.NONE);
    }

    public GameScreenManager(GamePhase phase) {
        super(GameSettings.TITLE);
        setResizable(true);
        setPreferredSize(GameSettings.DEFAULT_SIZE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPhase(phase);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void setPhase(GamePhase phase) {
        if (this.phase != phase) {
            removeCurrentScreen();
            this.phase = phase;
            Screen newScreen = phase.initialize();
            if (newScreen != null) {
                add(currentScreen = newScreen, 0);
            }
        }
        pack();
    }

    private void removeCurrentScreen() {
        if (currentScreen != null) {
            currentScreen.finish();
            remove(currentScreen);
            currentScreen = null;
        }
    }

    public Screen getCurrentScreen() {
        return currentScreen;
    }

}
