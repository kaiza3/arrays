import java.util.Arrays;

public class ej15 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = new int[num1.length];
        int j=0;

        for (int i = num1.length - 1; i >= 0; i--) {
            num2[j] = num1[i];
            j++;
        }
        System.out.println(Arrays.toString(num2));
    }
}
