import java.util.Date;
import java.text.*;
import java.util.Scanner;

public class HW5 {
    /**
     *  5. Циклы. Часть 1
     */
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();
    }

    public static void task1() {
        /*Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
        Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
        Не забудьте выполнить переход на новую строку между двумя циклами.
        В результате программы вывод должен получиться следующий:
        1 2 3 4 5 6 7 8 9 10
        10 9 8 7 6 5 4 3 2 1
        - Критерии оценки
            – Результат программы выведен согласно условию задачи;
            – Выведены все числа согласно задаче;
            – Использованы оператор for и оператор while для решения задачи.*/
        int i=1;
        do {
            System.out.print(i + " ");
            i++;
        }
        while (i <= 10);
        System.out.println();
        for (int j = 10; j >=1; j--)
            System.out.print(j + " ");

        for (int j = 0; j < 18; j++)
            System.out.print(j+" ");
        System.out.println();
        for (int j = -10; j < 11; j++)
            System.out.print(j+ " ");
        System.out.println();
    }
    public static void task2() {
        /*В вашей компании пятница является днем отчетным.
        Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница,
        и выводит сообщение с напоминанием о том, что нужно подготовить еженедельный отчет.
        Условия задачи:
        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
        - Критерии оценки
            – Сообщение в консоль выведено корректно и учитывает все значения переменной;
            – Условия цикла записаны корректно;
            – Переменная инициализирована корректно;
            – Условие задачи соблюдены и выполнены.*/
        int firstFriday;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число от 1 до 7");
        for (firstFriday = scanner.nextInt(); firstFriday <= 31; firstFriday = firstFriday +7)
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", firstFriday);
        System.out.println();
    }

    public static void task3() {
        /*Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть.
        Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
        Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.
        Условия задачи:
        В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.
        Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего
        (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.
        В результате решения задачи в консоль должен вывестись следующий результат:
        1896
        1975
        2054
        - Критерии оценки
            – Соблюдены все условия задачи;
            – Операция цикла написана без ошибок;
            – Цикл выводит корректные значения;
            – Значения переменной присвоены корректно*/
        int cometCycle = 79;
        Date currentYear = new Date();
        SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");
        System.out.println("Текущий год " + formatYear.format(currentYear));
        int year = Integer.parseInt(formatYear.format(currentYear));
        for (int i = 0; i <= year+100; i=i+cometCycle){
            if (i > year - 200 && i < year + 100)
                System.out.println(i);
        }
    }

    public static void task4() {
        /*Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка,
        вывести ping, а если число делится на 5 без остатка, вывести pong.
        Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
        • Критерии оценки
        – В консоль выводится значение из условия задачи
        – Цикл проходит по значениям и выполняет условие задачи деления цифр на 3 и 5
        – Код написан корректно и без ошибок.
        */
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array [i] = i+1;
            if (array[i] % 3 == 0 && array[i] % 5 == 0) System.out.print(array[i] + ": ping pong\n");
            else if (array[i] % 3 == 0) System.out.print(array[i] + ": ping\n");
            else if (array[i] % 5 == 0) System.out.print(array[i] + ": pong\n");
            else System.out.print(array[i] +":\n");
        }
    }

    public static void task5() {
        /*Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
        – Каждое следующее число равняется сумме двух предыдущих.
        Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
        Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
        Должно получиться следующее:
        0 1 1 2 3 5 8 13 21 34
        • Справка
        Числа Фибоначчи – элементы числовой последовательности
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, … ,
        в которой первые два числа равны 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел.
        Названы в честь средневекового математика Леонардо Пизанского.
        • Критерии оценки
        – Код написан корректно и выполняет условия задачи при изменении значений переменной;
        – В коде не допущено ошибок или неверного использования конструкций; – Все условия задачи выполняются.*/
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (i>1) arr[i] = arr[i-1] + arr[i - 2];
            System.out.print(arr[i] +" ");
        }
    }

    public static void task6() {
        /*Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        В консоль результат должен выводиться в формате “… год является високосным*/
        for (int i = 1904; i<2096; i++){
            if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0)
                System.out.println(i + " високосный");
        }
    }

    public static void task7() {
        /*Напишите программу, которая выводит в консоль последовательность цифр:
            7 14 21 28 35 42 49 56 63 70 77 84 91 98*/
        for (int i = 7; i < 100; i=i+7) {
            System.out.print(i+" ");
        }
    }

    public static void task8() {
        /*Напишите программу, которая выводит в консоль последовательность цифр:
        1 2 4 8 16 32 64 128 256 512*/
        for (int i = 1; i < 1000; i=i*2) {
            System.out.print(i+" ");
        }
    }

    public static void task9() {
        /*Посчитайте с помощью цикла for сумму годовых накоплений,
        если каждый месяц вы будете откладывать по 29 000 рублей “в банку”.
        Выведите сумму накоплений за каждый месяц в консоль в формате “Месяц … , сумма накоплений равна … рублей” .*/
        int j = 0;
        for (int i = 1; i <= 12 ; i++) {
            j = j + 29000;
            System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", i, j);
        }
    }

    public static void task10() {
        /*Перепишите решение задачи выше при условии, что деньги вы откладывать будете не “в банку”,
        а в банк под проценты – 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате
        “Месяц … , сумма накоплений равна … рублей” */
        double j = 0;
        for (int i = 1; i <= 12 ; i++) {
            j = (j + 29000) + 290;
            System.out.printf("Месяц %d , сумма накоплений равна %.2f рублей\n", i, j);
        }
    }
}
