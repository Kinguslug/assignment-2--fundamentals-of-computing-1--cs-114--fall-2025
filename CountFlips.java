public class CountFlips {
  public static void main(String[] args) {
    Coin myCoin = new Coin();
    int headsCount = 0;
    int tailsCount = 0;

    for (int i = 1; i <= 100; i++){
      myCoin.flip();
      if (myCoin.isHeads()) {
        headsCount += 1;
      }
      else{
        tailsCount += 1;
      }
    }
    System.out.println("\nHeads count: "+headsCount+"\nTails count: "+tailsCount);
  }

}
