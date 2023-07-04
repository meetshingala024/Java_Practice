/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deleterecord;
import java.sql.*;
import java.util.*;
/**
 *
 * @author au
 */
public class Deleterecord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student";
            Connection con=DriverManager.getConnection(url,"root","");
            Statement st=con.createStatement();
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter id:");
            int id=sc.nextInt();
            st.execute("delete from info where id="+id+";");
        }
        catch(Exception e){
            
                System.out.println(e);
            }   
    }
    
}
