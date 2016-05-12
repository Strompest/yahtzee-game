import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17Obradovijohn on 5/12/2016.
 */
public class DiceManager implements ActionListener {

    private List<Die> selectedDice;

    public DiceManager() {
        dice = new ArrayList<>();
        selectedDice = new ArrayList<>();
        resetDice();
    }

    public void resetDice() {
        for (int i = 0; i < dice.size(); i++) {
            Die die = new Die(GameSettings.DICE_SIDES);
            die.setActionCommand(String.valueOf(i));
            die.addActionListener(this);
            add(die);
        }
    }


    public int[] rollAll() {
        int[] rolls = new int[dice.size()];
        for (int i = 0; i < rolls.length; i++) {
            rolls[i] = rollDice(i);
        }
        return rolls;
    }

    public int rollDice(int i) {
        return dice.get(i).roll();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int die = Integer.valueOf(e.getActionCommand());
        switch (die) {
            case 0:

        }
    }
}
