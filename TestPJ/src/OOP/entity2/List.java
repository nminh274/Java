package OOP.entity2;
import java.util.*;
import java.lang.*;
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
    public void deleteStudent(int id){
        int index=-1;
        for(int i=0;i<sl.size();i++){
            if(sl.get(i).getId() == id){
                index = i;
                sl.remove(i);
                break;
            }
        }
    }
}
