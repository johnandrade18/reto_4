package com.johnandrade.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.johnandrade.reto4.modelo.vo.Requerimiento_1;
import com.johnandrade.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList<Requerimiento_1> registrosBS = new ArrayList<>();
        Requerimiento_1 registroBS = null;

        String sql = "SELECT DISTINCT L.Nombre || ' ' || L.Primer_Apellido AS 'Lider',L.Cargo,COUNT(P.ID_Proyecto) AS 'nProyectos'"
                    +"FROM Lider AS L"
                    +"INNER JOIN Proyecto AS P ON P.ID_Lider = L.ID_Lider"
                    +"WHERE P.Constructora = 'Arquitectura S.A.'"
                    +"GROUP BY L.ID_Lider"
                    +"ORDER BY Cargo,Lider;";


                    try (
                        Connection conn = JDBCUtilities.getConnection();
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);
                    ) {
                        while (rs.next()) {
                            registroBS = new Requerimiento_1();
            
                            registroBS.setLider(rs.getString("Lider"));
                            registroBS.setCargo(rs.getString("Cargo"));
                            registroBS.setProyectos(rs.getInt("nProyectos"));
            
                            registrosBS.add(registroBS);
                        }
                    } 
            
                    return registrosBS;
    }
}