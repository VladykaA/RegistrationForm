package mvc.controller;

import mvc.view.View;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import static mvc.view.TextConstant.*;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGE_BUNDLE_NAME, //new Locale("ua", "UA"));
                    new Locale("en"));

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputStringValueWithScanner(String message, String regex) {
        String res = "";

        view.print(bundle.getString(INPUT_STRING_DATA), bundle.getString(LAST_NAME));

        while (!scanner.hasNext() && !(res = scanner.next()).matches(regex)) {
            view.print(bundle.getString(WRONG_INPUT_DATA),
                    bundle.getString(INPUT_STRING_DATA),
                    bundle.getString(message));
        }

        return res;
    }
}
