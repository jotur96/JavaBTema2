import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto del articulo: ");
        float monto = scanner.nextFloat();

        System.out.print("Ingrese el iva(En porcentaje) a agregar: ");
        float iva = scanner.nextFloat();

        
        float montoIva = addIva(monto, iva);
        System.out.println("El monto con iva es: "+montoIva);
        
    }


    public static float addIva(Float monto, float iva){
        
        float addIva = monto*(iva/100);

        return monto+addIva;
    }
}
