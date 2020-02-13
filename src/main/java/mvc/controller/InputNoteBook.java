package mvc.controller;

import mvc.model.user.Address;
import mvc.model.user.User;
import mvc.view.View;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.Scanner;

import static mvc.view.TextConstant.*;
import static mvc.controller.RegexContainer.*;

public class InputNoteBook {
    private View view;
    private Scanner scanner;

    public InputNoteBook(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public User inputNote() {
        User user = new User();
        Address address = new Address();

        UtilityController controller = new UtilityController(scanner, view);
        ResourceBundle bundle = UtilityController.bundle;
        String locale = String.valueOf(bundle.getLocale());
        String str = locale.equals("ua") ? REGEX_NAME_UKR : REGEX_NAME_LAT;
//show message in console
        String string = bundle.getString(LAST_NAME);
        view.print(string);

        user.setLastName(controller.inputStringValueWithScanner(scanner.next(), str));
        user.setLogin(controller.inputStringValueWithScanner(scanner.next(), str));
        setDateOfCreation(user);
        return user;
    }


    private void setDateOfCreation(User user) {
        Date date = new Date();
        String pattern = "dd.MM.yyyy hh:mm";
        SimpleDateFormat simpleDate = new SimpleDateFormat(pattern);
        user.setDateOfCreation(simpleDate.format(date));
    }
}
