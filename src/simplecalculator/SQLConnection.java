package simplecalculator;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
    
    public String ausgabe()
    {
            Statement statement = null;
            double x, y, ergebnis;
            x = y = ergebnis = 0;
            String c;
            try
            {
                statement = connection.createStatement();
                ResultSet result = null;
                try
                {
                    String sql = "SELECT * FROM calc.rechner ORDER BY idrechner DESC LIMIT 10";
            
                    result = statement.executeQuery(sql);
                    while(result.next())
                    {
                        x += result.getDouble("operatorX");
                        y += result.getDouble("operatorY");
                        ergebnis += result.getDouble("ergebnis");
                        String symbol = result.getString("rechensymbol");
                    }
                }
                finally 
                {
                    if (result != null) result.close();
                }               
            } 
            catch(Exception e)
            {
               System.out.println(e);
            }
        finally
        {
          try
          {
              if(statement != null) 
              {
                statement.close();
              }
              
          }
          catch(SQLException e)
          {
              System.out.println(e);
          }
          }
          return "Der Durchschnitt der letzten 10 Einträge: \nDurchschnitt-X: " + x/10 + " Durchschnitt-Y: " + y/10 + " Durchschnitt-Ergebnis: " + y/10;
    }  
    
    public String ausgabeOperationen()
    {
            Statement statement = null;
            ResultSet result = null;
            int i = 0;
            try
            {
                statement = connection.createStatement();
                try
                {
                    String sql = "SELECT * FROM calc.rechner";
            
                    result = statement.executeQuery(sql);
                    while(result.next())
                    {
                        i++;
                    }
                }
                finally 
                {
                    if (result != null) result.close();
                }   
                
            } 
            catch(Exception e)
            {
               System.out.println(e);
            }
        finally
        {
          try
          {
              if(statement != null) 
              {
                statement.close();
              }
              
          }
          catch(SQLException e)
          {
              System.out.println(e);
          }
        }
            return "Die Anzahl der durchgeführten Operationen: " + i; 
    }   
     
}
    