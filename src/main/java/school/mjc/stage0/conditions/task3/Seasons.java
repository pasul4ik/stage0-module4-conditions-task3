package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        System.out.println("Name of the season:");

        if (month >= 1 || month <= 2 || month == 12) {
            System.out.println("Winter");
        } else if (month >= 3 || month <= 5) {
            System.out.println("Spring");
        } else if (month >= 6 || month <= 8) {
            System.out.println("Summer");
        } else if (month >= 9 || month <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("wrong number!");
        }


//        if (month == 1 || month == 2 || month = 12) {
//            System.out.println("Winter");
//        } else if (month = 3 || month == 4 || month == 5) {
//            System.out.println("Spring");
//        } else if (month = 6 || month == 7 || month == 8) {
//            System.out.println("Summer");
//        } else if (month = 9 || month == 10 || month == 11) {
//            System.out.println("Autumn");
//        } else {
//            System.out.println("wrong number!");
//        }

    }
}
//1. Seasons.
//        Print the name of a season by number of a month(e.g. if number is 6 => "Summer").
//        Number of the month will be coming from parameter of the method
//        (if number is not a month number e.g. 13 => print: "wrong number!" ):

