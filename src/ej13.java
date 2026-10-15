public class ej13 {
    public static void main(String[] args) {
        int[] numeros= {1,4,3,7,2};
        int sumanum =5;
        int sumar=0;
        for (int i =0; i < numeros.length; i++){
            for(int j = i+1; j < numeros.length; j++ ){

                if (numeros[i] + numeros [j] == sumanum){
                    System.out.println(numeros[i] +"+"+ numeros [j] +"=" +sumanum);
                }
            }
        }

    }
}
