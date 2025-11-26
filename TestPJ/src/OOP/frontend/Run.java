package OOP.frontend;
import OOP.entity2.Student;
import OOP.entity2.Teacher;
import java.util.*;
public class Run {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int choice = 0;
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();
        do {
            System.out.println("---------Menu---------");
            System.out.println("0. Quit");
            System.out.println("1. Add Teacher");
            System.out.println("2. Display Teachers");
            System.out.println("3. Add Student");
            System.out.println("4. Display Students");
            System.out.println("5. Delete Teachers");
            System.out.println("6. Delete Students");
            choice = SC.nextInt();
            switch (choice) {
                case 0 -> {
                    break;
                }
                case 1 -> {
                    Teacher t2 = new Teacher();
                    t2.addPerson();
                    teachers.add(t2);
                }
                case 2 -> {
                    if(teachers.isEmpty()){
                        System.out.println("There is no teacher in the system");
                    }else {
                        for (Teacher t : teachers) {
                            t.display();
                        }
                    }
                }
                case 3 -> {
                    Student s2 = new Student();
                    s2.addPerson();
                    students.add(s2);
                }
                case 4 -> {
                    if(students.isEmpty()){
                        System.out.println("There is no student in the system");
                    } else{
                        for (Student s : students) {
                            s.display();
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Choose ID to delete");
                    int choice2 = SC.nextInt();
                    for(int i = 0; i < teachers.size(); i++){
                        if(teachers.get(i).getId() == choice2){
                            teachers.remove(i);
                            System.out.println("Teacher deleted successfully");
                        } else {
                            System.out.println("ID not found");
                        }
                    }
                }
                case 6 ->{
                    System.out.println("Choose ID to delete");
                    int choice2 = SC.nextInt();
                    for(int i = 0;i < students.size();i++){
                        if(students.get(i).getId() == choice2){
                            students.remove(i);
                            System.out.println("Student deleted successfully");
                        } else {
                            System.out.println("ID not found");
                        }
                    }
                }
            }
        } while(choice != 0);
    }
}
