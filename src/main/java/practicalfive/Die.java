package practicalfive;

/** The main entry point for ComputeMoonDistance.
 *  The source code inside of this method will be executed when the program is
 *  run in the command-line. The output of this program will appear in the
 *  terminal window. The println statements make the program display output.
 *  The program will calculate and display the distance to the moon in yards.
 *  To learn more visit: https://spaceplace.nasa.gov/moon-distance/en/
 *
 **/
public class Die {

  private static final int MAX = 6;
  private int faceValue;

  /** The main entry point for ComputeMoonDistance.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output.
   *  The program will calculate and display the distance to the moon in yards.
   *  To learn more visit: https://spaceplace.nasa.gov/moon-distance/en/
   *
   **/
  public Die() {
    faceValue = 1;
  }

  /** The main entry point for ComputeMoonDistance.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output.
   *  The program will calculate and display the distance to the moon in yards.
   *  To learn more visit: https://spaceplace.nasa.gov/moon-distance/en/
   **/
  public int roll() {
    faceValue = (int)(Math.random() * MAX) + 1;
    return faceValue;
  }

  /** The main entry point for ComputeMoonDistance.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output.
   *  The program will calculate and display the distance to the moon in yards.
   *  To learn more visit: https://spaceplace.nasa.gov/moon-distance/en/
   *
   */
  public void setFaceValue(int value) {
    faceValue = value;
  }

  /** The main entry point for ComputeMoonDistance.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output.
   *  The program will calculate and display the distance to the moon in yards.
   *  To learn more visit: https://spaceplace.nasa.gov/moon-distance/en/
   *
   **/
  public int getFaceValue() {
    return faceValue;
  }

  /** The main entry point for ComputeMoonDistance.
   *  The source code inside of this method will be executed when the program is
   *  run in the command-line. The output of this program will appear in the
   *  terminal window. The println statements make the program display output.
   *  The program will calculate and display the distance to the moon in yards.
   *  To learn more visit: https://spaceplace.nasa.gov/moon-distance/en/
   *
   **/
  public String toString() {
    String result = Integer.toString(faceValue);
    return result;
  }

}
