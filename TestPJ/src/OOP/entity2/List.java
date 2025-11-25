package OOP.entity2;
import java.util.*;
public class List {
    Scanner SC = new Scanner(System.in);
    ArrayList<Student> sl = new ArrayList<>();
    ArrayList<Teacher> tl = new ArrayList<>();
    public void addStudent(Student s){
        s.addPerson();
        sl.add(s);
        System.out.println("Added successfully");
    }
    public void addTeacher(Teacher t){
        t.addPerson();
        tl.add(t);
        System.out.println("Added successfully");
    }
    public void displayStudents(){
        for(Student s1 : sl){
            System.out.println(s1);
        }
    }
    public void displayTeachers(){
        for(Teacher t1 : tl){
            System.out.println(t1);
        }
    }
}
