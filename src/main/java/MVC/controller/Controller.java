package MVC.controller;

import MVC.View.View;
import MVC.Model.Model;

import java.util.Scanner;

public class Controller {

    private View view;

    public Controller(Model model, View view) {
        this.view = view;
    }

    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        InputNoteBook inputNoteBook = new InputNoteBook(view, scanner);
        inputNoteBook.inputNote();
    }
}


