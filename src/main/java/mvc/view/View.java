package mvc.view;

public class View {

    public void print(String... messages) {
        System.out.println(concatenationString(messages));
    }

    public String concatenationString(String... messages) {
        StringBuilder concat = new StringBuilder();

        for (String str : messages) {
            concat.append(str);
        }

        return concat.toString();
    }
}
