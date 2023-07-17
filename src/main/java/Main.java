public class Main {
  public static void main(String[] args) {
    System.out.println(checkIfInputIsAnEvenNumber(122));

    System.out.println("This is a test change for build after commit.");
  }

  public static boolean checkIfInputIsAnEvenNumber(int number) {
    return number % 2 == 0;
  }
}
