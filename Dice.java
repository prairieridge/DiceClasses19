public class Dice {
  // declare instance(global) variables - Must be private visibility
  private int sides;
  private String type;

  // Default constructor that accepts no paramaters and intializes variables
  public Dice() {

    sides = 6;
    type = "Six Sided";
  }

  // Second constructor that accepts an integer variable to initialize sides
  public Dice(int d) {

    sides = d;// d is a local variable that only lives in this constructor
    type = d + " Sided";
  }

  // Method called roll that accepts no paramters and returns a random side
  public int roll() {

    return (int) (Math.random() * sides) + 1;
  }

  // Default toString method that returns a string
  public String toString() {

    return "The number of sides of your dice is: " + sides;
  }

  // method that returns a string
  public String getType() {
    return type;
  }

  // This will pass the object as a parameter and run each objects getType method
  // to compare the results. .equals must be used to compare Strings not ==.
  public boolean sameType(Dice n) {
    if (this.getType().equals(n.getType()))
      return true;
    else
      return false;
  }

}