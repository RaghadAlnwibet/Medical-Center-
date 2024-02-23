
package hospitalproject;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseConnection {
    private final String URL = "jdbc:mysql://localhost/hospital";
    private final String userName = "root";
    private final String password = "";
    
    public Connection connect() throws SQLException{
        return DriverManager.getConnection(URL, userName, password);
    }     
}
