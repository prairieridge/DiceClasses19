class Main {
  public static void main(String[] args) {

    Dice d6 = new Dice();// Creates a dice object
    System.out.println(d6.toString());
    for (int i = 0; i < 10; i++) {
      System.out.println("You rolled a " + d6.roll());
    }

    System.out.println("============D20==============");

    Dice d20 = new Dice(20);
    System.out.println(d20);
    for (int i = 0; i < 10; i++) {
      System.out.println("You rolled a " + d20.roll());
    }

    System.out.println(d6.sameType(d20));

  }
}