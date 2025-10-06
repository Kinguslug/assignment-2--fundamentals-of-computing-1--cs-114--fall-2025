public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    int bottleOfBeer = 100;
    while (bottleOfBeer > -1) {
      System.out.println(bottleOfBeer + " bottles of beer on the wall");
      System.out.println(bottleOfBeer + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall\n");
      --bottleOfBeer;
    }
  }
}
