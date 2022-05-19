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
        this.bmiLabel=new Label("",10,20);
        this.add(bmiLabel);
        this.weightStatusLabel=new Label("");
        this.weightStatusLabel.setBounds(10,50, ModelBMI.PANEL_WIDTH, ModelBMI.LABEL_HEIGHT);
        this.add(weightStatusLabel);
        this.idealWeightLabel=new Label("");
        this.idealWeightLabel.setBounds(10,80, ModelBMI.PANEL_WIDTH, ModelBMI.LABEL_HEIGHT);
        this.add(idealWeightLabel);

    }

    // Setting the calculation for the BMI



    public void validParameters(ViewBMI viewBMI, String firstName , String lastName , ButtonModel gender , double slimness ){
        if (firstName==null || lastName==null || gender==null || slimness==0){
            JOptionPane.showMessageDialog(viewBMI,"You are missing one or more parameters !");

        }
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
    public void reset(){
        this.idealWeightLabel.setText("");
        this.bmiLabel.setText("");
        this.weightStatusLabel.setText("");
    }

    // Painting images
    public void paint(Graphics graphics) {
        super.paint(graphics);
        pictures.paint(graphics,this);
    }


}
