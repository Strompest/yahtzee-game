package com.fuzzy.gui.screen;

import javax.swing.*;

/**
 * Created by 17Obradovijohn on 5/3/2016.
 */
public abstract class Screen extends JPanel {

    public Screen() {
        start();
    }

    public abstract void start();
    public abstract void finish();
}
