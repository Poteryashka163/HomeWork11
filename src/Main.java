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

    public static int deliveryCard(int deliveryDistance) {
        int day=0;
        System.out.println("Задача 3");
        if (deliveryDistance <= 20) {
            return day=1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return day=2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return day=3;
       }
       return day;
    }
    public static void main(String[] args){
        int year = 2000;
        int clientOS = 1;
        int yearРroduction = LocalDate.now().getYear();
        int deliveryDistance =69;
        calculationYear(year);
        installationApplication(clientOS,yearРroduction);
        int x= deliveryCard(deliveryDistance);
        System.out.println(x);


    }
}