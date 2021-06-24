public class LoginPage {

    private String name ;
    private String email ;
    private String phone ;
    private String homeAddress ;
    private String password ;

    public LoginPage(String name , String email, String phone , String password , String homeAddress) {
        this.name = name ;
        this.email = email ;
        this.homeAddress = homeAddress ;
        this.password = password ;
        this.phone = phone ;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
