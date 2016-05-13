import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17Obradovijohn on 5/12/2016.
 */
public class DiceManager extends JPanel implements ActionListener {

    private DiceContainer dice;

    public DiceManager() {
        dice = new DiceContainer();
        resetDice();
    }

    public void resetDice() {
        for (int i = 0; i < GameSettings.NUMBER_OF_DICE; i++) {
            Die die = new Die(GameSettings.DICE_SIDES);
            die.setActionCommand(String.valueOf(i));
            die.addActionListener(this);
            add(die);
        }
        dice.sort();
    }


    public int[] rollAll() {
        int[] rolls = new int[dice.size()];
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = rollDie(i);
        }
        dice.sort();
        return rolls;
    }

    public int rollDie(int i) {
        Die die = dice.get(i);
        if (die != null)
            return die.roll();
        return -1;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int id = Integer.valueOf(e.getActionCommand());
        dice.removeAndMove(id, Yahtzee.getSelection().getContainer());
    }
}
