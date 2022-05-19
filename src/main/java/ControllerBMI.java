import java.util.InputMismatchException;

public class ControllerBMI   {
    ViewBMI viewBMI = new ViewBMI();

    public static void main(String[] args) {
        ViewBMI viewBMI = new ViewBMI();


            viewBMI.submit.addActionListener(e -> {
                try {
                    double height = viewBMI.bodyInfoPanel.getPersonalHeight();
                    viewBMI.bmiResult.bmi = (viewBMI.bodyInfoPanel.getWeight() / (Math.pow(height, 2)));
                    viewBMI.bmiResult.bmiLabel.setText("BMI: " + String.format("%.2f", viewBMI.bmiResult.bmi));
                    viewBMI.bmiResult.setWeightStatus();
                    viewBMI.bmiResult.weightStatusLabel.setText("Weight status: " + viewBMI.bmiResult.weightStatus.toString());
                    height *= 100;
                    double idealWeight = (((height - 100 + (viewBMI.personalInfoPanel.getAge() / 10)) * 0.9 * viewBMI.bodyInfoPanel.getSlimness()) * 100) / 100;
                    viewBMI.bmiResult.idealWeightLabel.setText("Your ideal weight: " + idealWeight);
                } catch (NullPointerException | NumberFormatException exception){
        }
            });


        viewBMI.clear.addActionListener(e->{
            viewBMI.personalInfoPanel.reset();
            viewBMI.bodyInfoPanel.reset();
            viewBMI.bmiResult.reset();
        });

        viewBMI.bodyInfoPanel.heightSlider.addChangeListener(e -> {
                    viewBMI.bodyInfoPanel.height= viewBMI.bodyInfoPanel.heightSlider.getValue();
                    viewBMI.bodyInfoPanel.heightLabel.setText("Height: "+viewBMI.bodyInfoPanel.height + " cm");
                }
        );

        viewBMI.bodyInfoPanel.small.addActionListener(e -> {
            viewBMI.bodyInfoPanel.setSlimness(ModelBMI.SMALL);
        });
        viewBMI.bodyInfoPanel.medium.addActionListener(e -> {
            viewBMI.bodyInfoPanel.setSlimness(ModelBMI.MEDIUM);
        });
        viewBMI.bodyInfoPanel.large.addActionListener(e -> {
            viewBMI.bodyInfoPanel.setSlimness(ModelBMI.LARGE);
        });

}




}
