package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {

        if ((symbol >= 'A' && symbol <= 'Z') || (symbol >= 'a' && symbol <= 'z')) {
            System.out.println("English");
        } else {
            System.out.println("Non English");
        }
    }
}
//3. Is symbol english determiner.
//        Implement the program that prints to console if char is from ENG layout (prints "English")
//        or no(prints "Non English"):