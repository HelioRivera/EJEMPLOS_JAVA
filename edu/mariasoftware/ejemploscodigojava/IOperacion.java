package edu.mariasoftware.ejemploscodigojava;

/**
 * Interfaz funcional con un unico metodo "calcular"
 */
@FunctionalInterface
public interface IOperacion {
  int calcular(int a, int b);
}

