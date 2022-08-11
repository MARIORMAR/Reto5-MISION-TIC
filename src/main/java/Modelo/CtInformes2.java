package Modelo;

import Clases.Informe2;
import util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;

public class CtInformes2 {
    public LinkedList<Informe2> listarInformes1() {
        LinkedList<Informe2> listaInforme1 = new LinkedList<>();
        try {
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = null;
            ResultSet rs = null;
            String csql = "SELECT Proyecto.ID_Proyecto,Proyecto.Constructora,Numero_Habitaciones,Ciudad  From Proyecto WHERE  Ciudad  LIKE 'Santa Marta' or  Ciudad  LIKE 'Cartagena'or Ciudad  LIKE 'Barranquilla' and Clasificacion LIKE 'Casa Campestre'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
            while (rs.next()) {
                int id = rs.getInt("ID_Proyecto");
                String constructora = rs.getString("Constructora");
                int habitaciones = rs.getInt("Numero_Habitaciones");
                String ciudad = rs.getString("Ciudad");
                Informe2 in1 = new Informe2(id, constructora,habitaciones, ciudad);
                listaInforme1.add(in1);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
        }
        return listaInforme1;
    }
    
    
    
    public String pasarListaaString2(LinkedList<Informe2> lista) {
        String s = "";
        Iterator<Informe2> itr = lista.iterator();
        while (itr.hasNext()) {
            s = s + itr.next() + "\n";
        }
        return s;
    }
}
