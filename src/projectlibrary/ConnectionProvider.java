
package projectlibrary;

import java.sql.*;


public class ConnectionProvider {
    public static Connection getCon(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
         return con;
     }   catch(Exception ex){
         System.out.println(ex);
         return null;
     }
    }
}
