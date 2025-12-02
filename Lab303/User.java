package Lab303;

public class User {

    private String password ;

    public User(String initialPassword) {

        this.password = initialPassword ;
    }

    public String getPassword() {

        return this.password ;

    }

    public void setPassword(String newPassword) {

        if (newPassword.length() >= 8) {

            this.password = newPassword ;
            System.out.println("Password update") ;

        }
        else {

            System.out.println("Password is too short") ;

        }
    }

}
