import java.sql.*;

public class MySQLTest {

    public static void main(String[] args) {
//Make a connection
        String databaseURL = "jdbc:mysql://localhost:3306/sampledb";
        String userName = "root";
        String password = "password";

        try {
            Connection conn = DriverManager.getConnection(databaseURL, userName,password);
            //SQL Queries
            //CREATE
//            String sql = "INSERT INTO users (user_id,username, password, fullname, email) VALUES (?,?, ?, ?, ?)";
//            PreparedStatement statement = conn.prepareStatement(sql);
//
//            statement.setInt(1, 3);
//            statement.setString(2, "Mina");
//            statement.setString(3, "ILoveDogs");
//            statement.setString(4, "Mina Lee");
//            statement.setString(5, "Mina@gmail.com");
//
//            int rowsInserted = statement.executeUpdate();
//
            //DELETE
//            String sql="DELETE "






        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}