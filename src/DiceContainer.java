import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 17Obradovijohn on 5/12/2016.
 */
public class DiceContainer extends JPanel {

    private List<Die> dice;

    public DiceContainer() {
        dice = new ArrayList<>();
    }

    public DiceContainer(int amountOfDice) {
        this();
        for (int i = 0; i < amountOfDice; i++) {
            Die die = new Die();
            add(die);
        }
    }
}
