public class ej8 {
    public static void main(String[] args) {
        int[] numeros = {1,2,-3,4,5,6,7,-8,9,10,};
        int positivos =0;
        int negativos =0;
        for (int i =0; i <numeros.length; i++){
            if (numeros[i] <0){
                negativos += numeros[i];

            }else{
                positivos += numeros[i];

            }

        }
        System.out.println("negativos: " + negativos);
        System.out.println("positivos: " + positivos);
    }
}
