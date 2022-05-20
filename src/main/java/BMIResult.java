import javax.swing.*;
import java.awt.*;

public class BMIResult extends JPanel {
     double bmi ;
     final Label bmiLabel;
     final Label weightStatusLabel;
     final Label idealWeightLabel;
     WeightStatus weightStatus;
    private final Pictures pictures;




    public BMIResult(){
        this.setPreferredSize(new Dimension(ModelBMI.PANEL_WIDTH-20 , ModelBMI.PANEL_HEIGHT));
        this.setBackground(ModelBMI.LIGHT_PURPLE);
        this.setLayout(null);
        this.pictures =new Pictures();
            this.bmiLabel=new Label(ModelBMI.BMI_LABEL_DEFAULT_VALUE,ModelBMI.START_X,ModelBMI.START_Y);
        this.add(bmiLabel);
        this.weightStatusLabel=new Label(ModelBMI.WEIGHT_STATUS_DEFAULT_VALUE);
        this.weightStatusLabel.setBounds(ModelBMI.START_X,ModelBMI.START_X+ModelBMI.SPACE, ModelBMI.PANEL_WIDTH, ModelBMI.LABEL_HEIGHT);
        this.add(weightStatusLabel);
        this.idealWeightLabel=new Label(ModelBMI.IDEAL_WEIGHT_DEFAULT_VALUE);
        this.idealWeightLabel.setBounds(ModelBMI.START_X,ModelBMI.START_X+2*ModelBMI.SPACE, ModelBMI.PANEL_WIDTH, ModelBMI.LABEL_HEIGHT);
        this.add(idealWeightLabel);

    }






    // Setting the weight status
    public void setWeightStatus() {
        if (this.bmi<15){
            this.weightStatus=WeightStatus.Anorexic;
        }
        if (this.bmi>=15 && this.bmi<18.5){
            this.weightStatus=WeightStatus.Underweight;
        }
        if (this.bmi>=18.5 &&this.bmi<=24.9){
            this.weightStatus=WeightStatus.Normal;
        }
        if (this.bmi>=25 &&this.bmi<=29.9){
            this.weightStatus=WeightStatus.Overweight;
        }
        if (this.bmi>=30 &&this.bmi<=35){
            this.weightStatus=WeightStatus.Obese;
        }
            if (this.bmi>35)
            this.weightStatus=WeightStatus.Extreme_Obese;
    }

    // Resetting labels
    public void clear(){
        this.idealWeightLabel.setText(ModelBMI.IDEAL_WEIGHT_DEFAULT_VALUE);
        this.bmiLabel.setText(ModelBMI.BMI_LABEL_DEFAULT_VALUE);
        this.weightStatusLabel.setText(ModelBMI.WEIGHT_STATUS_DEFAULT_VALUE);
    }

    // Painting images
    public void paint(Graphics graphics) {
        super.paint(graphics);
        pictures.paint(graphics,this);
    }


}
