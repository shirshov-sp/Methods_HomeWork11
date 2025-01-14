import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ \"Методы\" \n");


        System.out.println("Задача 1");
        int year = 2025;
        if (year < 1584) {
            System.out.println("До 1584 года високосность годов не определяли\n");
        } else if (checkYear(year)) {
            System.out.println("Год " + year + " является високосным\n");
        } else {
            System.out.println("Год " + year + " не является високосным\n");
        }

        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = 2015;
        System.out.println(identifyDevice(clientOS, clientDeviceYear));

        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryTime = defineDeliveryTime(deliveryDistance);
        if (deliveryTime == -1) {
            System.out.println("Некорректное расстояние\n");
        } else if (deliveryTime == 0) {
            System.out.println("Доставка не осуществляется\n");
        } else {
            System.out.println("Потребуется дней " + deliveryTime + "\n");
        }
    }

    public static boolean checkYear(int yearForChecking) {
        return yearForChecking % 4 == 0 && yearForChecking % 100 != 0 || yearForChecking % 400 == 0;
    }

    public static String identifyDevice(byte clientOS, int clientDeviceYear) {
        String messageForClient = "";
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            messageForClient = "Установите облегченную версию приложения для iOS по ссылке\n";
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            messageForClient = "Установите облегченную версию приложения для Android по ссылке\n";
        } else if (clientOS == 0) {
            messageForClient = "Установите версию приложения для iOS по ссылке\n";
        } else if (clientOS == 1) {
            messageForClient = "Установите версию приложения для Android по ссылке\n";
        } else {
            messageForClient = "Не существует приложения для такого устроства\n";
        }
        return messageForClient;
    }

    public static int defineDeliveryTime(int distance) {
        int time = 0;
        if (distance <= 0) {
            time = -1;
        } else if (distance < 20) {
            time = 1;
        } else if (distance < 60) {
            time = 2;
        } else if (distance <= 100) {
            time = 3;
        }
        return time;
    }
}