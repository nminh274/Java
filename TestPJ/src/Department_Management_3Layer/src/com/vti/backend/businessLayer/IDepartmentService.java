package com.vti.backend.businessLayer;

import com.vti.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface IDepartmentService {
    List<Department> getAllDep() throws SQLException, ClassNotFoundException;
}
