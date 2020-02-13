package MVC.Controller;

import MVC.View.View;

import java.util.Scanner;

import static MVC.Controller.RegexContainer.*;
import static MVC.View.TextConstant.LAST_NAME;
import static MVC.View.TextConstant.LOGIN_DATA;

public class InputNoteBook {
    private View view;
    private Scanner scanner;

    public InputNoteBook(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public void inputNote() {
        UtilityController controller = new UtilityController(scanner, view);
        String str = String.valueOf(View.bundle.getLocale()).equals("ua") ?
                REGEX_NAME_UKR : REGEX_NAME_LAT;
        this.lastName = controller.inputStringValueWithScanner(LAST_NAME, str);
        this.login = controller.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN);
    }
}
