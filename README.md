# jdbc-in-spring-using-jdbc-template

Spring JdbcTemplate is a powerful mechanism to connect to the database and execute SQL queries. It internally uses JDBC api, but eliminates a lot of problems of JDBC API.

Here we import JDBC package to work with JDBC Template.

```
import org.springframework.jdbc.core.JdbcTemplate;
public class EmployeeDaoImpl implements EmployeeDao{

        private DataSource dataSource;
        private JdbcTemplate jdbcTemplate;

        public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
        }
```

        And in DaoImplimentaion class we implimented the EmployeeDao.
        And in ApplicationContext.xml file we define our DB credentiols and URL's:


```
<bean id="dataSource"
          class="org.springframework.jdbc.datasource.DriverManagerDataSource"/>

        <property name="driverClassName" value="com.mysql.jdbc.Driver" />
        <property name="url" value="jdbc:mysql://localhost:3306/ajith" />
        <property name="username" value="root" />
        <property name="password" value="root" />
    </bean>
 ```
  
    
