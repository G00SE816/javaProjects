

package javaapp_crud.RegistroDAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import org.sqlite.core.CoreResultSet;


public class conexionDB {
    
    String strConnectionDB = "jdbc:sqlite:C:/Users/gaort/OneDrive/Escritorio/progra2/db/registro.s3db";
    Connection conn = null;
    
    public conexionDB (){
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(strConnectionDB);
            
            System.out.println("Conexión Establecida");
        } catch (Exception e) {
            
            System.out.println("Error de Conexion" + e);
        }
        
    }
    
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
            
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
        
    }
    
     public CoreResultSet consultarRegistros (String strSentenciaSQL){
         try {
             PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
             CoreResultSet respuesta = (CoreResultSet) pstm.executeQuery();
             return respuesta;
             
             
         } catch (Exception e) {
             System.out.println(e);
             return null;
         }
        
         
         
     }       
    
    
    
}
