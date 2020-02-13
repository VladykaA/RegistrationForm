import mvc.controller.Controller;
import mvc.view.View;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller(new View());
        controller.processUser();
    }
}
