package TesttingSystem_1.FrontEnd;
import java.text.SimpleDateFormat;
import java.util.*;
public class EX2 {
    static void main() {
        //Question 1
        System.out.println("Question 1:Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó");
        int i = 5;
        System.out.printf("%d%n", i);
        //Question 2
        System.out.println("Question 2:Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in ra số nguyên đó ");
        int i1 = 100000000;
        System.out.printf(Locale.US,"%,d%n",i1); //%n = xuong dong
        //Question3
        System.out.println("Question 3: Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau\n");
        float c = 5.567098f;
        System.out.printf("%5.4f%n", c);
        //Question 4
        System.out.println("Question 4: Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định dạng như sau");
        String name = "Tran Minh";
        System.out.println("My name is " + name + " and i'm FA");
        //Question 5
        System.out.println("Question 5: Lấy thời gian bây giờ và in ra theo định dạng dd:MM:yyyy hh:mm:ss");
        String time = "dd:MM:yyyy HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(time);
        String date = sdf.format(new Date());
        System.out.println(date);










//        float f = 10.6f;
//        double d = 10.6;
//        int a = 10;
//        Integer a1 = Integer.valueOf(a); //chuyen int sang Integer(tu primitive sang wrapper)
//        int a2 = a1.intValue(); //chuyen Integer sang int(tu wrapper sang primitive)
//        System.out.println(a);
//        System.out.println(f);
//        System.out.println(d);
//
//        float k = 4.5f;
//        int m = (int) k;
//        System.out.println(m); //downcasting float to int
//        int j = 5;
//        float f1 = (float) j;
//        System.out.println(f1); //upcasting int to float
//
//        float Salary1;
//        float Salary2;
//        Salary1 = (float) 5240.5;
//        Salary2 = (float) 10970.055;
//        System.out.println("Salary1: " + Salary1 + "||  Salary2: " + Salary2);
//        int intSalary1 = Math.round(Salary1);
//        int intSalary2 = (int) Salary2;
//        System.out.println("intSalary1: " + intSalary1 + " ||  intSalary2: " + intSalary2);
//        String name = "Tran Minh";
//        String[] w = name.split(" "); //Dem so luong tu trong chuoi
//        System.out.println(w.length);


}
}
