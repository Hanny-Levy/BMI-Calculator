import javax.swing.*;
import java.awt.*;

public class BMIResult extends JPanel {
    private double bmi ;
    private final Label bmiLabel;
    private final Label weightStatusLabel;
    private final Label idealWeightLabel;
    private WeightStatus weightStatus;
    private final Pictures pictures;


    public BMIResult(){
        this.setPreferredSize(new Dimension(Def.PANEL_WIDTH-20 , Def.PANEL_HEIGHT));
        this.setBackground(Def.LIGHT_PURPLE);
        this.setLayout(null);
        this.pictures =new Pictures();
        this.bmiLabel=new Label("",10,20);
        this.add(bmiLabel);
        this.weightStatusLabel=new Label("");
        this.weightStatusLabel.setBounds(10,50,Def.PANEL_WIDTH,Def.LABEL_HEIGHT);
        this.add(weightStatusLabel);
        this.idealWeightLabel=new Label("");
        this.idealWeightLabel.setBounds(10,80,Def.PANEL_WIDTH,Def.LABEL_HEIGHT);
        this.add(idealWeightLabel);

    }

    // Setting the calculation for the BMI
    public void submit(double height , double weight , double slimness, Double age){
        this.bmi=(weight/(Math.pow(height,2)));
        this.bmiLabel.setText("BMI: "+String.format("%.2f", this.bmi));
        this.setWeightStatus();
        this.weightStatusLabel.setText("Weight status: "+this.weightStatus.toString());
        height*=100;
        double idealWeight = (((height - 100 + (age / 10)) * 0.9 * slimness) * 100) / 100;
        this.idealWeightLabel.setText("Your ideal weight: "+ idealWeight);
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
