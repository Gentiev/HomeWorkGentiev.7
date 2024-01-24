public class Main {
    public static void main(String[] args) {
//Задача.1
        int q = 0;
        int totalSum = 0;
        int partMoney = 15000;
        while (totalSum < 2_459_000) {
            q++;
            totalSum = totalSum + totalSum / 100;
            totalSum = totalSum + partMoney;
            System.out.println("Month " + q + ", amount of savings = " + totalSum);
        }
//Задача.2
        int w = 0;
        while (w < 10){
            ++w;
            System.out.print(w + " ");
        }
        System.out.println();
        for (; w >= 1; w--){
            System.out.print(w + " ");
        }
        System.out.println();
//Задача.3
        int humanPopulation = 12_000_000;
        int year = 0;
        int birthRate1000 = 17;
        int deathRate1000 = 8;
        while (year < 12){
            ++year;
            humanPopulation = humanPopulation + ((humanPopulation / 1000) * birthRate1000) + ((humanPopulation / 1000) * deathRate1000);
            System.out.println("Year - " + year + ", population = " + humanPopulation);
        }
//Задача.4
        int startMoney = 15000;
        int month = 0;
        int total = startMoney;
        while (total < 12_000_000){
            ++month;
            total = total + 7 * total / 100;
            System.out.println("Month - " + month + ", savings = " + total);
        }
//Задача.5
        int month1 = 0;
        int total1 = startMoney;
        while (total1 < 12_000_000) {
            ++month1;
            total1 = total1 + 7 * total1 / 100;
            if (month1 % 6 == 0) {
                System.out.println("Month - " + month1 + ", savings = " + total1);
            }
        }
        System.out.println((char)27 +"[4mCongratulations, you are a real Vasya!");
        System.out.println("Month - " + month1 + ", savings = " + total1);
        System.out.print((char)27 + "[0m");
//Задача.6
        int month2 = 0;
        int total2 = startMoney;
        while (month2 < (9*12)) {
            ++month2;
            total2 = total2 + 7 * total2 / 100;
            if (month2 % 6 == 0){
                System.out.println("Month - " + month2 + ", savings = " + total2);
            }
        }
//Задача.7
        for (int firstFriday = 5 ; firstFriday <= 31; firstFriday = firstFriday + 7)
        {
            System.out.println("Today is Friday, " + firstFriday + ".1.2024, it is necessary to prepare a report.");
        }
//Задача.8
        int periodicitiComet = 79;
        while (periodicitiComet < 2124){
            periodicitiComet = periodicitiComet + 79;
            if (periodicitiComet > 1824 && periodicitiComet < 2124){
                System.out.println(periodicitiComet);
            }
        }
    }
}