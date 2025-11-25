package OOP.entity2;
import java.util.*;
public class Student extends Person{
    private float fee;
    private double gpa;
    Scanner SC = new Scanner(System.in);

    public Student(int id, String Fname, String Lname, int age, float fee, double gpa) {
        super(id, Fname, Lname, age);
        this.fee = fee;
        this.gpa = gpa;
    }
    public Student(){}

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }
    public double calculateFee(){
        if(gpa > 3.5){
            return fee - (fee/2);
        } else
            return fee;
    }
    @Override
    public void addPerson(){
        super.addPerson();
        System.out.print("Fee: ");
        fee = SC.nextFloat();
        System.out.print("Gpa: ");
        gpa = SC.nextDouble();
    }
    @Override
    public void display(){
        System.out.println("---------STUDENT INFO---------");
        super.display();
        System.out.println("Fee: " + fee);
        System.out.println("Gpa: " + gpa);
    }
}
