package primerSemestre.logica;

import java.util.Scanner;

        public class arreglos {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int[] numeros = new int[5];


                for (int i = 0; i < 5; i++) {
                    System.out.print("Ingresa el número " + (i + 1) + ": ");
                    numeros[i] = scanner.nextInt();
                }


                System.out.print("Números al revés: ");
                for (int i = 4; i >= 0; i--) {
                    System.out.print(numeros[i] + " ");
                }
                System.out.println(); // Salto de línea

                
                int mayor = numeros[0];
                for (int i = 1; i < 5; i++) {
                    if (numeros[i] > mayor) {
                        mayor = numeros[i];
                    }
                }

                System.out.println("El número mayor es: " + mayor);

                scanner.close();
            }
        }




