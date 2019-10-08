/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ggomes
 */
public class ConnectionFactory {
       public static Connection getConnection(String nome) throws SQLException, ClassNotFoundException {
        Connection a=null;
        if(nome == "oracle" ){
        
            Class.forName("oracle.jdbc.driver.OracleDriver");
            a= DriverManager.getConnection("jdbc:oracle:thin:@192.168.168.200:1521:ORCL", "implantacao", "c5_3222");
           
        } else {
            a = null;
        }     return a;
       
 } 
}
