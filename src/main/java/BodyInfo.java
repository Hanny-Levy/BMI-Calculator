import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BodyInfo extends JPanel implements ActionListener {
    private final TextField actualWeightField;
    private ButtonGroup bodyFrameGroup;
    private JRadioButton small , medium , large;
    private double slimness;
    private Label heightLabel;
    private JSlider heightSlider ;
    private int height;

    public BodyInfo(){
        this.setLayout(null);
        this.setBodyFrame();
        this.setBackground(Def.LIGHT_PURPLE);

        Label actualWeightLabel = new Label("Actual weight:", Def.START_X, 110);
        this.add(actualWeightLabel);
        this.actualWeightField=new TextField(Def.START_X,140);
        this.add(actualWeightField);


        this.setHeightSlider();
        this.setPreferredSize(Def.PANEL_DIMENSION);

    }

    public void reset(){
        this.actualWeightField.reset();
        this.bodyFrameGroup.clearSelection();
        this.heightSlider.setValue(140);
    }

    public double getWeight() {
        String text = actualWeightField.getText();
        return Double.parseDouble(text);
    }

    public void setHeightSlider() {
        this.heightLabel=new Label("Height: 140 cm",Def.START_X,170);
        this.add(heightLabel);

        this.heightSlider=new JSlider(JSlider.HORIZONTAL, 140, 190, 140);
        this.heightSlider.setMajorTickSpacing (10);
        this.heightSlider.setMinorTickSpacing (5);
        this.heightSlider.setPaintTicks (true);
        this.heightSlider.setPaintLabels (true);
        this.heightSlider.addChangeListener(e -> {
                    this.height= this.heightSlider.getValue();
                    this.heightLabel.setText("Height: "+height + " cm");
                }
        );
        this.heightSlider.setBounds(Def.START_X,200,Def.PANEL_WIDTH,100);
        this.heightSlider.setBackground(Def.LIGHT_PURPLE);
        this.add(heightSlider);    }


    public void setBodyFrame() {
        Label bodyFrame = new Label("Body-frame:", Def.START_X, 20);
        this.add(bodyFrame);

        this.small=new JRadioButton("small" );
        this.small.setBounds(Def.START_X,40,Def.LABEL_WIDTH,Def.LABEL_HEIGHT);
        this.medium=new JRadioButton("medium" );
        this.medium.setBounds(Def.START_X,60,Def.LABEL_WIDTH,Def.LABEL_HEIGHT);

        this.large=new JRadioButton("large" );
        this.large.setBounds(Def.START_X,80,Def.LABEL_WIDTH,Def.LABEL_HEIGHT);


        this.bodyFrameGroup = new ButtonGroup();
        this.bodyFrameGroup.add (small);
        this.bodyFrameGroup.add (medium);
        this.bodyFrameGroup.add (large);

        this.small.setBackground(Def.LIGHT_PURPLE);
        this.medium.setBackground(Def.LIGHT_PURPLE);
        this.large.setBackground(Def.LIGHT_PURPLE);

        this.small.addActionListener(this);
        this.medium.addActionListener(this);
        this.large.addActionListener(this);

        this.add (small);
        this.add (medium);
        this.add (large);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source==this.small)
            this.slimness=Def.SMALL;
        if (source==this.medium)
            this.slimness=Def.MEDIUM;
        if (source==this.large)
            this.slimness=Def.LARGE;



    }

    public double getSlimness() {
        return slimness;
    }

    public double getPersonalHeight(){
        double height =this.height;
        return height/100;
    }

    public void addMessage(){
        Label label = new Label("Invalid input , try again ",Def.START_X,400);
        label.setForeground(Color.RED);
        this.add(label);

    }

}
