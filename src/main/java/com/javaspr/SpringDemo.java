package com.javaspr;

import com.javaspr.dao.EmployeeDao;
import com.javaspr.dao.EmployeeDaoImpl;
import com.javaspr.model.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {

        public static void main(String a[]){

            String confFile = "applicationContext.xml";
            ConfigurableApplicationContext context =
                    new ClassPathXmlApplicationContext(confFile);
            EmployeeDao empDao = (EmployeeDao) context.getBean("employeeDAO");
            Employee emp = new Employee();
            emp.setName("Madhu");
            emp.setSalary(60000);
            emp.setDept("HR");
            empDao.insertEmployee(emp);
        }
}
