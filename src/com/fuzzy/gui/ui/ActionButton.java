package com.fuzzy.gui.ui;

import com.fuzzy.gui.graphics.Sprite;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 17Obradovijohn on 5/4/2016.
 */
public class ActionButton extends JButton {

    public ActionButton(Sprite sprite, String command) {
        super(new ImageIcon(sprite.getImage()));
        this.setActionCommand(command);
    }

}
