package OOP.entity;
import java.time.*;
import java.util.*;
import javax.swing.text.*;

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
    public Account(int id, String email, String userName, String fullName, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.createDate = createDate;
    }
}
