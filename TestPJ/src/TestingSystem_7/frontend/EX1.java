package TestingSystem_7.frontend;
import java.util.*;
import TestingSystem_7.backend.*;

public class EX1 {
    Scanner sc = new Scanner(System.in);
    public void Q1() {

        System.out.print("-> Nhập số sinh viên cần khởi tạo(<7): ");
        int n = sc.nextInt();
        if(n > 7){
            System.err.println("Số lượng sinh viên đã vượt quá 7");
            n = 7;
        }
            Student[] studentArray = new Student[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Sinh viên " + (i + 1 + ":"));
                Student st = new Student();
                studentArray[i] = st;
            }
            System.out.println("-> Thông tin các sinh viên vừa nhập: ");
            for (int i = 0; i < studentArray.length; i++) {
                System.out.println(studentArray[i]);
            }
            System.out.println("-> Chuyển các sinh viên sang Đại học công nghệ: ");
            Student.college = "Đại học Công nghệ ";
            System.out.println("-> Thông tin sinh viên sau khi chuyển ");
            for (int i = 0; i < studentArray.length; i++) {
                System.out.println(studentArray[i]);
            }
            System.out.println("-> Các sinh viên nộp quỹ, mỗi bạn 100K: ");
            System.out.println("Tổng quỹ: " + (Student.moneyGr += (100 * n)));

            System.out.println("Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan: ");
            System.out.println("Tổng quỹ: " + (Student.moneyGr -= 50));

            System.out.println("Student thứ 2 lấy 20k đi mua bánh mì: ");
            System.out.println("Tổng quỹ: " + (Student.moneyGr -= 20));

            System.out.println("Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm: ");
            System.out.println("Tổng quỹ: " + (Student.moneyGr -= 150));

            System.out.println("Cả nhóm mỗi người lại đóng quỹ mỗi người 50k: ");
            System.out.println("Tổng quỹ: " + (Student.moneyGr += (50 * n)));
}
    public void Q4() {
        System.out.println("Get Set Collect: ");
        Student st = new Student();
        System.out.println("-> Thông tin: " + st.toString());
        System.out.println("-> Thay đổi Collect: Đại học Hà Nội");
        st.SetCollect("Đại học Hà Nội");
        System.out.println("-> Sau khi thay đổi: " + st.toString());
    }
    public void Q6() {
        System.out.print("Nhập số lượng PS: ");
        int nP = sc.nextInt();
        if(nP > 7){
            System.err.println("Số lượng sinh viên không được vượt quá 7");
            nP = 7;
        }
        for(int i = 0; i < nP; i++){
            PrimaryS PS = new PrimaryS();
        }
        System.out.print("Nhập số lượng SS: ");
        int sS = sc.nextInt();
        if(sS > 7){
            System.err.println("Số lượng sinh viên không được vượt quá 7");
            sS = 7;
        }
        for(int i = 0; i < sS; i++){
            SecondaryS SS = new SecondaryS();
        }

        System.out.println("Thông tin số lượng sinh viên");
        String leftAlignFormat = "| %-18s | %-4d |%n";

        System.out.format("+--------------------+------+%n");
        System.out.format("| Category           | SL   |%n");
        System.out.format("+--------------------+------+%n");

        System.out.format(leftAlignFormat, "Student", Student.COUNT);
        System.out.format(leftAlignFormat, "PrimaryStudent", PrimaryS.COUNTP);
        System.out.format(leftAlignFormat, "SecondaryStudent", SecondaryS.COUNTS);

        System.out.format("+--------------------+------+%n");
    }


}

