package com.vti.backend.dataLayer;
import com.vti.entity.Department;

import java.sql.SQLException;
import java.util.List;
public interface IDepartmentRepository {
    public List<Department> getAllDep() throws SQLException, ClassNotFoundException;
}
