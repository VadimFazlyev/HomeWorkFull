import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class HomeWork2 {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] number = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int maxNumber = number.length;
        for (int i = 0; i < maxNumber; i++) {
            if (number[i] == 1) {
                number[i] = 0;
            } else number[i] = 1;
        }
        for (int value : number) {
            System.out.println(value);
        }

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] number2 = new int[8];
        int k = 0;
        for (int i = 0; i < number2.length; i++, k += 3) {
            number2[i] = k;
            System.out.println(number2[i]);
        }

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        int[] number3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxNumber3 = number3.length;
        for (int i = 0; i < number3.length; i++) {
            if (number3[i] < 6) {
                number3[i] *= 2;
            }
            System.out.println(number3[i]);
        }

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] number4 = new int[5][5];
        for (int i = 0; i < number4.length; i++) {
            for (int j = 0, x = number4[i].length; j < number4[i].length;  j++, x--) {
                if (i == j || i == (x - 1)) number4[i][j] = 1;
                System.out.print(number4[i][j] + " ");
            }
            System.out.print("\r\n");
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] number5 = new int[15];
        for (int i = 0; i < number5.length; i++) {
            number5[i] = (int) (Math.random() * 100);
        }
            for (int element : number5) {
                System.out.print(element + " ");
            }
        System.out.println();
            int max = number5[0];
            for (int i : number5) {
                if (i > max) {
                    max = i;
                }
            }
        System.out.println(max);
        int min = number5[0];
            for (int i : number5) {
                if (i < min) {
                    min = i;
                }
            }
        System.out.println(min);

    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
    // граница показана символами ||, эти символы в массив не входят.
    private static boolean balanceCheck(int[] arrParam) {
        int leftSum, rightSum;
        for (int i = 0; i < arrParam.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arrParam[j];
            }
            for (int j = i; j < arrParam.length; j++) {
                rightSum += arrParam[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
}











//7. **** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами.






