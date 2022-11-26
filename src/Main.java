import java.time.LocalDate;

public class Main {
    private static boolean isLeapYear(int year) {
        return  year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printYear(int year,boolean leapYear){
        if (leapYear){
            System.out.println("Год " + year + " високосный год ");}
        else {
            System.out.println("Год " + year + " не високосный год ");
        }}


    //Задание 2
    public static void main (String[]args){
        int year= 2022;
        boolean leapYear= isLeapYear(year);
        printYear(year, leapYear);
        int clientOS=1;
        int productionYear=2015;
        printInfoAboutDevice(clientOS,productionYear);
    }
    private static String get0sByType(int type){
        if (type==1){
            return "Android";
        }else if (type==0){
            return "IOS";
        }else {
            return "unknown";
        }
    }
    private static String getType0fVersion(int productionYear){
        int currentYear=LocalDate.now().getYear();
        if (productionYear==currentYear){
            return "обычную";
        }else {
            return "lite";
        }
    }
    private static void printInfoAboutDevice(int type, int productionYear){
        String os=get0sByType(type);
        String typeOfVersion=getType0fVersion((productionYear));
        System.out.println("Установите "+ typeOfVersion+ " версию приложения для "+ os);

    //Задание 3
    int deliveryDistance = 95;
    int deliveryTime = calculateDeliveryTime(deliveryDistance);
        System.out.println( "Потребуется дней:" +deliveryDistance+ " срок доставки");
    }
    private static int calculateDeliveryTime(int deliveryDistance){
    int deliveryTime= 1;
    int interval= 40;
    int start=20;
    if (deliveryDistance>start){
        deliveryTime = deliveryTime+ (int) Math.ceil((deliveryDistance-start)/(double)interval);
    }
    return deliveryTime;
    }
}

