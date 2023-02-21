package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {

        if (second != 0 && first % second == 0) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}
//    Implement the program that will consume 2 numbers as method arguments and will print
//        if the first number is Aliquot(prints:"Aliquot" is yes otherwise "Not aliquot") to the other: