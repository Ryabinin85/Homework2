import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        task2();
        task3();
        task4();

    }
    public static void task1 (){
        /*Объявите три массива:
        1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания
        массива: с помощью ключевого слова или сразу заполненный элементами.
        - **Критерии оценки**
            - Целочисленный массив создан с помощью ключевого слова new
            - Массив с дробными числами создан и сразу заполнен значениями
            - Создан любой произвольный массив одним из двух способов, рассмотренных в уроке*/
        int[] array1 = new int[]{1,2,3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[2];
        array3[0] = 1;
        array3[1] = 2;
    }

    public static void task2 (){
        /*Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и
        первым элементом следующего не нужна.
        - **Критерии оценки**
            - В консоль выведены все элементы первого массива в верном порядке через запятую
            - В консоль выведены все элементы второго массива в верном порядке через запятую
            - В консоль выведены все элементы третьего массива в верном порядке через запятую
            - На одной строчке расположены элементы только одного массива*/
        int[] array1 = new int[]{1,2,3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[2];
        array3[0] = 1;
        array3[1] = 2;
        System.out.println(array1[0] + ", " + array1[1] + ", " + array1[2]);
        System.out.println(array2[0] + ", " + array2[1] + ", " + array2[2]);
        System.out.println(array3[0] + ", " + array3[1]);

    }

    public static void task3 (){
        /*Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого
        элемента массива, а с последнего.
        Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке,
        а элементы другого массива – на другой.
        Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        Если во втором задании в консоль у вас вывелся результат
        1, 2, 3
        1.57, 7.654, 9.986
        *произвольные элементы третьего массива*
        То в третьем задании результат должен быть
        3, 2, 1
        9.986, 7.654, 1.57
        *произвольные элементы третьего массива в обратном порядке*
        - Критерии оценки
            - В консоль выведены все элементы первого массива в обратном порядке через запятую
            - В консоль выведены все элементы второго массива в обратном порядке через запятую
            - В консоль выведены все элементы третьего массива в обратном порядке через запятую
            - На одной строчке расположены элементы только одного массива*/
        int[] array1 = new int[]{1,2,3};
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = new int[2];
        array3[0] = 1;
        array3[1] = 2;
        System.out.println(array1[2] + ", " + array1[1] + ", " + array1[0]);
        System.out.println(array2[2] + ", " + array2[1] + ", " + array2[0]);
        System.out.println(array3[1] + ", " + array3[0]);

    }

    public static void task4 (){
        /*Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        Распечатайте результат преобразования в консоль.
        - Критерии оценки
            - Все нечетные числа в целочисленном массиве четные с помоущью прибавления 1
            - В консоли распечатан только целочисленный массив*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину массива!");
        int index = scanner.nextInt();
        int [] array = new int[index];
        System.out.println("Исходный массив:");
        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Массив с четными значениями:");
        for (int i = 0; i<array.length; i++) {
            if (array[i] % 2 != 0 && array[i] > 0) {
                array[i] = array[i] + 1;
            }
            System.out.print(array[i] + " ");
        }
    }
}