package com.fuzzy.game;

import javax.swing.*;

/**
 * Created by 17Obradovijohn on 5/12/2016.
 */
public class DiceSelection extends JPanel {

    private DiceContainer selectedDice;

    public DiceSelection() {
        selectedDice = new DiceContainer();
    }

    public DiceContainer getContainer() {
        return selectedDice;
    }

    public enum Patterns implements Pattern {

        THREE_OF_A_KIND {
            @Override
            public int getTotal(DiceContainer container) {
                container.sort();
                for (Die d : container.getDice()) {
                    int[] indexes = container.getIndexes(d.getCurrentRoll());
                    if (indexes.length >= 3) {
                        return container.addAll();
                    }
                }
                return -1;
            }
        },
        FOUR_OF_A_KIND {
            @Override
            public int getTotal(DiceContainer container) {
                container.sort();
                for (Die d : container.getDice()) {
                    int[] indexes = container.getIndexes(d.getCurrentRoll());
                    if (indexes.length >= 4) {
                        return container.addAll();
                    }
                }
                return -1;
            }
        },
        FULL_HOUSE {
            @Override
            public int getTotal(DiceContainer container) {
                return -1;
            }
        },
        SMALL_STRAIT {
            @Override
            public int getTotal(DiceContainer container) {
                return -1;
            }
        },
        LARGE_STRAIT {
            @Override
            public int getTotal(DiceContainer container) {
                return -1;
            }
        };

    }

    public interface Pattern {
        int getTotal(DiceContainer container);
    }
}
