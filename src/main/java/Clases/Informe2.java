package Clases;

public class Informe2 {
    private int id;
    private String constructora;
    private int habitaciones;
    private String ciudad;
    
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getConstructora() {
            return constructora;
        }
    
        public void setConstructora(String constructora) {
            this.constructora = constructora;
        }
    
        public int getHabitaciones() {
            return habitaciones;
        }
    
        public void setHabitaciones(int habitaciones) {
            this.habitaciones = habitaciones;
        }
    
        public String getCiudad() {
            return ciudad;
        }
    
        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }
    
        public Informe2(int id, String constructora, int habitaciones, String ciudad) {
            this.id = id;
            this.constructora = constructora;
            this.habitaciones = habitaciones;
            this.ciudad = ciudad;
        }
    
    }
    