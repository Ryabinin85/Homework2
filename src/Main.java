import static java.lang.Math.abs;
/**
 *  1. Переменные. Домашние задания урока
 */
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
//  Задание 1.
//  Выведите значения каждой переменной в консоль.
        System.out.println("Задание 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.print("\n");
//  Задание 2.
//  Увеличьте значение каждой перечисленной в прошлой задаче переменной на 4.
//  Для решения этой задачи используйте тип переменной var.
//  Выведите в консоль новые значения переменных.
        System.out.println("Задание 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.print("\n");
//  Задание 3.
//  А теперь нужно уменьшить значение каждой переменной:
//  1. dog уменьшить на 3,5;
//  2. cat  уменьшить на 1,6;
//  3. paper уменьшить на  7639;
        System.out.println("Задание 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.print("\n");
//  Задание 4.
//  Инициализируйте (=присвойте значение) переменную friend значением 19.
//  Увеличьте значение переменной на 2, после чего поделите значение на 7.
//  После каждой операции выводите значение переменной в консоль.
//  В итоге, у вас должно быть выведено 3 значения одной переменной.
//  Для решения этой задачи используйте тип переменной var.
        System.out.println("Задание 4");
        var friend = 19.0;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend + 2 = " + friend);
        friend /=7;
        System.out.println("friend / 2 = " + friend);
        System.out.print("\n");
//  Задание 5.
//  Инициализируйте переменную frog значением 3,5.
//  Умножьте переменную в 10 раз и поделите на 3,5.
//  Добавьте к последнему значению переменной 4.
//  После каждой операции выводите значение переменной в консоль.
//  В итоге, у вас должно быть выведено 4 значения одной переменной.
//  Для решения этой задачи используйте тип переменной var.
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog * 10 = " + frog);
        frog /= 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog += 4;
        System.out.println("frog + 4 = " + frog);
        System.out.print("\n");
//  Задание 6 и 7
//  Вес одного боксера – 78,2 кг
//  Вес второго боксера – 82,7 кг
//  Подсчитайте и выведите в консоль общий вес двух бойцов.
//  Подсчитайте и выведите в консоль разницу между весами бойцов.
//  Для решения этой задачи используйте тип переменной var.
//  Вычислите разницу весов спортсменов, используя 2 способа:
//  1. Вычитание из большего веса меньшего
//  2. Используя функцию остаток от деления
        System.out.println("Задание 6 и 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sum = firstBoxer + secondBoxer;
        var difference = secondBoxer - firstBoxer;
        var absDifference = abs(firstBoxer - secondBoxer);
        System.out.println("Вес двух боксеров = " + sum);
        System.out.println("1 метод: Разница в весе двух боксеров = " + difference);
        System.out.println("2 метод: Разница в весе двух боксеров = " + secondBoxer%firstBoxer);
        System.out.println("3 метод: Разница в весе двух боксеров = " + absDifference);
        System.out.print("\n");
//  Задание 8.
//  Решите задачу с помощью функций сложения, вычитания, умножения и деления.
//  1. 640 часов работы поделено между сотрудниками. Если каждый сотрудник посвящает работе 8 часов,
//  то сколько всего работников в компании?
//  Выведите результат задачи в консоль в формате “Всего работников в компании – … человек”.
//  2. Посчитайте сколько часов работы должно быть поделено между сотрудниками,
//  если в компании работает на 94 человека больше.
//  Выведите результат задачи в консоль в формате “Если в компании работает … человек, то всего … часов
//  работы может быть поделено между сотрудниками”.
//  Для решения этой задачи используйте тип переменной var.
        System.out.println("Задание 8");
        var workHours = 640;
        var employeeHours = 8;
        var employees = workHours / employeeHours;
        var otherEmployees = employees + 94;
        var otherEmployeesHours = otherEmployees * employeeHours;
        System.out.println("Всего работников в компании – " + employees + " человек.");
        System.out.println("Если в компании работает " + otherEmployees + " человека, то всего " + otherEmployeesHours +
                " часа работы может быть поделено между сотрудниками.");
    }
}
