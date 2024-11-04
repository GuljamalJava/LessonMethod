import java.util.Arrays;
import java.util.Scanner;

public class work {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        int[] nums = new int[10];
//        for (int i = 0; i < 10; i++) {
//            System.out.print("write number :");
//            nums[i] = scanner.nextInt();
//        }
//        System.out.println(numbers(nums)*numbers(nums));
//    }
//    public static int numbers(int[] arrays) {
//        int min = arrays[0];
//        int res = 0;
//        for (int i = 0; i < arrays.length; i++) {
//            if (arrays[i] < min) {
//                res = arrays[i];
//            } else if (arrays[i] > min) {
//                res = min;
//            }
//
//        }
//        return res;
//
//    }
/*todo    Метод түзүнүз, параметрине массив бериңиз.
     Массивге маанини мейн методдон сканнер аркылуу бериниз.
     Массивдин размери 10 болсун.
     Метод берилген массивдин эң кичине элементин кайтарсын. Кайтарган маанинин квадратын табыныз.*/

    public static void main(String[] args) {
        int[] ar = {6, 8, 9,12, 4, 6};
        int[] summa = massiv(ar);
        System.out.println(Arrays.toString(summa));
    }

    public static int[] massiv (int[] arrays) {
        Arrays.sort(arrays);
        for (int i = 0; i < arrays.length / 2; i++) {
            int sum = arrays[i];
            arrays[i] = arrays[arrays.length - i - 1];
        }
        return arrays;
    }
}
