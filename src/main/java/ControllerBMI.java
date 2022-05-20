import javax.swing.*;

public class ControllerBMI   {

    public static void main(String[] args) {
        ViewBMI viewBMI = new ViewBMI();


            viewBMI.submit.addActionListener(e -> {
                if (viewBMI.personalInfoPanel.getFirstNameF().isEmpty() ||viewBMI.personalInfoPanel.getLastNameF().isEmpty()||viewBMI.personalInfoPanel.getGenderGroup()==null){
                    viewBMI.showMessageDialog(ModelBMI.ERROR_CODE_PERSONAL_DETAILS_NOT_FOUND);

                }else
                try {
                    // Setting the calculation for the BMI
                    double height = viewBMI.bodyInfoPanel.getPersonalHeight();
                    viewBMI.bmiResult.bmi = (viewBMI.bodyInfoPanel.getWeight() / (Math.pow(height, 2)));
                    viewBMI.bmiResult.bmiLabel.setText(ModelBMI.BMI_LABEL + String.format("%.2f", viewBMI.bmiResult.bmi));
                    viewBMI.bmiResult.setWeightStatus();
                    viewBMI.bmiResult.weightStatusLabel.setText(ModelBMI.WEIGHT_STATUS_LABEL + viewBMI.bmiResult.weightStatus.toString());
                    height *= 100;
                    double idealWeight = (((height - 100 + (viewBMI.personalInfoPanel.getAge() / 10)) * 0.9 * viewBMI.bodyInfoPanel.getSlimness()));
                    viewBMI.bmiResult.idealWeightLabel.setText(ModelBMI.IDEAL_WEIGHT_LABEL+  String.format("%.2f", idealWeight));

                } catch (NullPointerException | NumberFormatException exception){
                    viewBMI.showMessageDialog(ModelBMI.ERROR_CODE_INVALID_INPUT);
                  }
            });


        viewBMI.clear.addActionListener(e->{
            viewBMI.personalInfoPanel.clear();
            viewBMI.bodyInfoPanel.clear();
            viewBMI.bmiResult.clear();
        });

        viewBMI.bodyInfoPanel.heightSlider.addChangeListener(e -> {
                    viewBMI.bodyInfoPanel.height= viewBMI.bodyInfoPanel.heightSlider.getValue();
                    viewBMI.bodyInfoPanel.heightLabel.setText("Height: "+viewBMI.bodyInfoPanel.height + " cm");
                }
        );

        viewBMI.bodyInfoPanel.small.addActionListener(e -> viewBMI.bodyInfoPanel.setSlimness(ModelBMI.SMALL));
        viewBMI.bodyInfoPanel.medium.addActionListener(e -> viewBMI.bodyInfoPanel.setSlimness(ModelBMI.MEDIUM));
        viewBMI.bodyInfoPanel.large.addActionListener(e -> viewBMI.bodyInfoPanel.setSlimness(ModelBMI.LARGE));

}




}
