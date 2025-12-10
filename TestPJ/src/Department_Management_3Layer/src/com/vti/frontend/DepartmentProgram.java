package com.vti.frontend;
import com.vti.backend.presentationLayer.*;
import com.vti.entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public class DepartmentProgram{
    private DepartmentController depControll;
    public DepartmentProgram() throws SQLException, IOException, ClassNotFoundException {
        super();
        depControll = new DepartmentController();
    }
    public void getAllDep() throws SQLException, ClassNotFoundException {
        System.out.println("List departments: ");
        List<Department> ListDep = depControll.getAllDep();
        for(Department department : ListDep){
            System.out.println(department.getName());
        }
    }
}
