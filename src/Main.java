public class Main {
    public static void main(String[] args) {
        /* task1 */
       int clientOS = 1;
       if (clientOS == 0){
           System.out.println("Установите версию приложения для iOS по ссылке");
       } else if (clientOS == 1){
           System.out.println("Установите версию приложения для Android по ссылке");
       }

       /* task2 */
        int clientDeviceYear = 2015;
        if (clientOS == 0){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS == 1){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else { System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        /* task3 */
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        }else
            System.out.println("Год не является високосным");

        /* task4 */
        int deliveryDistance = 95;
        int daysForDelivery = 0;
        if (deliveryDistance <= 20){
            daysForDelivery += 1;
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            daysForDelivery += 2;
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (deliveryDistance > 60 && deliveryDistance < 100){
            daysForDelivery += 3;
            System.out.println("Потребуется дней: " + daysForDelivery);
        }else System.out.println("Доставка не осуществляется");

        /* task5 */
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц " + monthNumber + " Принадлежит сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц " + monthNumber + " Принадлежит сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц " + monthNumber + " Принадлежит сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц " + monthNumber + " Принадлежит сезону Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }

    }

}