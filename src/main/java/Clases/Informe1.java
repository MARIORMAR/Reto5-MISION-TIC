package Clases;

public class Informe1 {
    private int id;
    private String nombre;
    private String ciudad;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

       public String getCiudad() {
        return ciudad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Informe1(int id, String nombre,  String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
    
}
