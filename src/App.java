import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Coche coche = new Coche();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido");
        elegirMarca(coche, leer);
        elegirModelo(coche, leer);
        elegirPrecio(coche, leer);
        System.out.println("Usted eligio un "+ coche.marca.toUpperCase() + ". \n Modelo: " + coche.modelo);
        System.out.println("Valuado en " + coche.precio + " de dolares");
        leer.close();
    }
    public static void elegirMarca(Coche coche, Scanner leer){
        System.out.println("Ingrese la marca del vehiculo que busca");
        coche.marca = leer.next();
    }
    public static void elegirModelo(Coche coche, Scanner leer){
        System.out.println("Ingrese el modelo de la marca que busca");
        coche.modelo = leer.next();
    }
    
    public static void elegirPrecio(Coche coche, Scanner leer){
        System.out.println("Ingrese rango de precio");
        coche.precio = leer.nextInt();
    }
}