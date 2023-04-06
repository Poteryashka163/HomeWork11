import java.time.LocalDate;

public class Main {


    public static void calculationYear(int year) {

        System.out.println("Задача 1");
        int year4 = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;
        if (year4 == 0 && year100 > 0) {
            System.out.println("" + year + " год является високосным.");
        } else if (year400 == 0 && year100 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }

    public static void installationApplication (int clientOS,int yearРroduction) {

        System.out.println("Задача 2");
        if (clientOS == 1 && yearРroduction <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (yearРroduction > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 0 && yearРroduction <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (yearРroduction > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
    }

    public static void deliveryCard(int deliveryDistance) {

        System.out.println("Задача 3");
        int day = 0;
        if (deliveryDistance <= 20) {
            int deliveryDay = day + 1;
            System.out.println("Потребуется дней для доставки: " + deliveryDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            int deliveryDay = day + 2;
            System.out.println("Потребуется дней для доставки: " + deliveryDay);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            int deliveryDay = day + 3;
            System.out.println("Потребуется дней для доставки: " + deliveryDay);
        } else {
            System.out.println("Доставки нет!");
        }

    }
    public static void main(String[] args){
        int year = 2000;
        int clientOS = 1;
        int yearРroduction = LocalDate.now().getYear();
        int deliveryDistance =69;
        calculationYear(year);
        installationApplication(clientOS,yearРroduction);
        deliveryCard(deliveryDistance);

    }
}