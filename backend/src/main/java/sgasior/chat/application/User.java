package sgasior.chat.application;

public class User {

    private String nick;
    private String color;

    public User() {

    }

    public User(String nick, String color) {
        this.nick = nick;
        this.color = color;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (nick != null ? !nick.equals(user.nick) : user.nick != null) return false;
        return color != null ? color.equals(user.color) : user.color == null;
    }

    @Override
    public int hashCode() {
        int result = nick != null ? nick.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
