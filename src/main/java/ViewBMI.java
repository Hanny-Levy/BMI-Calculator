import javax.swing.*;
import java.awt.*;

public class ViewBMI extends JFrame {




    public ViewBMI(){
        this.setFrame();
        this.setPrimaryPanel();
        this.setVisible(true);

    }

    private JPanel sendInfoPanel ;
    public PersonalInfo personalInfoPanel;
    public BodyInfo bodyInfoPanel;
    public BMIResult bmiResult;
    public JButton clear ,submit ;


    public void setPrimaryPanel(){
        // Setting Primary panel
        JPanel primaryPanel = new JPanel();
        primaryPanel.setLayout(new BorderLayout());
        primaryPanel.setSize(new Dimension(ModelBMI.PANEL_WIDTH, ModelBMI.PANEL_HEIGHT));

        this.getContentPane().add(primaryPanel);

        Instructions instructionsPanel = new Instructions();
        this.personalInfoPanel=new PersonalInfo();
        this.bodyInfoPanel =new BodyInfo();
        this.bmiResult=new BMIResult();
        this.setSendInfoPanel();

        // Adding the panels to primary panel
        primaryPanel.add(instructionsPanel,BorderLayout.NORTH);
        primaryPanel.add(personalInfoPanel,BorderLayout.WEST);
        primaryPanel.add(bodyInfoPanel,BorderLayout.CENTER);
        primaryPanel.add(bmiResult,BorderLayout.EAST);
        primaryPanel.add(sendInfoPanel,BorderLayout.SOUTH);

    }

    public void setFrame(){
        // Setting frame
        this.setTitle("BMI Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(new Dimension(ModelBMI.FRAME_WIDTH, ModelBMI.FRAME_HEIGHT));


    }

    public void setSendInfoPanel(){
        // Setting buttons reset and submit and adding them to sentInfo panel and to primary panel.
        clear = new JButton("Reset");
        submit = new JButton("Submit");


        this.sendInfoPanel=new JPanel();
        this.sendInfoPanel.add(clear);
        this.sendInfoPanel.add(submit);
        this.sendInfoPanel.setBackground(ModelBMI.DARK_PURPLE);

    }



}
