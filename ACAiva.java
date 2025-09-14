package acaiva;

import java.util.Scanner; //llamo a Scanner para permitir entrada desde teclado
import java.text.DecimalFormat; //Presentaremos datos en decimal

public class ACAiva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Escanear entrada
        System.out.println("Ingrese precio del producto antes de IVA:");
           double precioInicial = sc.nextDouble(); //Leer valor ingresado
           DecimalFormat formato = new DecimalFormat("#.00"); //Formato 2 decimales
           double IVA = precioInicial * 0.19;
           System.out.println("El valor del IVA para este producto es: $ " + formato.format(IVA));//Indica IVA del producto
           double precioFinal = IVA + precioInicial;
           System.out.println("El precio del producto con IVA es: $ " + formato.format(precioFinal));
           
            sc.close(); // Cerrar el Scanner
    }
    
}
