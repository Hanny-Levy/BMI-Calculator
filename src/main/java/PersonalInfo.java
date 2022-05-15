import javax.swing.*;

public class PersonalInfo extends JPanel {
    private final TextField firstNameF;
    private final TextField lastNameF;
    private final TextField ageF;
    private final ButtonGroup genderGroup;


    public PersonalInfo() {
        this.setLayout(null);
        this.setBackground(Def.LIGHT_PURPLE);

        Label firstNameL = new Label("First Name:", Def.START_X, 20);
        this.add(firstNameL);
        this.firstNameF=new TextField(Def.START_X,50);
        this.add(firstNameF);

        Label lastNameL = new Label("Last Name:", Def.START_X, 80);
        this.add(lastNameL);
        this.lastNameF=new TextField(Def.START_X,110);
        this.add(lastNameF);

        Label ageL = new Label("Age:", Def.START_X, 140);
        this.add(ageL);
        this.ageF=new TextField(Def.START_X,170);
        this.add(ageF);

        Label gender = new Label("Gender :", Def.START_X, 200);
        this.add(gender);

        JRadioButton female = new JRadioButton("female");
        female.setBounds(Def.START_X,230,Def.LABEL_WIDTH,Def.LABEL_HEIGHT);
        JRadioButton male = new JRadioButton("male");
        male.setBounds(Def.START_X,250,Def.LABEL_WIDTH,Def.LABEL_HEIGHT);

        this.genderGroup = new ButtonGroup();
        this.genderGroup.add (female);
        this.genderGroup.add (male);

        female.setBackground(Def.LIGHT_PURPLE);
        male.setBackground(Def.LIGHT_PURPLE);

        this.add (female);
        this.add (male);

        this.setPreferredSize(Def.PANEL_DIMENSION);


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
}