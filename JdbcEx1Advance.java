
package projtopic.jdbc;
import java.sql.*;

public class JdbcEx1Advance {
    public static void main(String[] args) {
        Connection conn=null;
        try{
             conn=DriverManager.getConnection("jdbc:oracle:thin:@//Mishal:1521/xe","system", "asdfg");
            System.out.println("Connected successfully to the DB");
            Statement st=conn.createStatement();
            int ans=st.executeUpdate("insert into books values(5 ,'HTML by Tim',150) ");
            System.out.println("Row updated:"+ans);

        }catch(SQLException ex){
            System.out.println("DB error:"+ex.getMessage());
        }
        finally {
            try{
                if(conn!=null){
                    conn.close();
                    System.out.println("Disconnected with the DB");
                }
            }catch(SQLException ex){
                System.out.println("Error in Discnecting with DB"+ex.getMessage());
            }
        }

    }
}
