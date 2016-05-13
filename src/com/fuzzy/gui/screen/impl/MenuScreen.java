package com.fuzzy.gui.screen.impl;

import com.fuzzy.GameSettings;
import com.fuzzy.gui.graphics.Sprite;
import com.fuzzy.gui.screen.Screen;
import com.fuzzy.gui.ui.ActionButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 17Obradovijohn on 5/4/2016.
 */
public class MenuScreen extends Screen implements ActionListener {

    private ActionButton[] buttons;

    @Override
    public void start() {
        setLayout(new GridLayout(3, 1));
        buttons = new ActionButton[3];
        (buttons[0] = new ActionButton(new Sprite(GameSettings.RESOURCE_PATH + "menu/buttons/play" + GameSettings.PNG), "play")).addActionListener(this);
        (buttons[1] = new ActionButton(new Sprite(GameSettings.RESOURCE_PATH + "menu/buttons/options" + GameSettings.PNG), "options")).addActionListener(this);
        (buttons[2] = new ActionButton(new Sprite(GameSettings.RESOURCE_PATH + "menu/buttons/exit" + GameSettings.PNG), "exit")).addActionListener(this);
        add(buttons[0]);
        add(buttons[1]);
        add(buttons[2]);
    }

    @Override
    public void finish() {
        buttons = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "play":
                System.out.println("play");
                break;
            case "options":
                System.out.println("options");
                break;
            case "exit":
                System.out.println("exit");
                break;
        }
    }
}
