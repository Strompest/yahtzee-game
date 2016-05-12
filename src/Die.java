import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by 17Obradovijohn on 5/12/2016.
 */
public class Die extends JButton {

    private int sides;
    private int currentRoll;

    public Die() {
        this(GameSettings.DICE_SIDES);
    }

    public Die(int sides) {
        super();
        this.sides = sides;
    }

    public int roll() {
        currentRoll = ((int) (Math.random() * sides) + 1);
        setIcon(getIcon(currentRoll));
        return currentRoll;
    }

    public int getCurrentRoll() {
        return currentRoll;
    }

    public static ImageIcon getIcon(int side) {
        try {
            BufferedImage image = ImageIO.read(new File(GameSettings.DICE_PATH + side));
            return new ImageIcon(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
