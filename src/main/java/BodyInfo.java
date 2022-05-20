import javax.swing.*;

public class BodyInfo extends JPanel  {
     final TextField actualWeightField;
     ButtonGroup bodyFrameGroup;
     JRadioButton small , medium , large;
     double slimness; int height;
    Label heightLabel;
     JSlider heightSlider ;

    public BodyInfo(){
        this.setLayout(null);
        this.setBodyFrame();
        this.setBackground(ModelBMI.LIGHT_PURPLE);

        Label actualWeightLabel = new Label(ModelBMI.ACTUAL_WEIGHT_LABEL, ModelBMI.START_X, ModelBMI.START_Y+3*ModelBMI.SPACE);
        this.add(actualWeightLabel);
        this.actualWeightField=new TextField(ModelBMI.START_X,ModelBMI.START_Y+4*ModelBMI.SPACE);
        this.add(actualWeightField);

        this.setHeightSlider();
        this.setPreferredSize(ModelBMI.PANEL_DIMENSION);

    }

    public void clear(){
        this.actualWeightField.clear();
        this.bodyFrameGroup.clearSelection();
        this.heightSlider.setValue(ModelBMI.HEIGHT_SLIDER_MINIMUM_VALUE);
    }

    public double getWeight() {
        String text = actualWeightField.getText();
        return Double.parseDouble(text);
    }

    public void setHeightSlider() {
        this.heightLabel=new Label(ModelBMI.HEIGHT_LABEL_DEFAULT_TEXT,ModelBMI.START_X,ModelBMI.START_Y+5*ModelBMI.SPACE);
        this.add(heightLabel);

        this.heightSlider=new JSlider(JSlider.HORIZONTAL, ModelBMI.HEIGHT_SLIDER_MINIMUM_VALUE, ModelBMI.HEIGHT_SLIDER_MAX_VALUE, ModelBMI.HEIGHT_SLIDER_MINIMUM_VALUE);
        this.heightSlider.setMajorTickSpacing (ModelBMI.HEIGHT_SLIDER_MAJOR_TICK_SPACING);
        this.heightSlider.setMinorTickSpacing (ModelBMI.HEIGHT_SLIDER_MINOR_TICK_SPACING);
        this.heightSlider.setPaintTicks (true);
        this.heightSlider.setPaintLabels (true);

        this.heightSlider.setBounds(ModelBMI.START_X,ModelBMI.START_Y+6*ModelBMI.SPACE-10,ModelBMI.PANEL_WIDTH,ModelBMI.PANEL_HEIGHT/6);
        this.heightSlider.setBackground(ModelBMI.LIGHT_PURPLE);
        this.add(heightSlider);    }


    public void setBodyFrame() {
        Label bodyFrame = new Label(ModelBMI.BODY_FRAME_LABEL, ModelBMI.START_X, ModelBMI.START_Y);
        this.add(bodyFrame);

        this.small=new JRadioButton(ModelBMI.BODY_FRAME_FIRST_VALUE );
        this.small.setBounds(ModelBMI.START_X,ModelBMI.START_Y+ModelBMI.SPACE-10,ModelBMI.LABEL_WIDTH,ModelBMI.LABEL_HEIGHT);
        this.medium=new JRadioButton(ModelBMI.BODY_FRAME_SECOND_VALUE );
        this.medium.setBounds(ModelBMI.START_X,ModelBMI.START_Y+ModelBMI.SPACE+10,ModelBMI.LABEL_WIDTH,ModelBMI.LABEL_HEIGHT);

        this.large=new JRadioButton(ModelBMI.BODY_FRAME_THIRD_VALUE );
        this.large.setBounds(ModelBMI.START_X,ModelBMI.START_Y+2*ModelBMI.SPACE,ModelBMI.LABEL_WIDTH,ModelBMI.LABEL_HEIGHT);


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
