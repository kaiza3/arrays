import java.util.Scanner;

public class ej16_est_meteorol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temp = new double[7];
        String[] dias = {"Lunes", "Martes","Miercoles","Jueves","Viernes","sabado","Domingo"};
        double suma =0, media=0;
        double posmax= temp[0];
        double posmin=temp[0];
        int dia_max=0, dia_min=0;
        int encima_med=0;
        for(int i =0; i < dias.length; i++) {
            do {
                System.out.println("dime la temperatura del dia " + dias[i] + ": ");
                temp[i] = sc.nextDouble();
                if (temp[i] < -30 || temp[i] > 50) {
                    System.out.println("No valido, tiene que estar entre -30 y 50");
                }
            }while(temp[i] < -30 || temp[i] > 50);
            suma= suma +temp[i];
            if(i ==0){
                posmax= temp[0];
                posmin= temp[0];
            }else{
                if(temp[i]<posmin){
                    posmin = temp[i];
                    dia_max= i;
                }
                if(temp[i]>posmax) {
                    posmax = temp[i];
                    dia_min = i;
                }
            }
        }

        media = suma/temp.length;
        System.out.printf("La media semanal: %.2fºC%n", media );
        System.out.println("La temperatura max es: " + posmax + "ºC y el dia: " + dias[dia_max]);
        System.out.println("La temperatura min es: " + posmin +  "ºC y el dia: " + dias[dia_min]);
        System.out.println("dias encima de la media son : " + encima_med + ", ");

    }
}
