interface Calculadora {
    int calcular(int a, int b);
}


public class EjemploFuncionAnonima {
    public static void main(String[] args) {
        Calculadora suma = new Calculadora() {
            // Esta es la funcion anonima
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        int resultado = suma.calcular(5, 3);
        System.out.println("El resultado de la suma es: "+ resultado);  // Imprime 8
    }
}