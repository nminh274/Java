package com.vti.frontend;


import com.vti.utils.JDBCTest;
import com.vti.utils.ScannerUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        DepartmentMenu dMenu = new DepartmentMenu();
        while (true) {
            String leftAlignFormat = "| %-72s |%n";
            System.out.format("+--------------------------------------------------------------------------+%n");
            System.out.format("|                        Choose please                                     |%n");
            System.out.format("+--------------------------------------------------------------------------+%n");
            System.out.format(leftAlignFormat, "1. Account Management");
            System.out.format(leftAlignFormat, "2. Department Management");
            System.out.format(leftAlignFormat, "3. Position Management");

            System.out.format(leftAlignFormat, "4. Exit");
            System.out.format("+--------------------------------------------------------------------------+%n");

            int choose = ScannerUtils.inputIntPositive();

            switch (choose) {
                case 1:
                    break;
                case 2:
                    dMenu.showMenu();
                    break;
                case 3:

                    break;

                case 4:
                    return;
                default:
                    System.out.println("Nhập lại:");
                    break;
            }

        }
    }
}
