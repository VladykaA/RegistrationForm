package MVC.controller;

import MVC.Model.User.Address;
import MVC.Model.User.User;
import MVC.View.View;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static MVC.View.TextConstant.LAST_NAME;
import static MVC.View.TextConstant.LOGIN_DATA;
import static MVC.controller.RegexContainer.*;

public class InputNoteBook {
    private View view;
    private Scanner scanner;
    private User user;
    private Address address;

    public InputNoteBook(View view, Scanner scanner) {
        this.view = view;
        this.scanner = scanner;
    }

    public void inputNote() {
        user = new User();
        address = new Address();

        UtilityController controller = new UtilityController(scanner, view);
        String str = String.valueOf(View.bundle.getLocale()).equals("ua") ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        user.setLastName(controller.inputStringValueWithScanner(LAST_NAME, str));
        user.setLogin(controller.inputStringValueWithScanner(LOGIN_DATA, REGEX_LOGIN));
    }


    private void saveDateOfCreation() {
        Date date = new Date();
        String pattern = "dd.MM.yyyy hh:mm";
        SimpleDateFormat simpleDate = new SimpleDateFormat(pattern);
        user.setDateOfCreation(simpleDate.format(date));
    }
}
