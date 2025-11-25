package OOP.entity2;
import java.util.*;
public class Teacher extends Person{
    private float Salary;
    private int numberOfClass;
    Scanner SC = new Scanner(System.in);

    public Teacher (int id, String Fname, String Lname, int age, float Salary, int numberOfClass){
        super(id, Fname, Lname, age);
        this.Salary = Salary;
        this.numberOfClass = numberOfClass;
    }

    public Teacher() {

    }

    public float getSalary() {
        return Salary;
    }
    public void setSalary(float salary) {
        Salary = salary;
    }
    public int getNumberOfClass() {
        return numberOfClass;
    }
    public void setNumberOfClass(int numberOfClass) {
        this.numberOfClass = numberOfClass;
    }
    @Override
    public void addPerson(){
        super.addPerson();
        System.out.print("Number of class: ");
        numberOfClass = SC.nextInt();
        System.out.print("Salary: ");
        Salary = SC.nextFloat();
    }
    @Override
    public void display(){
        System.out.println("---------TEACHER INFO---------");
        super.display();
        System.out.println("Number of class: " + numberOfClass);
        System.out.println("Salary: "  + Salary);
    }
}
