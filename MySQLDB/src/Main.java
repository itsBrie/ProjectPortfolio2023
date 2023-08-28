import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/sampledb"; //database url
        String username = "root"; //server username
        String password = "dummyPass"; //server password

        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);
//SQL Queries goes here-------
//CREATE
            String sql = "INSERT INTO users (user_id,username, password, fullname, email) VALUES (?,?, ?, ?, ?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,1); //parameterIndex=?, x=data/values
            statement.setString(2, "bill");
            statement.setString(3, "secretpass");
            statement.setString(4, "Bill Gates");
            statement.setString(5, "bill.gates@microsoft.com");
////
//            statement.setInt(1,2);
//            statement.setString(2,"anna");
//            statement.setString(3,"hotdogs");
//            statement.setString(4,"Anna Lee");
//            statement.setString(5,"anna.lee@gmail.com");
//
//            if (rowsInserted > 0) {
//                System.out.println("A new user was inserted successfully!");

// DELETE
//            String sql = "DELETE FROM users WHERE user_id=?";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setInt(1, 1);
//
            int rowsInserted = statement.executeUpdate();
//            if (rowsInserted < 2) {
//                System.out.println("A user was successfully deleted");
////
//            }

// UPDATE
//            String sql = "UPDATE users SET password=?,fullname=?,email=? WHERE user_id=?";
//            PreparedStatement statement = conn.prepareStatement(sql);
//            statement.setString(1, "ketchup");
//            statement.setString(2, "Karlie Anderson");
//            statement.setString(3, "karlie@gmail.com");
//            statement.setInt(4, 2);
//
//            int rowsUpdated=statement.executeUpdate();
//            if (rowsUpdated>0){
//                System.out.println("Rows updated successfully");
//            }

//SELECT
//            String sql="SELECT * from users";
//            PreparedStatement statement=conn.prepareStatement(sql); //executes sql statement
//            ResultSet resultSet=statement.executeQuery(sql); //return value
//            int count=0;
//            while (resultSet.next()){
//                int user_id=resultSet.getInt(1);
//                String name=resultSet.getString(2);
//                String pass=resultSet.getString(3);
//                String fullName=resultSet.getString(4);
//                String email=resultSet.getString(5);
//                System.out.printf("UserId: %d" +
//                        "UserName:%s UserPassword:%s  UserFullName:%s UserEmail:%s",user_id,name,pass,fullName,email);
//            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }


    }
}