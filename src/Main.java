public class Main {
    public static void main(String[] args) {
        /* task1 */
       int clientOS = 0;
       if (clientOS == 0){
           System.out.println("Установите версию приложения для iOS по ссылке");
       } else System.out.println("Установите версию приложения для Android по ссылке");
        /* task2 */
        int clientDeviceYear = 2015;
        if (clientOS == 0){
            if (clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
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
    }

}