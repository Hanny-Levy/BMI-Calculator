import javax.swing.*;

import java.awt.*;

public class Instructions extends JPanel {

    // Setting the Instructions panel
    public Instructions(){
        this.setLayout(null);
        this.setBackground((Def.DARK_PURPLE));
        this.setPreferredSize(new Dimension(Def.PANEL_WIDTH,Def.PANEL_HEIGHT/11));

        // Setting the headline label
        Label headLine = new Label("BMI Calculator", Def.FRAME_WIDTH / 2 - Def.LABEL_WIDTH, 0);
        this.add(headLine);

        // Setting the caption label
        Label caption = new Label("Please complete this form. Press the Submit button when complete. ");
        caption.setBounds(Def.FRAME_WIDTH/2-(3*Def.LABEL_WIDTH),20,Def.FRAME_WIDTH,Def.LABEL_HEIGHT);
        this.add(caption);
    }
}