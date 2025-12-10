package com.vti.backend.businessLayer;

import com.vti.backend.dataLayer.DepartmentRepository;
import com.vti.backend.dataLayer.IDepartmentRepository;
import com.vti.entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DepartmentService implements IDepartmentService{

    private IDepartmentRepository departmentRepository;

    public DepartmentService() throws SQLException, IOException, ClassNotFoundException {
        super();
        departmentRepository = new DepartmentRepository();
    }

    @Override
    public List<Department> getAllDep() throws SQLException, ClassNotFoundException {
        return departmentRepository.getAllDep();
    }
}
