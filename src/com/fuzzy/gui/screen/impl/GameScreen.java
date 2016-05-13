package com.fuzzy.gui.screen.impl;

import com.fuzzy.gui.screen.Screen;

import java.awt.event.KeyEvent;

/**
 * Created by 17Obradovijohn on 5/4/2016.
 */
public class GameScreen extends Screen {

    @Override
    public void start(Object... params) {
    }

    @Override
    public void finish(Object... params) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT:
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN:
        }
    }
}
