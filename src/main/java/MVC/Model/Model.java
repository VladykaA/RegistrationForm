package MVC.Model;

import MVC.Model.User.User;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private User user;
    private List<User> userList = new ArrayList<>();


    public void savingUser(User user){
        userList.add(user);
    }
}
