package MVC.Model;

import User.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model {

    private Pattern pattern;
    private Matcher matcher;
    private List<User> userList = new ArrayList<>();

    public Model() {
    }

    public boolean matchingLoginName(String str){
        pattern = Pattern.compile("^(?=.{8,20}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$");
        matcher = pattern.matcher(str);
        return matcher.matches();
    }


    public boolean matchingLastNameInEnglish(String str){
        pattern = Pattern.compile("[A-Z][a-z]{1,20}");
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean matchingLastNameInUkrainian(String str){
        pattern = Pattern.compile("[А-ЩЇІЄҐ][а-їієґ']{1,20}");
        matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public void savingUserToList(User user){
        userList.add(user);
    }
}
