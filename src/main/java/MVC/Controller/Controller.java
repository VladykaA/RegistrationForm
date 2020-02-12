package MVC.Controller;

import MVC.View.View;
import MVC.Model.Model;
import User.User;
import static Util.ResourceUtil.*;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;
    public static final Scanner SCANNER = new Scanner(System.in);
    public User user;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        user = new User();
        registrationOfTheUser();
    }

    private void registrationOfTheUser() {
        view.print(WELCOME_AND_LOGIN);
        while (SCANNER.hasNext()) {
            validateInput(SCANNER.next());
            SCANNER.next();
        }
    }

    private void validateInput(String input) {
        if (!input.isEmpty() && model.matchingLoginName(input)) {
            user.setLoginName(input);
        }view.print(WRONG_INPUT);
    }
}
