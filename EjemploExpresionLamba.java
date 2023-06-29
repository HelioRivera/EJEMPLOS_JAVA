

// Interfaz funcional con un único método "calcular"
@FunctionalInterface
interface Operacion {
  int calcular(int a, int b);
}

public class EjemploExpresionLamba {
    public static void main(String[] args){
        int suma = operar(5, 5, (a, b) -> a + b);
        System.out.println("El resultado de la suma es: "+ suma); // Imprime 10
        int multiplicacion = operar(5, 5, (a, b) -> a * b);
        System.out.println("El resultado de la multiplicación es: "+ multiplicacion); // Imprime 25
        int resta = operar(5, 5, (a, b) -> a - b);
        System.out.println("El resultado de la resta es: "+ resta); // Imprime 0
        int division = operar(5, 5, (a, b) -> a / b);
        System.out.println("El resultado de la división es: "+ division); // Imprime 1
    }

    // Definición del método "operar"
    public static int operar(int num1, int num2, Operacion operacion) {
        return operacion.calcular(num1, num2);
    }

}
