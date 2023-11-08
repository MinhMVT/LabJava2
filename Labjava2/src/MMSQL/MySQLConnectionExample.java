package MMSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionExample{
    public static Connection getMyConnection() throws SQLException{
        String mmdb = "localhost";//127.0.0.1
        String dbName = "test";
        String Name = "root";
        String pass = "";
        String connectionURL = "jdbc:mysql://"+mmdb+":3306/"+dbName;
        Connection connection=
                DriverManager.getConnection(connectionURL,Name,pass);
                return connection;
    }
    public static void main(String[]args) throws SQLException {
        getMyConnection();
        if (getMyConnection() == null) {
            System.out.println("Connect success");
        }else
            System.out.println("Fail!");

    }

}
