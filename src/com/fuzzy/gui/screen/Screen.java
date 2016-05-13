package com.fuzzy.gui.screen;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by 17Obradovijohn on 5/3/2016.
 */
public abstract class Screen extends JPanel implements KeyListener, MouseListener {

    public Screen() {
        addKeyListener(this);
        addMouseListener(this);
        start();
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public abstract void start(Object... params);
    public abstract void finish(Object... params);
}
