import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    private final int WIDTH=100;
    private final int HEIGHT=25;

   public Label(String text,int x,int y){
       this.setText(text);
       this.setBounds(x,y,WIDTH,HEIGHT);
 }

    public Label(String text) {
        this.setText(text);
        this.setMaximumSize(new Dimension(WIDTH,HEIGHT));
    }



}
