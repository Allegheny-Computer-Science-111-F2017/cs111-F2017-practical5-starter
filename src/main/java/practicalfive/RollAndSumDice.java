package practicalfive;

/** The main entry point for ComputeMoonDistance.
 *  The source code inside of this method will be executed when the program is
 *  run in the command-line. The output of this program will appear in the
 *  terminal window. The println statements make the program display output.
 *  The program will calculate and display the distance to the moon in yards.
 *  To learn more visit: https://spaceplace.nasa.gov/moon-distance/en/
 *
 * @param args The command-line arguments
 **/

public class RollAndSumDice {

  /** The main entry point for ComputeMoonDistance.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output.
   *  The program will calculate and display the distance to the moon in yards.
   *  To learn more visit: https://spaceplace.nasa.gov/moon-distance/en/
   *
   * @param args The command-line arguments
   **/
  public static void main(String[] args) {
    // Step One: Declare three instances of the Die class
    Die die1;
    Die die2;
    Die die3;

    // Step Two: Construct each of the three Die objects
    die1 = new Die();
    die2 = new Die();
    die3 = new Die();

    // Step Three: Roll each of the die
    die1.roll();
    die2.roll();
    die3.roll();

    // Step Four: Print out the face value of each die
    System.out.println("Die One's Face Value: " + die1);
    System.out.println("Die Two's Face Value: " + die2);
    System.out.println("Die Three's Face Value: " + die3);

    // Step Five: Compute and output the sum of each die's face value
    int sum;
    sum = die1.getFaceValue() + die2.getFaceValue() + die3.getFaceValue();
    System.out.println("The Sum of the Three Die is: " + sum);
  }

}
