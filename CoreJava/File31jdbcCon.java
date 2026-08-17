/*

31. Basic JDBC Connection 
• Objective: Connect Java with a relational database. 
• Task: Connect to a local MySQL/SQLite database and retrieve data. 
• Instructions: 
o Set up a database with a students table. 
o Write code to load the JDBC driver, create a connection, execute a SELECT query, and 
print results.

*/

package CoreJava;

import java.sql.*;

public class File31jdbcCon {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "GhoshalG7$";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");

            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
