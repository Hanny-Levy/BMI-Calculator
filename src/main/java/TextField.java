import javax.swing.*;


public class TextField extends JTextField{

    // Setting the default text field
    public TextField(int x,int y){
        final int WIDTH=165 , HEIGHT=25;
        this.setBounds(x,y,WIDTH,HEIGHT);
    }

    public void reset(){
        this.setText(null);
    }


}
