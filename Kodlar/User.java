public interface User {

    boolean login(String mail,String password);
    void setUserName(String name);
    void setUserSurname(String surname);
    void setUserMail(String mail);
    void setUserPassword(String password);
    void setUserID(int id);
    String getUserName();
    String getUserSurname();
    String getUserMail();
    String getUserPassword();
    int getUserID();
}
