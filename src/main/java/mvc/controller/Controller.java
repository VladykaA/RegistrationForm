package mvc.controller;

import mvc.view.View;

import java.util.Scanner;

public class Controller {
    public static final Scanner SCANNER = new Scanner(System.in);

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public void processUser() {
        new InputNoteBook(view, SCANNER).inputNote();
    }
}


