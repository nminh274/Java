package com.vti.backend.presentationLayer;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import com.vti.backend.businessLayer.DepartmentService;
import com.vti.backend.businessLayer.IDepartmentService;
import com.vti.entity.Department;

public class DepartmentController {

    private IDepartmentService depService;

    public DepartmentController() throws SQLException, IOException, ClassNotFoundException {
        super();
        depService = new DepartmentService();
    }
    public List<Department> getAllDep() throws SQLException, ClassNotFoundException {
        List<Department> listDep = depService.getAllDep();
        return depService.getAllDep();
    }
}
