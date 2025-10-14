import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string:");
    String input = scanner.nextLine();

    int countA = 0;
    int countE = 0;
    int countI = 0;
    int countO = 0;
    int countU = 0;
    int nonVowelCount = 0;

    for (int i = 0; i < input.length(); i++) {
      char chracter = input.charAt(i);

      switch (chracter) {
        case 'a':
          countA++;
          break;
        case 'e':
          countE++;
          break;
        case 'i':
          countI++;
          break;
        case 'o':
          countO++;
          break;
        case 'u':
          countU++;
          break;
        default:
          nonVowelCount++;
      }
    }

    System.out.println("\nVowel counts:");
    System.out.println("a: " + countA);
    System.out.println("e: " + countE);
    System.out.println("i: " + countI);
    System.out.println("o: " + countO);
    System.out.println("u: " + countU);
    System.out.println("Non-vowel characters: " + nonVowelCount);

    scanner.close();
  }
}
