public class HW3 {
    /**
     *  Переменные. Часть 2
     */
    public static void main(String[] args) {
        // Задание 1
        int i = 1;      System.out.println("Значение переменной i с типом int равно " + i);
        byte b = 2;     System.out.println("Значение переменной b с типом byte равно " + b);
        short s =3;     System.out.println("Значение переменной s с типом short равно " + s);
        long l = 4;     System.out.println("Значение переменной l с типом long равно " + l);
        float f = 5.0f; System.out.println("Значение переменной f с типом float равно " + f);
        double d = 6.0; System.out.println("Значение переменной d с типом double равно " + d);

        // Задание 2 проинициализировать: 27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
        float d2 = 27.12f;
        long l2 = 987678965549L;
        byte b2 = 2;
        short s2 = 786;
        boolean bool = false;
        short s3 = 569;
        short s4 = -159;
        int i2 = 27897;
        byte b3 = 67;
        System.out.println();

        // Задание 3
        int teacher1 = 23;
        int teacher2 = 27;
        int teacher3 = 30;
        int allPaper = 480;
        int studiesPaper = allPaper / (teacher1+teacher2+teacher3);
        System.out.println("На каждого ученика рассчитано " + studiesPaper + " листов бумаги" +"\n");

        // Задание 4
        int prodInTwoMinutes = 16;
        int prodInOneMinute = prodInTwoMinutes / 2;
        int prodInTwentyMinutes = prodInOneMinute * 20;
        int prodPerDay = 24 * 60 * prodInOneMinute;
        int prodInThreeDays = prodPerDay * 3;
        int prodMonthly = prodPerDay * 31;
        System.out.println("За 20 минут машина произвела бутылок " + prodInTwentyMinutes + " штук");
        System.out.println("За сутки машина произвела бутылок " + prodPerDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + prodInThreeDays + " штук");
        System.out.println("За месяц машина произвела бутылок " + prodMonthly + " штук" + "\n");

        // Задание 5
        int allPaintPots = 120;
        int whitePaintForClass = 2;
        int brownPaintForClass = 4;
        int classes = allPaintPots / (whitePaintForClass + brownPaintForClass);
        int totalWhitePaint = whitePaintForClass * classes;
        int totalBrownPaint = brownPaintForClass * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhitePaint
                + " банок белой краски и " + totalBrownPaint + " банок коричневой краски." + "\n");

        // Задание 6
        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        int breakfastInGrammes = 5*banana + 2*milk + 2*iceCream + 4*egg;
        int breakfastInKilogrammes = breakfastInGrammes / 1000;
        System.out.println(breakfastInKilogrammes + "\n");

        // Задание 7
        int aim = 7;
        int dietInDay1 = 250;
        int dietInDay2 = 500;
        int daysWeightLoss1 = 1000*aim / dietInDay1;
        int daysWeightLoss2 = 1000*aim / dietInDay2;
        int averageDays = (daysWeightLoss1 + daysWeightLoss2) / 2;
        System.out.println(daysWeightLoss1 + " " + daysWeightLoss2 + " "  + averageDays + "\n");

        // Задание 8
        double mashaSalary = 67760;
        double mashaYearSalary = mashaSalary * 12;
        double mashaRaiseSalary = mashaSalary * 1.1;
        System.out.println("Маша теперь получает "+mashaRaiseSalary+" рублей. Годовой доход вырос на "
                + (mashaRaiseSalary*12 - mashaYearSalary) + " рублей");
        double denisSalary = 83690;
        double denisYearSalary = denisSalary * 12;
        double denisRaiseSalary = denisSalary * 1.1;
        System.out.println("Денис теперь получает "+denisRaiseSalary+" рублей. Годовой доход вырос на "
                + (denisRaiseSalary*12 - denisYearSalary) + " рублей");
        double kristinaSalary = 76230;
        double kristinaYearSalary = kristinaSalary * 12;
        double kristinaRaiseSalary = kristinaSalary * 1.1;
        System.out.println("Кристина теперь получает "+kristinaRaiseSalary+" рублей. Годовой доход вырос на "
                + (kristinaRaiseSalary*12 - kristinaYearSalary) + " рублей");
    }
}
