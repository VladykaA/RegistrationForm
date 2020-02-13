package MVC.View;

import java.util.Locale;
import java.util.ResourceBundle;

import static MVC.View.TextConstant.*;

public class View {

    static String MESSAGE_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGE_BUNDLE_NAME,
            new Locale("ua", "UA"));
    //new Locale ("en"));

    public void print(String str) {
        System.out.println(str);
    }

    public String concatenationString(String... message) {
        StringBuilder concat = new StringBuilder();
        for (String str : message) {
            concat = concat.append(str);
        }
        return new String(concat);
    }

    public void printInputString(String message) {
        print(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongInput(String message){
        print(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }
}
