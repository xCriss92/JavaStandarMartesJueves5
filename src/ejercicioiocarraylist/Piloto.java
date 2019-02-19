
package ejercicioiocarraylist;


public class Piloto implements Imprimible {
    private String Nombre;
    private String Apellido;
    private Boolean LesGustaVolar;
    private int CantidadDeChoques;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Boolean getLesGustaVolar() {
        return LesGustaVolar;
    }

    public void setLesGustaVolar(Boolean LesGustaVolar) {
        this.LesGustaVolar = LesGustaVolar;
    }

    public int getCantidadDeChoques() {
        return CantidadDeChoques;
    }

    public void setCantidadDeChoques(int CantidadDeChoques) {
        this.CantidadDeChoques = CantidadDeChoques;
    }

    public Piloto(String Nombre,String Apellido,boolean LesGustaVolar,int CantidadDeChoques) {
        this.Nombre = Nombre;
        this.Apellido=Apellido;
        this.LesGustaVolar=LesGustaVolar;
        this.CantidadDeChoques=CantidadDeChoques;
        
    };

    public void imprimir() {
        System.out.println (this.getNombre () + " " + this.getApellido()); 
    }
    
    
}
