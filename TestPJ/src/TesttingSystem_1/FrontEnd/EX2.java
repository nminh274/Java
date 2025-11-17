package TesttingSystem_1.FrontEnd;
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



        //Test
        float f = 10.6f;
        double d = 10.6;
        int a = 10;
        Integer a1 = Integer.valueOf(a); //chuyen int sang Integer(tu primitive sang wrapper)
        int a2 = a1.intValue(); //chuyen Integer sang int(tu wrapper sang primitive)
        System.out.println(a);
        System.out.println(f);
        System.out.println(d);

        float k = 4.5f;
        int m = (int) k;
        System.out.println(m); //downcasting float to int
        int j = 5;
        float f1 = (float) j;
        System.out.println(f1); //upcasting int to float

        float Salary1;
        float Salary2;
        Salary1 = (float) 5240.5;
        Salary2 = (float) 10970.055;
        System.out.println("Salary1: " + Salary1 + "||  Salary2: " + Salary2);
        int intSalary1 = Math.round(Salary1);
        int intSalary2 = (int) Salary2;
        System.out.println("intSalary1: " + intSalary1 + " ||  intSalary2: " + intSalary2);
        String name = "Tran Minh";
        String[] w = name.split(" "); //Dem so luong tu trong chuoi
        System.out.println(w.length);


}
}
