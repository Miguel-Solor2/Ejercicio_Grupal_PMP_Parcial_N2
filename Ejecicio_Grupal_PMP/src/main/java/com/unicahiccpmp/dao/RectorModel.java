package com.unicahiccpmp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class RectorModel {
    
    public static void verificarTablaRectores() {
        try{
             Connection conn = Conn.obtenerConexion();
        
             String SQLCrearTabla = "CREATE TABLE IF NOT EXISTS rectores"
                        + " (ID INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,"
                        + " NOMBRES TEXT NOT NULL,"
                        + " APELLIDOS TEXT NOT NULL,"
                        + " IDENTIDAD TEXT NOT NULL,"
                        + " TELEFONO TEXT NOT NULL,"
                        + " CORREO TEXT NOT NULL,"
                        + " GENERO TEXT NOT NULL,"
                        + " FCHNAC TEXT NOT NULL,"
                        + " UNIVERSIDAD TEXT NOT NULL"
                        + ")";
                Statement comandoSql = conn.createStatement();
                comandoSql.executeUpdate(SQLCrearTabla);
                comandoSql.close();
        }catch(Exception ex){
            //
            System.err.println(ex.getMessage());
        }
    }
    //--------------------------------------------------------------------------
    
    public static ArrayList<Rector> getRectores(){
        ArrayList<Rector> rectores = new ArrayList<Rector>();

        try {
            Connection conn = Conn.obtenerConexion();

            String SQLGetRectores = "Select * FROM rectores;";
            Statement comandoSql = conn.createStatement();
            ResultSet cursorRectores = comandoSql.executeQuery(SQLGetRectores);
            while( cursorRectores.next() ){
                Rector _miRector = new Rector();
                _miRector.setID(cursorRectores.getInt("ID"));
                _miRector.setNOMBRES(cursorRectores.getString("NOMBRES"));
                _miRector.setAPELLIDOS(cursorRectores.getString("APELLIDOS"));
                _miRector.setUNIVERSIDAD(cursorRectores.getString("UNIVERSIDAD"));
               _miRector.setCORREO(cursorRectores.getString("CORREO"));
                rectores.add(_miRector);
            }
            comandoSql.close();

            return rectores;
        
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
            return rectores;
        }
    }
    //-------------------------------------------------------------------------
    
    public static Rector getRectoresByID(double Id){
        Rector _miRector = new Rector();
        try {
            Connection conn = Conn.obtenerConexion();

            String SQLGetRectores = String.format("Select * FROM rectores "
                    + "where ID=%s;", String.valueOf(Id));
            System.out.println(SQLGetRectores);
            Statement comandoSql = conn.createStatement();
            ResultSet cursorrectores = comandoSql.executeQuery(SQLGetRectores);
            while( cursorrectores.next() ){
                _miRector.setID(cursorrectores.getInt("ID"));
                _miRector.setNOMBRES(cursorrectores.getString("NOMBRES"));
                _miRector.setAPELLIDOS(cursorrectores.getString("APELLIDOS"));
                _miRector.setIDENTIDAD(cursorrectores.getString("IDENTIDAD"));
                _miRector.setUNIVERSIDAD(cursorrectores.getString("UNIVERSIDAD"));
                _miRector.setCORREO(cursorrectores.getString("CORREO"));
                _miRector.setGENERO(cursorrectores.getString("GENERO"));
                _miRector.setFCHNAC(cursorrectores.getString("FCHNAC"));
                _miRector.setTELEFONO(cursorrectores.getString("TELEFONO"));
                
            }
            comandoSql.close();

            return _miRector;
        
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
            return _miRector;
        }
    }
    //-------------------------------------------------------------------------
    
    public static boolean agregarrector(Rector RectorAgregar) {
        try{
            String sqlStr = "INSERT INTO rectores (NOMBRES, APELLIDOS,"
                    + " IDENTIDAD"
                    + ", TELEFONO, CORREO, GENERO, FCHNAC, UNIVERSIDAD)"
                    + " VALUES "
                    + "('%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')";
            
            Connection conn = Conn.obtenerConexion();
            Statement comandoSQL = conn.createStatement();
            int registroAfectados = comandoSQL.executeUpdate(
                    String.format(sqlStr,
                       RectorAgregar.getNOMBRES(), 
                       RectorAgregar.getAPELLIDOS(), 
                       RectorAgregar.getIDENTIDAD(), 
                       RectorAgregar.getTELEFONO(), 
                       RectorAgregar.getCORREO(), 
                       RectorAgregar.getGENERO(),
                       RectorAgregar.getFCHNAC(), 
                       RectorAgregar.getUNIVERSIDAD()
                    )
            );
            return registroAfectados > 0;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    //-------------------------------------------------------------------------

    public static boolean editarrector(Rector RectorEditar) {
        try{
            String sqlStr = "UPDATE  rectores set NOMBRES = '%s', "
                    + "APELLIDOS = '%s', IDENTIDAD = '%s', TELEFONO = '%s'"
                    + ", CORREO = '%s', GENERO = '%s', FCHNAC =  '%s',"
                    + " UNIVERSIDAD =  '%s' where ID=%f;";
            
            Connection conn = Conn.obtenerConexion();
            Statement comandoSQL = conn.createStatement();
            int registroAfectados = comandoSQL.executeUpdate(
                    String.format(sqlStr,
                       RectorEditar.getNOMBRES(), 
                       RectorEditar.getAPELLIDOS(), 
                       RectorEditar.getIDENTIDAD(), 
                       RectorEditar.getTELEFONO(), 
                       RectorEditar.getCORREO(), 
                       RectorEditar.getGENERO(), 
                       RectorEditar.getFCHNAC(), 
                       RectorEditar.getUNIVERSIDAD(),
                       RectorEditar.getID()
                    )
            );
            return registroAfectados > 0;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    //-------------------------------------------------------------------------

    public static boolean eliminarrector(Rector RectorEliminar) {
        try{
            String sqlStr = "DELETE FROM  rectores where ID=%f;";
            
            Connection conn = Conn.obtenerConexion();
            Statement comandoSQL = conn.createStatement();
            int registroAfectados = comandoSQL.executeUpdate(
                    String.format(sqlStr,
                       RectorEliminar.getID()
                    )
            );
            return registroAfectados > 0;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
            return false;
        }
    }
    //-------------------------------------------------------------------------

    public static Rector getRectoresById(double Id) {
        
       Rector _miRector = new Rector();
        try {
            Connection conn = Conn.obtenerConexion();

            String SQLGetRectores = String.format("Select * FROM rectores "
                    + "where ID=%s;", String.valueOf(Id));
            System.out.println(SQLGetRectores);
            Statement comandoSql = conn.createStatement();
            ResultSet cursorrectores = comandoSql.executeQuery(SQLGetRectores);
            while( cursorrectores.next() ){
                _miRector.setID(cursorrectores.getInt("ID"));
                _miRector.setNOMBRES(cursorrectores.getString("NOMBRES"));
                _miRector.setAPELLIDOS(cursorrectores.getString("APELLIDOS"));
                _miRector.setIDENTIDAD(cursorrectores.getString("IDENTIDAD"));
                _miRector.setUNIVERSIDAD(cursorrectores.getString("UNIVERSIDAD"));
                _miRector.setCORREO(cursorrectores.getString("CORREO"));
                _miRector.setGENERO(cursorrectores.getString("GENERO"));
                _miRector.setFCHNAC(cursorrectores.getString("FCHNAC"));
                _miRector.setTELEFONO(cursorrectores.getString("TELEFONO"));
                
            }
            comandoSql.close();

            return _miRector;
        
        } catch (Exception ex) {
            System.err.print(ex.getMessage());
            return _miRector;
        }
    }
}
