package MVC.Controller;

import MVC.View.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputStringValueWithScanner(String message, String regex) {
        String res = null;
        view.printInputString(message);
        while (!(scanner.hasNext()) && (res = scanner.next()).matches(regex)) {
            view.printWrongInput(message);
        }
        return res;
    }
}
