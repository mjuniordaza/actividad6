
package Test;
import punto1.*;
public class Test {
    public static void main(String args[]){
        Empleado E1=new Empleado("marcos");
        Operario op1=new Operario("juan");
        Directivo d1=new Directivo("andres");
        Oficial of1=new Oficial("pepe");
        Tecnico t1=new Tecnico("camilo");
        
        System.out.println(E1);
        System.out.println(d1);
        System.out.println(op1);
        System.out.println(of1);
        System.out.println(t1);
        System.out.println("");
    }
}
