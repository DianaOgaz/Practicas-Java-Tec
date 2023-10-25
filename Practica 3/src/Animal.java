
public class Animal {
   private String tipo;
   private String color;
   private int patas;
   private String tipoPelaje;
   private boolean pelaje;
    
    public Animal(){ //Método constructor, es el que se llama al momento de crear
       this.tipo = "viviparo";
       this.color = "verde";
       this.patas = 0;
       this.pelaje = false;
       this.tipoPelaje = "peludo";
       
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }
    
}
