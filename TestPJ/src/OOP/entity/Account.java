package OOP.entity;
import java.lang.*;
import java.time.*;
import java.util.*;
import javax.swing.text.*;
//Question2
public class Account {
    public int  id;
    public String email;
    public String userName;
    public String firstName;
    public String lastName;
    public String fullName;
    public Position p;
    public LocalDate createDate;
    public Account(){}
    public Account(String userName) {
        this.userName = userName;
    }

    public Account(int id, String email, String userName, String fullName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
    }
    public Account(int id, String email, String userName, String fullName, Position p) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.p = p;
        this.createDate = LocalDate.now();
    }
    public Account(int id, String email, String userName, String fullName, Position p, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.p = p;
        this.createDate = createDate;
    }
    private static void question2() {
        Account acc1 = new Account();
        Account acc2 = new Account(2, "email2", "username2", "fullname2");
        Position pos3 = new Position();
        Account acc3 = new Account(3, "email3", "username3", "fullname3", pos3);
        System.out.println(acc3.createDate);

        Position pos4 = new Position();
        Account acc4 = new Account(3, "email3", "username3", "fullname3", pos4, LocalDate.of(2021, 03, 17));
    }

}
