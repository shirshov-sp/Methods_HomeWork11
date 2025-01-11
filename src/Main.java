import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ \"Методы\" \n");

        //Задача 1
        System.out.println("Задача 1");
        int year = 2025;
        if (year < 1584) {
            System.out.println("До 1584 года високосность годов не определяли\n");
        } else if (chekingYear(year)) {
            System.out.println("Год " + year + " является високосным\n");
        } else {
            System.out.println("Год " + year + " не является високосным\n");
        }

        //Задача 2
        System.out.println("Задача 2");
        byte clientOS = 1; //0 — iOS, 1 — Android
        int clientDeviceYear = 2015;
        System.out.println(identificationDevice(clientOS, clientDeviceYear));

        //Задача 3
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryTime = deliveryTime(deliveryDistance);
        if (deliveryTime == 0) {
            System.out.println("Доставка не осуществляется\n");
        } else {
            System.out.println("Потребуется дней " + deliveryTime + "\n");
        }

    }

    //Метод для задачи 1
    public static boolean chekingYear(int yearForCheking) {
        boolean methodVar = yearForCheking % 4 == 0 && yearForCheking % 100 != 0 || yearForCheking % 400 == 0;
        return methodVar;
    }

    //Метод для задачи 2
    public static String identificationDevice(byte clientOS, int clientDeviceYear) {
        String methodVar = "";
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear <= currentYear) {
                methodVar = "Установите облегченную версию приложения для iOS по ссылке\n";
            } else {
                methodVar = "Установите версию приложения для iOS по ссылке\n";
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear <= currentYear) {
                methodVar = "Установите облегченную версию приложения для Android по ссылке\n";
            } else {
                methodVar = "Установите версию приложения для Android по ссылке\n";
            }
        }
        return methodVar;
    }

    //Метод для задачи 3
    public static int deliveryTime(int distance) {
        int time = 0;
        if (distance < 20) {
            time = 1;
        } else if (distance < 60) {
            time = 2;
        } else if (distance <= 100) {
            time = 3;
        }
        return time;
    }
}