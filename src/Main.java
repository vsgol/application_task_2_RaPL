import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

public static boolean matches(String text, String regex) {
    try {
        return Pattern.matches(regex, text);
    } catch (PatternSyntaxException e) { // Тут надо найти вариант без исключения, тк это долго
        return false;
    }
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s1 = input.nextLine();
    String s2 = input.nextLine();

    System.out.println(matches(s1, s2));
}

}
