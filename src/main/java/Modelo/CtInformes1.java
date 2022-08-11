package Modelo;

import Clases.Informe1;
import util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;

public class CtInformes1 {

    public LinkedList<Informe1> listarInforme1() {
        LinkedList<Informe1> listaInforme1 = new LinkedList<>();
        try {
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = null;
            ResultSet rs = null;
            String csql = "select ID_Lider,(SELECT Nombre ||\" \" || Primer_Apellido ||\" \"|| Segundo_Apellido) AS NOMBRE, Ciudad_Residencia from Lider; ";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
            while (rs.next()) {
                int id = rs.getInt("ID_Lider");
                String nombre = rs.getString("NOMBRE");
                String ciudad = rs.getString("Ciudad_Residencia");

                Informe1 in1 = new Informe1(id, nombre, ciudad);
                listaInforme1.add(in1);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
        }
        return listaInforme1;
    }
    
    public String pasarListaaString(LinkedList<Informe1> lista) {
        String s = "";
        Iterator<Informe1> itr = lista.iterator();
        while (itr.hasNext()) {
            s = s + itr.next() + "\n";
        }
        return s;
    }
    
    
}



