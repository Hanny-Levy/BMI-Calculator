import javax.swing.*;
import java.awt.*;

public class Pictures {
    private final ImageIcon bmi;
    private final ImageIcon dragon ;

    // Setting the pictures source and size
    public Pictures(){
        ImageIcon imageIcon = new ImageIcon("src/BMI.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        this.bmi = new ImageIcon(newimg);
        imageIcon = new ImageIcon("src/dragon.png");
        image = imageIcon.getImage(); // transform it
        newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        this.dragon = new ImageIcon(newimg);
    }

    public void paint(Graphics graphics, BMIResult bmiResult ){
        this.dragon.paintIcon(bmiResult,graphics,130,350);
        this.bmi.paintIcon(bmiResult,graphics,10,350);

    }
}
