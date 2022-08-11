package Modelo;
import Clases.Informe3;
import util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
public class CtInformes3 {
    public LinkedList<Informe3> listarInformes3() {
        LinkedList<Informe3> listaInforme1 = new LinkedList<>();
        try {
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = null;
            ResultSet rs = null;
            String csql = "SELECT ID_Compra,Proyecto.Constructora, Proyecto.Banco_Vinculado FROM Proyecto inner join Compra  on Proyecto.ID_Proyecto=Compra.ID_Proyecto where Proveedor  LIKE 'Homecenter' and Proyecto.Ciudad LIKE 'Salento'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
            while (rs.next()) {
                int id = rs.getInt("ID_Compra");
                String constructora = rs.getString("Constructora");
                String banco = rs.getString("Banco_Vinculado");
                Informe3 in1 = new Informe3(id, constructora,banco);
                listaInforme1.add(in1);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
        }
        return listaInforme1;
    }
    
    
    
    public String pasarListaaString2(LinkedList<Informe3> lista) {
        String s = "";
        Iterator<Informe3> itr = lista.iterator();
        while (itr.hasNext()) {
            s = s + itr.next() + "\n";
        }
        return s;
    }
}
