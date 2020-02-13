package mvc.model.user;

public class UserBuilder {
    private User user;

    public UserBuilder() {
        user = new User();
    }

    public UserBuilder withAllPrams(){



        return this;
    }

    public User build(){
        return user;
    }
}
