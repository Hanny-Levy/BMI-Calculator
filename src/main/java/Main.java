import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {


    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        this.setFrame();
        this.setPrimaryPanel();
        this.setVisible(true);

    }

    private JPanel sendInfoPanel ;
    private PersonalInfo personalInfoPanel;
    private BodyInfo bodyInfoPanel;
    private BMIResult bmiResult;

    public void setPrimaryPanel(){
        // Setting Primary panel
        JPanel primaryPanel = new JPanel();
        primaryPanel.setLayout(new BorderLayout());
        primaryPanel.setSize(new Dimension(Def.PANEL_WIDTH, Def.PANEL_HEIGHT));

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
        this.setSize(new Dimension(Def.FRAME_WIDTH, Def.FRAME_HEIGHT));


    }

    public void setSendInfoPanel(){
        // Setting buttons reset and submit and adding them to sentInfo panel and to primary panel.
        JButton clear = new JButton("Reset");
        clear.addActionListener( this);
        JButton submit = new JButton("Submit");
        submit.addActionListener(e -> {
                    try {
                        bmiResult.submit(bodyInfoPanel.getPersonalHeight(), bodyInfoPanel.getWeight(), bodyInfoPanel.getSlimness(), personalInfoPanel.getAge());
                    } catch (NumberFormatException | NullPointerException exception) {
                        this.bodyInfoPanel.addMessage();
                    }
                }
        );

        this.sendInfoPanel=new JPanel();
        this.sendInfoPanel.add(clear);
        this.sendInfoPanel.add(submit);
        this.sendInfoPanel.setBackground(Def.DARK_PURPLE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.personalInfoPanel.reset();
        this.bodyInfoPanel.reset();
        this.bmiResult.reset();
    }



}
