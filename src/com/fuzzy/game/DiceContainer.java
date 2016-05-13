package com.fuzzy.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 5/12/2016.
 */
public class DiceContainer {

    private List<Die> dice;

    public DiceContainer() {
        dice = new ArrayList<>();
    }

    public void sort() {
        dice.sort((o1, o2) -> {
            if (o1.getCurrentRoll() < o2.getCurrentRoll()) {
                return -1;
            } else if (o1.getCurrentRoll() > o2.getCurrentRoll()) {
                return 1;
            } else {
                return 0;
            }
        });
    }

    public int addAll() {
        int count = 0;
        for (Die d : dice) {
            count += d.getCurrentRoll();
        }
        return count;
    }

    public int count(int number) {
        int count = 0;
        for (Die d : dice) {
            if (d.getCurrentRoll() == number)
                count++;
        }
        return count;
    }

    public int[] getIndexes(int number) {
        int[] indexes = new int[count(number)];
        int counter = 0;
        for (int i = 0; i < indexes.length; i++) {
            if (get(i).getCurrentRoll() == number) {
                indexes[counter++] = i;
            }
        }
        return indexes;
    }

    public List<Die> getDice() {
        return dice;
    }

    public void addDie(Die die) {
        dice.add(die);
    }

    public void addDie(int index, Die die) {
        dice.add(index, die);
    }

    public Die get(int index) {
        for (Die d : dice) {
            if (d.getActionCommand().equals(String.valueOf(index))) {
                return d;
            }
        }
        return null;
    }

    public Die remove(int index) {
        return dice.remove(index);
    }

    public Die removeAndMove(int index, DiceContainer container) {
        Die die = remove(index);
        container.addDie(die);
        return die;
    }

    public int size() {
        return dice.size();
    }
}
