package com.learning.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.learning.model.Contact;
import com.learning.model.Courses;

public class CoursesDao {
	
	public int coursesDetail(Courses courses) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO courses" +
            "  (c_id, c_name, c_desp, c_fees) VALUES " +
            " (?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/elearning?useSSL=false", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
        	int i=0;
        	 preparedStatement.setInt(1, i++);
        	preparedStatement.setString(2, courses.getC_name());  
            preparedStatement.setString(3, courses.getC_desp());
            preparedStatement.setString(4, courses.getC_fees());
                 
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }


}
