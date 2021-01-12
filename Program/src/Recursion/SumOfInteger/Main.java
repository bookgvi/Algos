package Recursion.SumOfInteger;

public class Main {
  public static void main(String[] args) {
    final int COUNT = 21;
    Summarization summarization = new Summarization(COUNT);
    summarization.sum();
    System.out.printf("Control: %s%n", (COUNT * (1 + COUNT)) / 2);
  }
}
