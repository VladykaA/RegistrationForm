package MVC.Controller;

import MVC.View.View;
import MVC.Model.Model;
import User.User;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;
    public static final Scanner SCANNER = new Scanner(System.in);

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {

    }

    private void registrationOfTheUser() {
        while (SCANNER.hasNext()) {
            validateInput(SCANNER.next(), SCANNER.next());
            SCANNER.next();
            
        }
    }

    private void validateInput(String input1, String input2) {
        if (!input1.isEmpty() && !input2.isEmpty()) {
            model.matchingLastNameInEnglish(input1);{
                model.savingUserToList(new User("", input1));
            }
        }
    }
}
