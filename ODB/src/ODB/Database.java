
package ODB;
import java.sql.Connection;
import java.sql.DriverManager;


public class Database {

    public static Connection myConnect(String database) {
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection Con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, "root", "");
        System.out.println("Connection Established");
        return Con;

    } catch (Exception e){
      System.out.println("Connection Failed");

      // throw new RuntimeException("Cannot connect to database", e);
      return null;
    }
    }
}
