import java.util.Scanner;

public class ej16_est_meteorol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temp = {25, 31, 28, 32, 33, 29, 32};
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "sabado", "Domingo"};
        double suma = 0, media = 0;
        double posmax = temp[0];
        double posmin = temp[0];
        int dia_max = 0, dia_min = 0;
        String encima_med ="";


        //media
        for (int i = 0; i < dias.length; i++) {
            suma = suma + temp[i];
        }
        media = suma / temp.length;
        System.out.printf("La media semanal: %.2fºC%n", media);


        //temp max y min y su dia
        for (int i = 0; i < dias.length; i++) {
            if (i == 0) {
                posmax = temp[0];
                posmin = temp[0];
            } else {
                if (temp[i] < posmin) {
                    posmin = temp[i];
                    dia_max = i;
                }
                if (temp[i] > posmax) {
                    posmax = temp[i];
                    dia_min = i;
                }
            }
        }
        System.out.println("La temperatura max es: " + posmax + "ºC y el dia: " + dias[dia_max]);
        System.out.println("La temperatura min es: " + posmin + "ºC y el dia: " + dias[dia_min]);


        //dias por encima de la media
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > media) {
                encima_med += dias[i] + " ";
            }
        }
        System.out.println("dias encima de la media son : " + encima_med);

        //mayor subida
        double mayorsub = 0;
        double sub;
        int pos=0;
        for (int i = 0; i < temp.length -1; i++) {
            sub = temp[i] - temp[i + 1];
            if (sub < mayorsub) {
                mayorsub = sub;

            }
        }
        System.out.println("mayor subida: de " + dias[pos] + " a " + dias[pos + 1] + " (+" + Math.abs(mayorsub) + ")");


        //grafica
        System.out.println("\nGráfico de temperaturas:");

        // Códigos de color ANSI
        String RESET = "\u001B[0m";
        String AZUL = "\u001B[34m";    // bajo 0
        String CIAN = "\u001B[36m";    // 0-9
        String VERDE = "\u001B[32m";   // 10-19
        String AMARILLO = "\u001B[33m";// 20-29
        String ROJO = "\u001B[31m";    // 30 o más

        for (int i = 0; i < temp.length; i++) {
            // Seleccionar color según el rango de temperatura
            String colorBarra = "";
            if (temp[i] < 0) {
                colorBarra = AZUL;
            } else if (temp[i] <= 9) {
                colorBarra = CIAN;
            } else if (temp[i] <= 19) {
                colorBarra = VERDE;
            } else if (temp[i] <= 29) {
                colorBarra = AMARILLO;
            } else {
                colorBarra = ROJO;
            }

            // Alinear los nombres de los días en minúsculas (9 caracteres es el máximo por 'miércoles')
            System.out.printf("%-12s", dias[i].toLowerCase());

            // Imprimir la barra con el color seleccionado
            System.out.print(colorBarra);
            for (int j = 0; j < (int) temp[i]; j++) {
                System.out.print("█"); // Puedes cambiarlo por "|" si prefieres líneas finas
            }
            System.out.print(RESET);

            // Mostrar el valor de la temperatura formateado con coma
            System.out.printf(" %.1f%n", temp[i]);
        }

        // Imprimir la leyenda al final
        System.out.println();
        System.out.print("Leyenda: ");
        System.out.print(AZUL + "█" + RESET + " bajo 0   ");
        System.out.print(CIAN + "█" + RESET + " 0-9   ");
        System.out.print(VERDE + "█" + RESET + " 10-19   ");
        System.out.print(AMARILLO + "█" + RESET + " 20-29   ");
        System.out.println(ROJO + "█" + RESET + " 30 o más");

    }
}