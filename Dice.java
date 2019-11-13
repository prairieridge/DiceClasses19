public class Dice {

  private int sides;
  private String type;

  public Dice() {

    sides = 6;
    type = "Six Sided";
  }

  public Dice(int d) {

    sides = d;
    type = d + " Sided";
  }

  public int roll() {

    return (int) (Math.random() * sides) + 1;
  }

  public String toString() {

    return "The number of sides of your dice is: " + sides;
  }

  public String getType() {
    return type;
  }

  public boolean sameType(Dice n) {
    if (this.getType().equals(n.getType()))
      return true;
    else
      return false;
  }

}