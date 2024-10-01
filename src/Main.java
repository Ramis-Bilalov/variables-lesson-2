import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача 1
        int i = 10000;
        byte b = 125;
        short s = 30000;
        long l = 1000000L;
        float f = 5.5f;
        double d = 6.3;

        System.out.println("Задача 1.");
        System.out.println("Значение переменной с типом int равно " + i);
        System.out.println("Значение переменной с типом byte равно " + b);
        System.out.println("Значение переменной с типом short равно " + s);
        System.out.println("Значение переменной с типом long равно " + l);
        System.out.println("Значение переменной с типом int равно " + f);
        System.out.println("Значение переменной с типом int равно " + d);

        // Задача 2
        double de = 27.12;
        long le = 987_678_965_549L;
        double dee = 2.786;
        int ie = 569;
        int iee = -159;
        int ieee = 27897;
        int ia = 67;

        // Задача 3
        int firstTeacherStudents = 23;              // ученики первого учителя
        int secondTeacherStudents = 27;             // ученики второго учителя
        int thirdTeacherStudents = 30;              // ученики третьего учителя
        int totalAmountOfSheets = 480;              // общее количество листов бумаги

        int oneStudentSheets;                       // бумага на одного ученика

        oneStudentSheets = totalAmountOfSheets/(firstTeacherStudents
                + secondTeacherStudents + thirdTeacherStudents);        // бумага, рассчитанная на одного ученика

        System.out.println("\nЗадача 3.");
        System.out.println("На каждого ученика рассчитано " + oneStudentSheets + " листов бумаги");

        // Задача 4
        int outputPerOneMinute = 8;         // производительность за 1 минуту
        int aa = 20;                        // 20 минут
        int bb = 24 * 60;                   // сутки
        int cc = 3 * 24 * 60;               // 3 дня
        int dd = 30 * 24 * 60;              // месяц

        int aaOutput = aa * outputPerOneMinute;
        int bbOutput = bb * outputPerOneMinute;
        int ccOutput = cc * outputPerOneMinute;
        int ddOutput = dd * outputPerOneMinute;

        System.out.println("\nЗадача 4.");
        System.out.println("За 20 минут машина произвела " + aaOutput + " штук");
        System.out.println("За сутки машина произвела " + bbOutput + " штук");
        System.out.println("За 3 дня машина произвела " + ccOutput + " штук");
        System.out.println("За 1 месяц машина произвела " + ddOutput + " штук");

        // Задача 5

        int totalAmountOfPaint = 120;           // общее количество банок краски
        int oneRoomPaint = 6;                   // 6 банок краски уходит на одну комнату
        int oneRoomWhitePaint = 2;              // 2 банки краски белой уходит на одну комнату
        int oneRoomBrownPaint = 4;              // 4 банки краски коричневой уходит на одну комнату
        int amountOfRooms = totalAmountOfPaint / oneRoomPaint;              // количество комнат, на которые рассчитана краска
        int totalAmountOfWhitePaint = oneRoomWhitePaint * amountOfRooms;    // общее количество белой краски на все комнаты
        int totalAmountOfBrownPaint = oneRoomBrownPaint * amountOfRooms;    // общее количество коричневой краски на все комнаты

        System.out.println("\nЗадача 5.");
        System.out.println("«В школе, где " +
                amountOfRooms +" классов, нужно " +
                totalAmountOfWhitePaint + " банок белой краски и " +
                totalAmountOfBrownPaint + " банок коричневой краски».");

        // Задача 6.

        int weightOfBananas = 5 * 80;               // общий вес бананов в граммах
        int weightOfMilk = 2 * 105;                 // общий вес молока в граммах
        int weightOfIceCream = 2 * 100;             // общий вес мороженого в граммах
        int weightOfEggs = 4 * 70;                  // общий вес яиц в граммах

        int totalWeightOfBreakfastInGrams = weightOfBananas + weightOfMilk + weightOfIceCream + weightOfEggs;   // общий вес завтрака в граммах
        float totalWeightOfBreakfastInKilograms = (float) totalWeightOfBreakfastInGrams / 1000;                 // общий вес завтрака в килограммах

        System.out.println("\nЗадача 6.");

        System.out.println("Вес спорт завтрака спортсмена составляет " + totalWeightOfBreakfastInGrams + " граммов и " + totalWeightOfBreakfastInKilograms + " килограмм.");

        // Задача 7

        int totalWeightToLose = 7 * 1000;           // общий вес в граммах для уменьшения веса спортсмена
        int minWeightToLosePerDay = 250;            // минимальный вес для похудения в день
        int maxWeightToLosePerDay = 500;            // максимальный вес для похудения в день

        int maxDaysForWeightLoss = totalWeightToLose / minWeightToLosePerDay;           // максимальное количество дней для похудения
        int minDaysForWeightLoss = totalWeightToLose / maxWeightToLosePerDay;           // минимальное количество дней для похудения

        int averageDaysToWeightLoss = (maxDaysForWeightLoss + minDaysForWeightLoss)/2;      // среднее количество дней для похудения


        System.out.println("\nЗадача 7.");
        System.out.println("Если спортсмен будет терять по " + minWeightToLosePerDay + " граммов в день, он похудеет за " + maxDaysForWeightLoss + " дней, чтобы похудеть на 7 кг.");
        System.out.println("Если спортсмен будет терять по " + maxWeightToLosePerDay + " граммов в день, он похудеет за " + minDaysForWeightLoss + " дней, чтобы похудеть на 7 кг.");
        System.out.println("В среднем понадобится " + averageDaysToWeightLoss + " день, чтобы похудеть на 7 кг.");


        // Задача 8

        int mariaSalaryBeforePromotion = 67760;             // зарплата Марии до повышения
        int denisSalaryBeforePromotion = 83690;             // зарплата Дениса до повышения
        int kristinaSalaryBeforePromotion = 76230;          // зарплата Кристины до повышения
        double coefficientOfPromotion = 1.1;                // коэффициент повышения зарплаты

        double mariaSalaryAfterPromotion = mariaSalaryBeforePromotion * coefficientOfPromotion;         // зарплата Марии до повышения
        double denisSalaryAfterPromotion = denisSalaryBeforePromotion * coefficientOfPromotion;         // зарплата Дениса до повышения
        double kristinaSalaryAfterPromotion = kristinaSalaryBeforePromotion * coefficientOfPromotion;   // зарплата Кристины до повышения

        int mariaSalaryPerYearBeforePromotion = mariaSalaryBeforePromotion * 12;                // зарплата Марии в год до повышения
        int denisSalaryPerYearBeforePromotion = denisSalaryBeforePromotion * 12;                // зарплата Дениса в год до повышения
        int kristinaSalaryPerYearBeforePromotion = kristinaSalaryBeforePromotion * 12;          // зарплата Кристины в год до повышения

        double mariaSalaryPerYearAfterPromotion = mariaSalaryAfterPromotion * 12;               // зарплата Марии в год после повышения
        double denisSalaryPerYearAfterPromotion = denisSalaryAfterPromotion * 12;               // зарплата Дениса в год после повышения
        double kristinaSalaryPerYearAfterPromotion = kristinaSalaryAfterPromotion * 12;         // зарплата Кристины в год после повышения

        double differenceOfMariaSalaryBeforeAndAfterPromotion = mariaSalaryPerYearAfterPromotion - mariaSalaryPerYearBeforePromotion;
        double differenceOfDenisSalaryBeforeAndAfterPromotion = denisSalaryPerYearAfterPromotion - denisSalaryPerYearBeforePromotion;
        double differenceOfKristinaSalaryBeforeAndAfterPromotion = kristinaSalaryPerYearAfterPromotion - kristinaSalaryPerYearBeforePromotion;

        DecimalFormat myFormat = new DecimalFormat("#.##");

        System.out.println("\nЗадача 8.");
        System.out.println("Мария теперь получает " + myFormat.format(mariaSalaryAfterPromotion) + " рублей. " +                // использовал класс DecimalFormat для округления результатов
                "Годовой доход вырос на " + myFormat.format(differenceOfMariaSalaryBeforeAndAfterPromotion) + " рублей.");      // выходило много лишних цифр после запятой
        System.out.println("Денис теперь получает " + myFormat.format(denisSalaryAfterPromotion) + " рублей. " +
                "Годовой доход вырос на " + myFormat.format(differenceOfDenisSalaryBeforeAndAfterPromotion) + " рублей.");
        System.out.println("Кристина теперь получает " + myFormat.format(kristinaSalaryAfterPromotion) + " рублей. " +
                "Годовой доход вырос на " + myFormat.format(differenceOfKristinaSalaryBeforeAndAfterPromotion) + " рублей.");

    }
}