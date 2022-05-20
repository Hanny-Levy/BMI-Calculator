import java.awt.*;

public class ModelBMI {

    public static final int FRAME_WIDTH=900;
    public static final int FRAME_HEIGHT=600;

    public static final int PANEL_WIDTH=FRAME_WIDTH/3;
    public static final int PANEL_HEIGHT= ModelBMI.FRAME_HEIGHT;

    public static final int LABEL_WIDTH=80;
    public static final int LABEL_HEIGHT=25;

    public static final double SMALL=0.9;
    public static final double MEDIUM=1;
    public static final double LARGE=1.1;

    public static final int START_X=10;
    public static final int START_Y=20;
    public static final int SPACE=30;


    public static final Dimension PANEL_DIMENSION=new Dimension(ModelBMI.FRAME_WIDTH/3 , ModelBMI.FRAME_HEIGHT);

    public static final Color LIGHT_PURPLE=new Color(229,204,255);
    public static final Color DARK_PURPLE=new Color(204,153,255);

    public static final String CAPTION_LABEL="Please complete this form. Press the Submit button when complete. ";
    public static final String HEAD_LINE_LABEL="BMI Calculator";
    public static final String ACTUAL_WEIGHT_LABEL  = "Actual weight:";
    public static final String FIRST_NAME_LABEL  =  "First Name:";
    public static final String LAST_NAME_LABEL  =  "Last Name:";
    public static final String AGE_LABEL  ="Age :";
    public static final String GENDER_LABEL  ="Gender :";
    public static final String GENDER_FIRST_VALUE="Female";
    public static final String GENDER_SECOND_VALUE="Male";

    public static final String TEXT_FIELD_DEFAULT_VALUE=null;
    public static final String BODY_FRAME_LABEL="Body-frame:";
    public static final String BODY_FRAME_FIRST_VALUE="Small";
    public static final String BODY_FRAME_SECOND_VALUE ="Medium";
    public static final String BODY_FRAME_THIRD_VALUE ="Large";

    public static final int HEIGHT_SLIDER_MINIMUM_VALUE=140;
    public static final int HEIGHT_SLIDER_MAX_VALUE=190;
    public static final int HEIGHT_SLIDER_MAJOR_TICK_SPACING=10;
    public static final int HEIGHT_SLIDER_MINOR_TICK_SPACING=5;
    public static final String HEIGHT_LABEL_DEFAULT_TEXT = "Height: "+ HEIGHT_SLIDER_MINIMUM_VALUE+" cm";

    public static final int ERROR_CODE_PERSONAL_DETAILS_NOT_FOUND =1;
    public static final int ERROR_CODE_INVALID_INPUT =2;
    public static final String ERROR_MASSAGE_PERSONAL_DETAILS_NOT_FOUND="You are missing one or more parameters , please complete them.";
    public static final String ERROR_MASSAGE_INVALID_INPUT="Invalid input please try again";

    public static final String BMI_LABEL="BMI :";
    public static final String WEIGHT_STATUS_LABEL="Weight status: ";
    public static final String IDEAL_WEIGHT_LABEL="Your ideal weight: " ;

    public static final String BMI_LABEL_DEFAULT_VALUE="";
    public static final String WEIGHT_STATUS_DEFAULT_VALUE="";
    public static final String IDEAL_WEIGHT_DEFAULT_VALUE="";

    public static final String CLEAR_BUTTON="clear";
    public static final String SUBMIT_BUTTON="Submit";

    public static final String FRAME_TITLE="BMI Calculator";

    public static final int PICTURE_WIDTH=120;
    public static final int PICTURE_HEIGHT=120;






}
