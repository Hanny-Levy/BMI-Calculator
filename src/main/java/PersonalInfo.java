import javax.swing.*;

public class PersonalInfo extends JPanel {
    private final TextField firstNameF;
    private final TextField lastNameF;
    private final TextField ageF;
    private final ButtonGroup genderGroup;


    public PersonalInfo() {
        this.setLayout(null);
        this.setBackground(ModelBMI.LIGHT_PURPLE);

        Label firstNameL = new Label(ModelBMI.FIRST_NAME_LABEL, ModelBMI.START_X, ModelBMI.START_Y);
        this.add(firstNameL);
        this.firstNameF=new TextField(ModelBMI.START_X,ModelBMI.START_Y+ModelBMI.SPACE);
        this.add(firstNameF);

        Label lastNameL = new Label(ModelBMI.LAST_NAME_LABEL, ModelBMI.START_X, ModelBMI.START_Y+2*ModelBMI.SPACE);
        this.add(lastNameL);
        this.lastNameF=new TextField(ModelBMI.START_X,ModelBMI.START_Y+3*ModelBMI.SPACE);
        this.add(lastNameF);

        Label ageL = new Label(ModelBMI.AGE_LABEL, ModelBMI.START_X, ModelBMI.START_Y+4*ModelBMI.SPACE);
        this.add(ageL);
        this.ageF=new TextField(ModelBMI.START_X,ModelBMI.START_Y+5*ModelBMI.SPACE);
        this.add(ageF);

        Label gender = new Label(ModelBMI.GENDER_LABEL, ModelBMI.START_X, ModelBMI.START_Y+6*ModelBMI.SPACE);
        this.add(gender);

        JRadioButton female = new JRadioButton(ModelBMI.GENDER_FIRST_VALUE);
        female.setBounds(ModelBMI.START_X,ModelBMI.START_Y+6*ModelBMI.SPACE+20, ModelBMI.LABEL_WIDTH, ModelBMI.LABEL_HEIGHT);
        JRadioButton male = new JRadioButton(ModelBMI.GENDER_SECOND_VALUE);
        male.setBounds(ModelBMI.START_X,ModelBMI.START_Y+7*ModelBMI.SPACE+10, ModelBMI.LABEL_WIDTH, ModelBMI.LABEL_HEIGHT);

        this.genderGroup = new ButtonGroup();
        this.genderGroup.add (female);
        this.genderGroup.add (male);

        female.setBackground(ModelBMI.LIGHT_PURPLE);
        male.setBackground(ModelBMI.LIGHT_PURPLE);

        this.add (female);
        this.add (male);

        this.setPreferredSize(ModelBMI.PANEL_DIMENSION);


    }


    public void clear(){
        this.firstNameF.clear();
        this.lastNameF.clear();
        this.ageF.clear();
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