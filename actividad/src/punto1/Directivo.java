package punto1;
public class Directivo extends Empleado {

    public Directivo() {
    }
    
    public Directivo(String nombre) {
        super(nombre);
    }
    @Override
    public String toString(){
        return "Empleado "+this.getNombre()+" ->Directivo";
    }
}
