public class ej9 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,};
        int pares = 0;
        int impares = 0;
        for (int i =0; i <numeros.length; i++){
            if (numeros[i] % 2 ==0 ){
                pares = pares +1;
            }else{
                impares = impares +1;
            }
        }
        System.out.println("pares: " + pares + "\n" + "impares: " + impares);
    }
}
