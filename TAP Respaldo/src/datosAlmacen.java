
public class datosAlmacen {

    int pan = 0;
    int lechuga = 0;
    int tomate = 0;
    int queso = 0;
    int carne = 0;
    
    public datosAlmacen(){
        
    }
    
    public datosAlmacen(int pan, int lechuga, int tomate, int queso, int carne){
        this.carne = carne;
        this.queso = queso;
        this.pan = pan;
        this.lechuga = lechuga;
        this.tomate = tomate;
    }

    public int getPan() {
        return pan;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    public int getLechuga() {
        return lechuga;
    }

    public void setLechuga(int lechuga) {
        this.lechuga = lechuga;
    }

    public int getTomate() {
        return tomate;
    }

    public void setTomate(int tomate) {
        this.tomate = tomate;
    }

    public int getQueso() {
        return queso;
    }

    public void setQueso(int queso) {
        this.queso = queso;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }
    
}
