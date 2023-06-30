package edu.mariasoftware.ejemploscodigojava;

/**
 * Hace una demostracion del uso de expresiones lambda.
 */
public class EjemploExpresionLamda {
    public static void main(String[] args){
        int suma = operar(5, 5, (a, b) -> a + b);
        System.out.println("El resultado de la suma es: "+ suma);
        int multiplicacion = operar(5, 5, (a, b) -> a * b);
        System.out.println("El resultado de la multiplicación es: "+ multiplicacion);
        int resta = operar(5, 5, (a, b) -> a - b);
        System.out.println("El resultado de la resta es: "+ resta);
        int division = operar(5, 5, (a, b) -> a / b);
        System.out.println("El resultado de la división es: "+ division);
    }

    /**
     * Realiza una operacion aritmetica determinada
     * por el parametro "operacion".
     * @param num1 Primer parametro numerico de la operacion.
     * @param num2 Segundo parametro numerico de la operación.
     * @param operacion Interfaz funcional que contiene el metodo "calcular" implementado
     * como una expresion lambda que realiza la operacion aritmetica.
     * @return int El resultado de la operacion.
     */
    public static int operar(int num1, int num2, IOperacion operacion) {
        return operacion.calcular(num1, num2);
    }

}
