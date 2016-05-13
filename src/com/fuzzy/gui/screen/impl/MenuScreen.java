package com.fuzzy.gui.screen.impl;

import com.fuzzy.GameSettings;
import com.fuzzy.game.engine.GameEngine;
import com.fuzzy.graphics.Sprite;
import com.fuzzy.screen.GamePhase;
import com.fuzzy.screen.Screen;
import com.fuzzy.ui.ActionButton;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by 17Obradovijohn on 5/4/2016.
 */
public class MenuScreen extends Screen {

    private Sprite menuSprite;
    private ActionButton[] buttons;
    private int ticks;

    @Override
    public void start(Object... params) {
        menuSprite = new Sprite(GameSettings.RESOURCE_PATH + "menu/menu_screen" + GameSettings.JPG);
        buttons = new ActionButton[3];
        buttons[0] = new ActionButton(new Sprite(GameSettings.RESOURCE_PATH + "menu/buttons/play" + GameSettings.PNG));
        buttons[1] = new ActionButton(new Sprite(GameSettings.RESOURCE_PATH + "menu/buttons/options" + GameSettings.PNG));
        buttons[2] = new ActionButton(new Sprite(GameSettings.RESOURCE_PATH + "menu/buttons/exit" + GameSettings.PNG));
        ticks = 0;
    }

    @Override
    public void finish(Object... params) {
        buttons = null;
        menuSprite = null;
    }

    @Override
    public void paint(Graphics g) {
        menuSprite.draw(g, 0, 0, getWidth(), getHeight());
        g.drawString("Total Ticks: " + ticks++ + " FPS: " + GameEngine.getFramesCountAvg(), 5, 10);
        int drawX = getWidth() / 3;
        int drawY = getHeight() / 4;
        for (int i = 1; i <= buttons.length; i++) {
            ActionButton b = buttons[i - 1];
            b.setLocation(drawX, drawY * i);
            b.draw(g);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (buttons[0].contains(e.getPoint())) {
            System.out.println("Play");
            GameEngine.MANAGER.setPhase(GamePhase.GAME);
        } else if (buttons[1].contains(e.getPoint())) {
            System.out.println("Options");
        } else if (buttons[2].contains(e.getPoint())) {
            System.out.println("Exit");
        }
    }
}
