package org.example;

/* TO DO LIST
NOK - SINCRONIZAR PROJECTO INTELLIJ A GITHUB
OK - DEVOLVER STATUS EN STRING
OK - SEGUN EL NUMERO QUE SEPA CLASIFICAR ENTRE FIZZ, BUZZ, FIZZBUZZ, NUMERO
OK - ALMACENAR EN FIZZBUZZ STATUS
OK - PODER PREGUNTAR AL OBJETO SI ES DE UN ESTADO CONCRETO
OK - CONSTRUCTOR PARA CADA UNA DE LAS COMBINACIONES DE PARAMETROS - SOBRECARGA

SINCRONIZAR PROJECTO INTELLIJ A GITHUB
DONE - Añadir al print la hora/tiempo en milisegundos
DONE - FIZZBUZZER tenga tres modos:
     1- DONE Ya hecho;
     2- DONE Te devuelve Fizz si 3 está en el numero, Buzz si esta 5 y FizzBUZZ si esta el 3 y el 5
     3- DONE Fizz =<10; Buzz *7 & >10; Fizzbuzz si es primo (prioridad)
DONE - Configuración al principio del codigo, especificar modo de fizzbuzzer y opción de imprimir el tiempo o no
NOK Elegir por configuración el idioma del FizzBuzzer (Pin/Pan/PinPan - Tris/Tras/Flur - fizz/buzz/fizzbuzz)
*/


public class Main {
    // INITIALIZATION
    public static final int PRIMEROS_NUMEROS = 15;

    public static void main(String[] args) {
        System.out.println("--------INIT SOFTWARE---------");

        for (int number=1; number <= PRIMEROS_NUMEROS; number++) {
            FizzBuzzer modelFizzBuzz = new FizzBuzzer(number,2); // error al quitar el mode
            modelFizzBuzz.printInformation(true);
        }
        System.out.println("--------END SOFTWARE---------");
    }
}
