package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("31 days");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        }
        else if (month == 2) {
            System.out.println("28 or 29 days");
        }
        else {
            System.out.println("wrong number!");
        }
//        case 1:
//        case 3:
//        case 5:
//        case 7:
//        case 8:
//        case 10:
//        case 12:
//        System.out.println("31 days");
//        break;
//        case 4:
//        case 6:
//        case 9:
//        case 11:
//        System.out.println("30 days");
//        break;
//        case 2:
//        System.out.println("28 or 29 days");
//        break;
//        default:
//        System.out.println("wrong number!");
    }
}
