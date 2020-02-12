package MVC.View;

import User.User;

import java.util.List;

public class View {
    public void print(String str){
        System.out.println(str);
    }

    public void print(List<User> list){
        list.forEach(user -> System.out.print(user + "\t"));
    }
}
