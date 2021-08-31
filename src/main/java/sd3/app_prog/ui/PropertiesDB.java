/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd3.app_prog.ui;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;



public class PropertiesDB {
    
    
    
    static Connection connection;
    static QueryRunner runner;
    
     public static void doConnection() {
        try {
            //connect to DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/moylishproperty", "testuser", "pass");
            //create runner
            runner = new QueryRunner();

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//end doConnection
    
    ///////////////////////////////////////////////////////////////////////////////////
    public static void closeConnection() {
        try {
            DbUtils.close(connection);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//end closeConnection
    
    
      public static List<Console> printPrice() throws SQLException {
        
        ResultSetHandler<List<Console>> handler = new BeanListHandler(Console.class);
        List<Console> list = runner.query(connection, "SELECT * FROM properties WHERE price BETWEEN 150000 AND 250000 ORDER BY price ASC", handler);
        
        return list;
        
    }
    
    
          public static int executeSQLStmt(String sql) throws SQLException {
        return runner.execute(connection, sql);
    }
    
       static int[] batchAnCustomerInsert(Object [][] params) throws SQLException {
            return runner.batch(connection, "INSERT INTO properties (street, city,bedrooms,bathrooms,squarefeet,description,price) VALUES (?,?,?,?,?,?,?)", params);
    }

}
