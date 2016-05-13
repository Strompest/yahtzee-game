import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
                    int count = count(d.getCurrentRoll(), container);
                    if (count >= 3) {
                        return d.getCurrentRoll() * 3;
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
                    int count = count(d.getCurrentRoll(), container);
                    if (count >= 4) {
                        return d.getCurrentRoll() * 4;
                    }
                }
                return -1;
            }
        },
        FULL_HOUSE {
            @Override
            public int getTotal(DiceContainer container) {

            }
        },
        SMALL_STRAIT {
            @Override
            public int getTotal(DiceContainer container) {
                return false;
            }
        },
        LARGE_STRAIT {
            @Override
            public int getTotal(DiceContainer container) {
                return false;
            }
        };

        public int count(int number, DiceContainer container) {
            int count = 0;
            for (Die d : container.getDice()) {
                if (d.getCurrentRoll() == number)
                    count++;
            }
            return count;
        }


    }

    public interface Pattern {
        int getTotal(DiceContainer container);
    }
}
