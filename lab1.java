import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class MyClass {
    private String text;

    public MyClass(String text) {
        this.text = text;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un enunt: ");
        String enunt = scanner.nextLine();

        System.out.println("Introduceti lungimea cuvintelor: ");
        int lungimeSpecificata = scanner.nextInt();
        scanner.nextLine();

        MyClass myObject = new MyClass(enunt);

        Map<String, Integer> cuvinteExtrase = extrageCuvinteSiNumara(enunt, lungimeSpecificata);

        System.out.println("Cuvintele cu lungimea " + lungimeSpecificata + " care încep cu o consoană (și numărul de apariții):");
        cuvinteExtrase.forEach((cuvant, aparitii) -> System.out.println(cuvant + " - " + aparitii + " ori"));
    }

    private static Map<String, Integer> extrageCuvinteSiNumara(String text, int lungime) {
        String[] cuvinte = text.split(" +");
        Map<String, Integer> cuvinteExtrase = new HashMap<>();

        for (String cuvant : cuvinte) {
            if (cuvant.length() == lungime &&
                    xisConsonant(cuvant.charAt(0))) {
                cuvinteExtrase.put(cuvant, cuvinteExtrase.getOrDefault(cuvant, 0) + 1);
            }
        }

        return cuvinteExtrase;
    }

    private static boolean isConsonant(char ch) {
        return "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(ch) != -1;
    }
}