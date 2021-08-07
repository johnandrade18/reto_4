package com.johnandrade.reto4.modelo.dao;

import com.johnandrade.reto4.modelo.vo.Requerimiento_3;
import com.johnandrade.reto4.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Requerimiento_3Dao {

  public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
    ArrayList<Requerimiento_3> registrosBS3 = new ArrayList<>();
    Requerimiento_3 registroBS3 = null;

    String sql ="SELECT DISTINCT P.ID_Proyecto,P.Ciudad,P.Clasificacion,SUM(C.Cantidad * MC.Precio_Unidad) AS 'Costo_Proyecto' FROM Proyecto AS P INNER JOIN MaterialConstruccion AS MC ON MC.ID_MaterialConstruccion = C.ID_MaterialConstruccion INNER JOIN Compra AS C ON C.ID_Proyecto = P.ID_Proyecto WHERE P.Ciudad IN ('Monteria','Santa Marta') GROUP BY P.ID_Proyecto HAVING SUM(C.Cantidad * MC.Precio_Unidad) > 70000 ORDER BY P.Ciudad ,P.Clasificacion,P.ID_Proyecto";

    try (
      Connection conn = JDBCUtilities.getConnection();
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
    ) {
      while (rs.next()) {
        registroBS3 = new Requerimiento_3();

        registroBS3.setIdProyecto(rs.getInt("ID_Proyecto"));
        registroBS3.setCiudad(rs.getString("Ciudad"));
        registroBS3.setClasificacion(rs.getString("Clasificacion"));
        registroBS3.setCostoProyecto(rs.getInt("Costo_Proyecto"));

        registrosBS3.add(registroBS3);
      }
    }

    return registrosBS3;
  }
}
