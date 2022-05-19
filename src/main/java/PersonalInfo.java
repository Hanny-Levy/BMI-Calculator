import javax.swing.*;

public class PersonalInfo extends JPanel {
    private final TextField firstNameF;
    private final TextField lastNameF;
    private final TextField ageF;
    private final ButtonGroup genderGroup;


    public PersonalInfo() {
        this.setLayout(null);
        this.setBackground(ModelBMI.LIGHT_PURPLE);

        Label firstNameL = new Label("First Name:", ModelBMI.START_X, 20);
        this.add(firstNameL);
        this.firstNameF=new TextField(ModelBMI.START_X,50);
        this.add(firstNameF);

        Label lastNameL = new Label("Last Name:", ModelBMI.START_X, 80);
        this.add(lastNameL);
        this.lastNameF=new TextField(ModelBMI.START_X,110);
        this.add(lastNameF);

        Label ageL = new Label("Age:", ModelBMI.START_X, 140);
        this.add(ageL);
        this.ageF=new TextField(ModelBMI.START_X,170);
        this.add(ageF);

        Label gender = new Label("Gender :", ModelBMI.START_X, 200);
        this.add(gender);

        JRadioButton female = new JRadioButton("female");
        female.setBounds(ModelBMI.START_X,230, ModelBMI.LABEL_WIDTH, ModelBMI.LABEL_HEIGHT);
        JRadioButton male = new JRadioButton("male");
        male.setBounds(ModelBMI.START_X,250, ModelBMI.LABEL_WIDTH, ModelBMI.LABEL_HEIGHT);

        this.genderGroup = new ButtonGroup();
        this.genderGroup.add (female);
        this.genderGroup.add (male);

        female.setBackground(ModelBMI.LIGHT_PURPLE);
        male.setBackground(ModelBMI.LIGHT_PURPLE);

        this.add (female);
        this.add (male);

        this.setPreferredSize(ModelBMI.PANEL_DIMENSION);


    }


    public void reset(){
        this.firstNameF.reset();
        this.lastNameF.reset();
        this.ageF.reset();
        this.genderGroup.clearSelection();

    }

    public double getAge() {
        String text = ageF.getText();
        return Double.parseDouble(text);
    }

    public String getFirstNameF() {
        return firstNameF.getText();
    }

    public String getLastNameF() {
        return lastNameF.getText();
    }

    public ButtonModel getGenderGroup() {
        return genderGroup.getSelection();
    }
}