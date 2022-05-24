class App {
  public static void main(String args[]) {
    App.forLoop();
    App.whileLoop();
    App.doWhileLoop();
  }

  private static void forLoop() {
    for (int i = 10; i > 0; i--) {
      System.out.println(i);
    }
    System.out.println("Launch!");
  }

  private static void whileLoop() {
    int counter = 0;
    while (counter < 5) {
      counter += 1;
      System.out.println("I love Java");
    }
  }

  private static void doWhileLoop() {
    int counter = 0;
    do {
      counter += 1;
      System.out.println("I love Java");
    } while (counter < 5);
  }
}
