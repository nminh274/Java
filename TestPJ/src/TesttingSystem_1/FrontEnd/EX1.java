package TesttingSystem_1.FrontEnd;
import TesttingSystem_1.Entity.Account;
import TesttingSystem_1.Entity.Department;
import TesttingSystem_1.Entity.Group;
import TesttingSystem_1.Entity.Position;

public class EX1 {
    public static void main(String[] args) {
        Department d1 = new Department();
        d1.id = 1;
        d1.name = "name1";
        Department d2 = new Department();
        d2.id = 2;
        d2.name = "name2";
        Department d3 = new Department();
        d3.id = 3;
        d3.name = "name3";

        Position p1 = new Position();
        p1.id = 1;
        p1.name = Position.PositionName.Dev;
        Position p2 = new Position();
        p2.id = 2;
        p2.name = Position.PositionName.PM;

        Group g1 = new Group();
        g1.id = 1;
        g1.gname = "gName1";
        g1.creator = "creator1";
        Group g2 = new Group();
        g2.id = 2;
        g2.gname = "gName2";
        g2.creator = "creator2";
        Group g3 = new Group();
        g3.id = 2;
        g3.gname = "gName3";
        g3.creator = "creator3";
        Group[] gr1 = {g1, g2};
        Group[] gr2 = {g2, g3};

        Account a1 = new Account();
        a1.id = 1;
        a1.email = "email1";
        a1.userName = "user1";
        a1.fullName = "fullname1";
        a1.position = p1;
        a1.department = d1;
        a1.groups = new Group[]{g2, g3};
        Account a2 = new Account();
        a2.id = 2;
        a2.email = "email2";
        a2.userName = "user2";
        a2.fullName = "fullname2";
        a2.position = p2;
        a2.department = d2;
        a2.groups = new Group[]{g1, g2};
        Account a3 = new Account();
        a3.id = 3;
        a3.email = "email3";
        a3.userName = "user3";
        a3.fullName = "fullname3";
        a3.department = d3;
        a3.groups = new Group[]{g1, g3};
        //EX1
        //Question 1:
        System.out.println("---------Question 1 Check acc2:---------");
        if (a2.department == null) {
            System.out.print("Nhân viên này chưa có phòng ban.");
        } else {
            System.out.println("Phòng ban của nv này là: " + a2.department.name);
        }
        //Question 2
        System.out.println("---------Question 2: Làm theo IF ---------");
        if (a2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else {
            if (a2.groups.length == 1 || a2.groups.length == 2) {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
            }
            if (a2.groups.length == 3) {
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
            }
            if (a2.groups.length >= 4) {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
            }
        }
        //Question 3
        System.out.println("---------Question 3: Sử dụng toán tử ternary làm Q1---------");
        System.out.println(a2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là " + a2.department.name);
        //Question 4
        System.out.println("---------Question 4: Check position account 1---------");
        if (a1.position.name.toString() == "Dev") {
            System.out.println("This is a Developer");
        } else {
            System.out.println("This is not a Developer");
        }
        //Question 5
        System.out.println("---------Question 5: Check number of accounts in group---------");
        if (gr1.length == 0) {
            System.out.println("No accounts in group");
        } else {
            switch (gr1.length) {
                case 1:
                    System.out.println("1 account in group");
                    break;
                case 2:
                    System.out.println("2 accounts in group");
                    break;
                case 3:
                    System.out.println("3 accounts in group");
                    break;
                default:
                    System.out.println("Many accounts in group");
            }
        }
        //Question 6
        System.out.println("---------Question 6: Use Switch Case do Question 2---------");
        if (a2.groups.length == 0) {
            System.out.println("This employee does not have a group yet.");
        } else {
            switch (a2.groups.length) {
                case 1, 2:
                    System.out.println("This employee's groups is Java Fresher, C# Fresher");
                    break;
                case 3:
                    System.out.println("This employee is an important person,joined many groups");
                    break;
                case 4:
                    System.out.println("This employee joined many groups to see many dramas");
            }
        }
        //Question 7
        System.out.println("---------Question 7: Use Switch Case do Question 4---------");
        switch (a1.position.name.toString()) {
            case "Dev":
                System.out.println("This is a Developer");
                break;
            default:
                System.out.println("This is not a Developer");
        }
        //Question 8
        System.out.println("---------Question 8: Print account infomation(For Each)---------");
        Account[] accArr = {a1, a2, a3};
        for (Account a : accArr) {
            System.out.println("Name: " + a.id + " | Email: " + a.email + " | FullName: " + a.fullName);
        }
        //Question 9
        System.out.println("---------Question 9: Print department information---------");
        Department[] depArr = {d1, d2};
        for (Department d : depArr) {
            System.out.println("ID: " + d.id + " | Name: " + d.name);
        }
        //Question 10
        System.out.println("---------Question 10: Print accounts information---------");
        Account[] AccArr = {a1, a2};
        for (int i = 0; i < AccArr.length; i++) {
            System.out.println("-> Account " + (i + 1) + ": ");
            System.out.println("Email: " + AccArr[i].email);
            System.out.println("FullName: " + AccArr[i].fullName);
            System.out.println("Department: " + AccArr[i].department.name);
        }
        //Question 11
        System.out.println("---------Question 11: Department information---------");
        Department[] depArray = {d1, d2};
        for (int i = 0; i < depArray.length; i++) {
            System.out.println("-> Department " + (i + 1) + ":");
            System.out.println("Id: " + depArray[i].id);
            System.out.println("Name: " + depArray[i].name);
        }
        //Question 13
        System.out.println("----------Question 13:Print account's information except account 2 ------------");
        Account[] accArray2 = {a1, a2, a3};
        for (int i = 0; i < accArray2.length; i++) {
            if (i != 1) {
                System.out.println("-> Account " + (i + 1) + ":");
                System.out.println("Email: " + accArray2[i].email);
                System.out.println("Full name: " + accArray2[i].fullName);
                System.out.println("Phòng ban: " + accArray2[i].department.name);
            }
        }
        //Question 14
        System.out.println("---------Question 14: Print account id < 3 information---------");
        Account[] AccArray3 = {a1, a2, a3};
        for (int j = 0; j < AccArray3.length; j++) {
            if (AccArray3[j].id < 3) {
                System.out.println("-> Account " + (j + 1) + ":");
                System.out.println("Email: " + AccArray3[j].email);
                System.out.println("Full name: " + AccArray3[j].fullName);
                System.out.println("Phòng ban: " + AccArray3[j].department.name);
            }
        }
        //Question 20
        System.out.println("---------Question 15: Print even numnber <= 20---------");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }


//        System.out.println("->A1: ");
//        System.out.println(a1.id);
//        System.out.println(a1.email);
//        System.out.println(a1.userName);
//        System.out.println(a1.fullName);
//        System.out.println(a1.position.name);
//        System.out.println(a1.department.name);
//        for(int i = 0;i < gr1.length;i++) {
//            System.out.println(a1.groups[i].creator);
//        }
//        System.out.println("->A2: ");
//        System.out.println(a2.id);
//        System.out.println(a2.email);
//        System.out.println(a2.userName);
//        System.out.println(a2.fullName);
//        System.out.println(a2.position.name);
//        System.out.println(a2.department.name);
//        for(int i = 0;i < gr2.length;i++) {
//            System.out.println(a2.groups[i].creator);
//        }
    }
}