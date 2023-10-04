package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mavenproject1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Escribe el primer numero:");
        Integer numero1 = cargarNumero();
        System.out.println("Escribe el segundo numero:");
        Integer numero2 = cargarNumero();
        System.out.println("Escribe el tercer numero:");
        Integer numero3 = cargarNumero();
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
        calcularPromedio(numero1, numero2, numero3);
        
        Double numParInpar = Double.valueOf(numero1);
        Boolean esPar = (numParInpar % 2) == 0;
        if (esPar) {
            System.out.println("'Es par");
        } else {
            System.out.println("'Es inpar");

        }
    }

    /**
     *
     * @return @throws IOException
     */
    private static Integer cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNum = buffer.readLine();
        Integer num1 = Integer.parseInt(strNum);
        return num1;
    }

    /**
     *
     * @param num1 ss
     * @param num2 sds
     * @param num3 sds
     */
    private static void calcularNumeroMayor(Integer num1, Integer num2, Integer num3) {
        Integer numeroMayor = num1;

        if (num2 > numeroMayor) {
            numeroMayor = num2;
        }
        if (num3 > numeroMayor) {
            numeroMayor = num3;
        }
        System.out.println("El numero mayor es: " + numeroMayor);

    }

    private static void calcularNumeroMenor(Integer num1, Integer num2, Integer num3) {
        Integer numeroMenor = num1;

        if (num2 < numeroMenor) {
            numeroMenor = num2;
        }
        if (num3 < numeroMenor) {
            numeroMenor = num3;
        }

        System.out.println("El numero menor es: " + numeroMenor);
    }

    /**
     *
     * @param numero1 recibe num 1
     * @param numero2 recibe num 2
     * @param numero3 recibe num 3
     */
    private static void calcularPromedio(Integer numero1, Integer numero2, Integer numero3) {
        Integer suma = numero1 + numero2 + numero3;
        Double sum = Double.valueOf(suma);
        double promedio = suma / 3;
        System.out.println("El promedio es: " + promedio);

    }
}
