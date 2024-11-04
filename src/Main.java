import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

            int[] ar = {6, 8, 9, 12, 4, 6};
            int[] summa = massiv(ar);
            System.out.println(Arrays.toString(summa));
        }

        public static int[] massiv ( int[] arrays){
            Arrays.sort(arrays);
            for (int i = 0; i < arrays.length / 2; i++) {
                int sum = arrays[i];
                arrays[i] = arrays[arrays.length - i - 1];
            }
            return arrays;
        }
    }
