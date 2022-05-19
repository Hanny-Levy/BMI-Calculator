import javax.swing.*;

public class BodyInfo extends JPanel {
    private final TextField actualWeightField;
     ButtonGroup bodyFrameGroup;
     JRadioButton small , medium , large;
    private double slimness;
     Label heightLabel;
    JSlider heightSlider ;
     int height;

    public BodyInfo(){
        this.setLayout(null);
        this.setBodyFrame();
        this.setBackground(ModelBMI.LIGHT_PURPLE);

        Label actualWeightLabel = new Label("Actual weight:", ModelBMI.START_X, 110);
        this.add(actualWeightLabel);
        this.actualWeightField=new TextField(ModelBMI.START_X,140);
        this.add(actualWeightField);


        this.setHeightSlider();
        this.setPreferredSize(ModelBMI.PANEL_DIMENSION);

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
        this.heightLabel=new Label("Height: 140 cm", ModelBMI.START_X,170);
        this.add(heightLabel);

        this.heightSlider=new JSlider(JSlider.HORIZONTAL, 140, 190, 140);
        this.heightSlider.setMajorTickSpacing (10);
        this.heightSlider.setMinorTickSpacing (5);
        this.heightSlider.setPaintTicks (true);
        this.heightSlider.setPaintLabels (true);

        this.heightSlider.setBounds(ModelBMI.START_X,200, ModelBMI.PANEL_WIDTH,100);
        this.heightSlider.setBackground(ModelBMI.LIGHT_PURPLE);
        this.add(heightSlider);    }


    public void setBodyFrame() {
        Label bodyFrame = new Label("Body-frame:", ModelBMI.START_X, 20);
        this.add(bodyFrame);

        this.small=new JRadioButton("small" );
        this.small.setBounds(ModelBMI.START_X,40, ModelBMI.LABEL_WIDTH, ModelBMI.LABEL_HEIGHT);
        this.medium=new JRadioButton("medium" );
        this.medium.setBounds(ModelBMI.START_X,60, ModelBMI.LABEL_WIDTH, ModelBMI.LABEL_HEIGHT);

        this.large=new JRadioButton("large" );
        this.large.setBounds(ModelBMI.START_X,80, ModelBMI.LABEL_WIDTH, ModelBMI.LABEL_HEIGHT);


        this.bodyFrameGroup = new ButtonGroup();
        this.bodyFrameGroup.add (small);
        this.bodyFrameGroup.add (medium);
        this.bodyFrameGroup.add (large);

        this.small.setBackground(ModelBMI.LIGHT_PURPLE);
        this.medium.setBackground(ModelBMI.LIGHT_PURPLE);
        this.large.setBackground(ModelBMI.LIGHT_PURPLE);



        this.add (small);
        this.add (medium);
        this.add (large);
    }



    public double getSlimness() {
        return slimness;
    }

    public double getPersonalHeight(){
        double height =this.height;
        return height/100;
    }

    public void setSlimness(double slimness) {
        this.slimness = slimness;
    }
}
