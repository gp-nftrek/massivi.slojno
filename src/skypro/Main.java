package skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//       задача 5
        System.out.println();
        System.out.println("zadacha 5");
        System.out.println();
        int a = 1;
        int[][] matrix = {{a, 0, a}, {0, a, 0}, {a, 0, a}};
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

//       задача 6
        System.out.println();
        System.out.println("zadacha 6");
        System.out.println();

        int arr[] = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int newArr[] = new int[5];
        newArr[0] = arr[4];
        newArr[1] = arr[3];
        newArr[2] = arr[2];
        newArr[3] = arr[1];
        newArr[4] = arr[0];
        System.out.println(Arrays.toString(newArr));

        //       задача 7

        System.out.println();
        System.out.println("zadacha 7");
        System.out.println();

        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println();
//помогите, не знаю как через метод arrays.toString напечатать массив перевернутый. при попытке, он просто 5 раз печатает тот же [5, 4, 3, 2, 1]

//       задача 8
        System.out.println("zadacha 8");
        System.out.println();
        int[] zada4a8 = new int[10];
        zada4a8[0] = -6;
        zada4a8[1] = 2;
        zada4a8[2] = 5;
        zada4a8[3] = -8;
        zada4a8[4] = 8;
        zada4a8[5] = 10;
        zada4a8[6] = 4;
        zada4a8[7] = -7;
        zada4a8[8] = 12;
        zada4a8[9] = 1;

        Arrays.sort(zada4a8);

        int left = 0;
        int right = zada4a8.length - 1;

        while (left < right) {
            int leftVal = zada4a8[left];
            int rightVal = zada4a8[right];
            int sum = leftVal + rightVal;

            if (sum == -2) {
                System.out.println(zada4a8[left] + "," + zada4a8[right]);
                right--;
                left++;
            }
            if (sum > -2) {
                right--;
            }
            if (sum < -2) {
                left++;
            }
        }


    }
}
