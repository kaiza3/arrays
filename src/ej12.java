public class ej12 {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {1,6,7,8,3};

        for (int i =0; i < num1.length; i++){
            for(int j =0; j < num2.length; j++ ){
                if (num2[j] == num1[i]){
                    System.out.println(num1[i] + " se repite");
                }
            }
        }
    }
}
