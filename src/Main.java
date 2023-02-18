public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание. Условный оператор. Часть 2.");

        //Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        char device = 'i';
        if (device == 'i' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS");
        } else {
            if (device == 'a' && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android");
            }
        }
        if (device == 'i' && clientDeviceYear >= 2015) {
            System.out.println("Установите приложениe для IOS");
        } else {
            if (device == 'a' && clientDeviceYear >= 2015) {
                System.out.println("Установите приложениe для Android");
            }
        }

        //Задание 3
        System.out.println("Задание 3");
        int year = 400;
        if (((year %4 ==0) && (year %100 !=0)) || (year %400 ==0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int minDistance = 20;
        int maxDistance = 60;
        int dayDelivery = deliveryDistance/(maxDistance - minDistance);
        int firstDistance = deliveryDistance - dayDelivery*(maxDistance - minDistance);
        if (minDistance<=firstDistance && firstDistance<(maxDistance - minDistance)) {
            System.out.println("Потребуется дней: " + (dayDelivery + 2));
        } else {
            System.out.println("Потребуется дней: " + (dayDelivery + 1));
        }

        //Задание 5
        System.out.println("Задание 5");
        int mounthNumber = 12;
        switch (mounthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
        }
    }
}