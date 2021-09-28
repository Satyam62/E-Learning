package com.learning.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.learning.model.User;

public class UserDao extends BaseDao{
	
	public int registerEmployee(User user) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO user1" +
            "  (user_id, name, phone_no, email, address, password, role) VALUES " +
            " (?, ?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/elearning?useSSL=false", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
        	int i=0;
            preparedStatement.setInt(1, i++);
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getPhone_no());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getAddress());
            preparedStatement.setString(6, user.getPassword());
            preparedStatement.setString(7, user.getRole());

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
    
    
    public static User getLogin(String email, String password) {
    	
    	Connection con =null;
    	User user = null;
    	
    	try {
    		
    		con = getCon();
    		String sql = "select * from user1 where email=? and password=?";
    		PreparedStatement st = con.prepareStatement(sql);
    		st.setString(1, email);
    		st.setString(2, password);
    		
    		ResultSet rs = st.executeQuery();
    		while(rs.next()) {
    			user = new User();
    			user.setUser_id(rs.getString("user_id"));
    			user.setName(rs.getString("name"));
    			user.setPhone_no(rs.getString("phone_no"));
    			user.setEmail(rs.getString("email"));
    			user.setAddress(rs.getString("address"));
    			user.setPassword(rs.getString("password"));
    			
    			user.setRole(rs.getString("role"));
    		}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return user;
    	
    }

}
