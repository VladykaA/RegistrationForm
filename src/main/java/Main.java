import MVC.controller.Controller;
import MVC.Model.Model;
import MVC.View.View;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
