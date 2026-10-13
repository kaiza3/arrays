public class ej5 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,};
        int mayor = numeros[0];
        for (int i =0; i <numeros.length; i++){
           if (numeros[i] > mayor){
               mayor=numeros[i];
           }
        }
        System.out.println(mayor);
    }
}
