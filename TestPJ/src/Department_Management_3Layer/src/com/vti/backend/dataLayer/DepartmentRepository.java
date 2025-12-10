package com.vti.backend.dataLayer;

import com.vti.entity.Department;
import com.vti.utils.JDBCTest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository implements IDepartmentRepository {
    private JDBCTest jdbcTest;
    public DepartmentRepository() throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {
        super();
        jdbcTest = new JDBCTest();
    }
    @Override
    public List<Department> getAllDep() throws ClassNotFoundException, SQLException{
        String sql = "select * from department order by Department_ID";
        ResultSet rs = jdbcTest.executeQuery(sql);
        List<Department> departmentList = new ArrayList<>();
        while(rs.next()){
            Department departmentlist = new Department(rs.getInt("Department_ID"),rs.getString("Department_Name"));
            departmentList.add(departmentlist);
        }
        jdbcTest.disconnect();
        return departmentList;
    }
}
