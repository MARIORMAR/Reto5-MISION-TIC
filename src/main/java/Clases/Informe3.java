package Clases;

public class Informe3 {
    private int id;
    private String constructora;
    private String banco;
    
        public Informe3(int id, String constructora, String banco) {
            this.id = id;
            this.constructora = constructora;
            this.banco = banco;
        }
    
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
    
        public String getBanco() {
            return banco;
        }
    
        public void setBanco(String banco) {
            this.banco = banco;
        }
    
    }
    