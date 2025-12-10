package com.vti.frontend;

import com.vti.utils.ScannerUtils;

import java.io.IOException;
import java.sql.SQLException;

public class DepartmentMenu {
    private DepartmentProgram departmentP;
    public DepartmentMenu() throws SQLException, IOException, ClassNotFoundException {
        super();
        departmentP = new DepartmentProgram();
    }
    public void showMenu() throws ClassNotFoundException, SQLException {
        while(true){
            System.out.println("Department Menu");
            System.out.println("1. Get list Department");
            System.out.println("2. Get list Department with ID = 5");
            System.out.println("3. Get Department by ID");
            int choose = ScannerUtils.inputIntPositive();
            switch(choose){
                case 1:
                    departmentP.getAllDep();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
