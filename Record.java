package record;

import java.sql.*;

/**
 *
 * @author au
 */
public class Record {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql:///stud","root","");
           Statement st=con.createStatement();
           ResultSet rs=st.executeQuery("select * from info");
           ResultSetMetaData rsmd=rs.getMetaData();
            for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rsmd.getColumnName(i)+" ");
            }
            System.out.println("");
            while (rs.next()) {
               for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                System.out.print(rs.getString(i)+" ");
            }  
                System.out.println("");
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
