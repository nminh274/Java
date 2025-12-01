package TestingSystem_7.backend;
import java.util.*;
public class Student {
    //Q1
    private int id;
    private String name;
    public static String college = "Đại học Bách Khoa";
    public static int COUNT = 0;
    public static int moneyGr = 0;
    Scanner s = new Scanner(System.in);
    public Student(){
        COUNT++;
//        if (COUNT > 7) {
//            System.err.println("Số lượng sinh viên đã vượt quá 7, không thể tạo thêm sinh viên");
//        } else {
            this.id = COUNT;
            System.out.println("-> Nhập vào tên sinh viên: ");
            this.name = s.nextLine();
//        }
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", collect:" + college +"]";
    }
    public String getCollege() {
        return Student.college;
    }

    public void SetCollect(String newCollect) {
        Student.college = newCollect;
    }

}
