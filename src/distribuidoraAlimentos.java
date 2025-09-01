// Importa la clase Scanner desde el paquete java.util
// "import" = palabra reservada que permite usar librerías externas
// "java.util" = paquete de utilidades de Java
// "Scanner" = clase que permite leer datos desde el teclado (entrada estándar)
import java.util.Scanner;

// Define una clase pública llamada DistribuidoraAlimentos
// "public" = modificador de acceso, accesible desde cualquier parte
// "class" = palabra reservada para definir una clase
// "DistribuidoraAlimentos" = nombre de la clase
public class DistribuidoraAlimentos {

    // Método principal donde empieza la ejecución del programa
    // "public" = accesible desde cualquier lugar
    // "static" = se puede ejecutar sin crear un objeto de la clase
    // "void" = no devuelve ningún valor
    // "main" = nombre especial reconocido por la JVM como punto de entrada
    // "String[] args" = arreglo de cadenas para recibir parámetros desde la consola
    public static void main(String[] args) {
        
        // Mensajes iniciales de bienvenida, mostrados en consola
        // "System.out.println" = instrucción para imprimir en pantalla con salto de línea
        System.out.println("  BIENVENIDO A DISTRIBUIDORA AFC BROS.");
        System.out.println("======================================\n");
        
        System.out.println("Debe ingresar los siguientes datos : \n");
        System.out.println("------------------------------------------");
        
        // Crea un objeto Scanner llamado "teclado" asociado a la entrada estándar (System.in)
        // "new" = crea un nuevo objeto en memoria
        // "Scanner" = clase utilizada
        // "System.in" = flujo de entrada (teclado)
        Scanner teclado = new Scanner(System.in); 

        // Declaración de variables que almacenarán los datos ingresados
        // "double" = número decimal
        // "int" = número entero
        // "String" = cadena de texto
        double compra;          // monto de la compra
        int kilometros;         // distancia para el despacho
        double totalPagar;      // monto total final
        String marca;           // marca del vehículo
        String modelo;          // modelo del vehículo
        int cilindrada;         // cilindrada en cc
        String combustible;     // tipo de combustible
        int capacidad;          // capacidad en pasajeros
        int costoDespacho = 0;  // costo inicial del despacho, parte en 0
        

        // Solicita y lee el monto de la compra desde el teclado
        System.out.println("Ingrese el monto de la compra: ");
        compra = teclado.nextDouble(); // lee un número decimal ingresado

        // Solicita y lee los kilómetros del despacho
        System.out.println("Ingrese los kilometros para el despacho : ");
        kilometros = teclado.nextInt(); // lee un número entero

        // Limpia el buffer para poder leer cadenas después de leer números
        teclado.nextLine();

        // Solicita y lee la marca del vehículo
        System.out.print("Ingrese la marca: ");
        marca = teclado.nextLine();

        // Solicita y lee el modelo del vehículo
        System.out.print("Ingrese el modelo: ");
        modelo = teclado.nextLine();

        // Solicita y lee la cilindrada, convirtiendo la entrada a entero
        System.out.print("Ingrese la cilindrada (cc): ");
        cilindrada = Integer.parseInt(teclado.nextLine());

        // Solicita y lee el tipo de combustible
        System.out.print("Ingrese el tipo de combustible: ");
        combustible = teclado.nextLine();

        // Solicita y lee la capacidad en pasajeros, convirtiendo a entero
        System.out.print("Ingrese la capacidad en pasajeros: ");
        capacidad = Integer.parseInt(teclado.nextLine());

        // Cálculo del costo de despacho según reglas de negocio
        // Se usan estructuras condicionales "if", "else if" y "else"
        if (compra >= 50000 && kilometros <= 20){
            // Caso: compras iguales o mayores a $50.000 y hasta 20 km → despacho gratis
            System.out.println("Por su compra el despacho es GRATUITO!");
        } else if (compra >= 25000 && compra < 50000 && kilometros <=20) {
            // Caso: compras entre $25.000 y $49.999 con hasta 20 km → $150 por km
            costoDespacho = kilometros * 150;
            System.out.println("Por su compra de : $ " + compra + "  el despacho es de : $"+ costoDespacho);
        } else {
            // Caso general: resto de compras → $300 por km
            costoDespacho = kilometros * 300;
            System.out.println("Por su compra de : $ " + compra + " el despacho es de : $" + costoDespacho +"\n");
        }

        // Calcula el total a pagar sumando la compra y el despacho
        totalPagar = compra + costoDespacho;

        // Muestra en pantalla un resumen de la compra
        System.out.println("\nRESUMEN DE SU COMPRA");
        System.out.println("============================");
        System.out.println("El monto de su compra es : $" + compra);
        System.out.println("Los kilometros para el despacho son : " + kilometros + " km");
        System.out.println("El monto total de la compra con el despacho es : $ " + totalPagar);
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");
        System.out.println("GRACIAS por su compra!");

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
