package com.fuzzy.gui;

import com.fuzzy.GameSettings;

import javax.swing.*;

/**
 * Created by 17Obradovijohn on 5/13/2016.
 */
public class GUIManager extends JFrame {

    private
    public GUIManager(String title) {
        super(title);
    }

    private static GUIManager instance;

    public static void init() {
        instance = new GUIManager(GameSettings.TITLE);
        instance.create();
    }

    private void create() {

    }
}
