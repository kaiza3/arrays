public class ej11 {
    public static void main(String[] args) {
        int[] numeros= {1,4,5,3,4,1};
        for (int i =0; i < numeros.length; i++){
            for(int j =i+1; j < numeros.length; j++ ){
                if (numeros[j] == numeros[i]){
                    System.out.println(numeros[i] + " se repite");
                }
            }
        }
    }
}
