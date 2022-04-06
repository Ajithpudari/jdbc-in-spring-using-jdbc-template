package com.javaspr.dao;

import com.javaspr.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


public class EmployeeDaoImpl implements EmployeeDao{

        private DataSource dataSource;
        private JdbcTemplate jdbcTemplate;

        public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
        }

    @Override
    public void insertEmployee(EmployeeDaoImpl emp) {
        String query = "insert into employee (name,salary,dept) values (?,?,?)";
        jdbcTemplate = new JdbcTemplate(dataSource);
        Object[] inputs = new Object[] {emp.getName(), emp.getSalary(), emp.getDept()};
        jdbcTemplate.update(query, inputs);

    }
}
}
