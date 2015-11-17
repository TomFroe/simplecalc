package simplecalculator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Notice, do not import com.mysql.jdbc.*
// or you will have problems!

public class SQLConnection {
    private Connection connection;
    
    public SQLConnection() {
    
    try {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/calc";
        String user ="root";
        String password ="";
            
        connection = DriverManager.getConnection(url, user, password);
            
        System.out.println("Verbindung erfolgreich");
    }
    
    catch (ClassNotFoundException | SQLException e) {
        System.out.println(e);
    }
    
    
}
    public void insert(String c, double x, double y, double result){
        try{
            String query = "INSERT INTO rechner (operatorX, operatorY, ergebnis, rechensymbol)"
                          + " VALUES (?, ?, ?, ?) ";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setDouble(1,x);
            ps.setDouble(2,y);
            ps.setDouble(3,result);
            ps.setString(4,c);
            ps.execute();
        }catch(Exception e){
            
            System.out.println(e);
        }
    }
}