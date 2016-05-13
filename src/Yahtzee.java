/**
 * Created by 17Obradovijohn on 5/12/2016.
 */
public class Yahtzee {

    private static DiceManager manager;
    private static DiceSelection selection;

    public static void init() {
        manager = new DiceManager();
        selection = new DiceSelection();
    }

    public static DiceManager getManager() {
        return manager;
    }

    public static DiceSelection getSelection() {
        return selection;
    }
}
