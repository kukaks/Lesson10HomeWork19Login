public class User {

    private String login;
    Acount acount;

    public User(String login, String password) {
        this.login = login;
        acount = new Acount(password);
    }

    class  Acount{
        String password;

        public Acount(String password) {
            this.password = password;
        }

        public void displayAccount() {
            System.out.println("Account Login successful! Login: " + login + ", Password: " + password);
        }
    }

}
