public class ej10 {
    public static void main(String[] args) {
        int[] numeros = {1,2,11,3,4,5,6,7,8,9,10,};
        int posi = 12;
        int num =0;
        for (int i =0; i <numeros.length; i++){
            if (numeros[i]==posi){
                num =i;
                break;

            }else{
                num = -1;

            }
        }
        System.out.println(num);

    }
}
