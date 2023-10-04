
package com.mycompany.numerosprimos;


public class NumerosPrimos {

    public static void main(String[] args) {
        String resultado = "";

        int contador = 0;
        int numero = 1;

        while (contador < 100) {
            if (esPrimo(numero)) {
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println("Los primero numeros primos son: " + resultado);
    }

    private static Boolean esPrimo(Integer numero) {
        Boolean esUnNumeroPrimo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esUnNumeroPrimo = false;
            }
        }
        return esUnNumeroPrimo;
    }
}
