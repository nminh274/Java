package OOP.entity2;
import java.util.*;
public class Person implements Interfacee{
    private int id;
    private String Fname;
    private String Lname;
    private int age;
    Scanner SC = new Scanner(System.in);
    public Person(int id, String Fname, String Lname,int age) {
        this.id = id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
    }

    public Person() {

    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void addPerson(){
        System.out.print("Enter your ID: ");
        id = SC.nextInt();
        System.out.print("First name: ");
        Fname = SC.nextLine();
        SC.next();
        System.out.print("Last name: ");
        Lname = SC.nextLine();
        SC.next();
        System.out.print("Age: ");
        age = SC.nextInt();
    }
    @Override
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("First name: " + Fname);
        System.out.println("Last name: " + Lname);
        System.out.println("Age: " + age);
    }
}
