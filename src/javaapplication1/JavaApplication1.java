


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Prince Hossain
 */
public class JavaApplication1 {
  public static Statement stmt = null;
    public static Connection conn;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MyDBConnection mdbc=new MyDBConnection();
         mdbc.init();
        conn=mdbc.getMyConnection();
        
        mainPage m = new mainPage();
        m.setVisible(true);
    }
    
}
