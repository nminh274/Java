package TesttingSystem_1.Entity;
public class Run {
    public static void main(String[] args) {
        Department d1 = new Department();
        d1.id = 1;
        d1.name = "name1";

        Position p1 = new Position();
        p1.id = 1;
        p1.name = Position.PositionName.Dev;

        Group g1 = new Group();
        g1.id = 1;
        g1.gname = "gName1";

        Account a1 = new Account();
        a1.id = 1;
        a1.email = "email1";
        a1.userName = "user1";
        a1.fullName = "fullname1";
        a1.position = p1;
        a1.department = d1;
        a1.groups = g1;

        System.out.println(a1.id);
        System.out.println(a1.email);
        System.out.println(a1.userName);
        System.out.println(a1.fullName);
        System.out.println(a1.position.name);
        System.out.println(a1.department.name);
        System.out.println(a1.groups.gname);
    }
}