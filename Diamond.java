import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    System.out.println("Please Enter a Number:");
    Scanner input = new Scanner(System.in);
    //-----------------------------------------
    // Assigning Variables
    //-----------------------------------------
    int numOfStars = input.nextInt();
    int shapeOfDiamond, rows;
    //-----------------------------------------
    // Code checking if user input is negative
    //-----------------------------------------
    if(numOfStars%2 == 1) {
    //-----------------------------------------
    // Code for top of Odd Diamond
    //-----------------------------------------
      for(rows = 1; rows < numOfStars; rows += 2) {
        for(shapeOfDiamond = 0; shapeOfDiamond < numOfStars - 1 - rows/2; ++shapeOfDiamond) {
          System.out.print(" ");
        }
        for(shapeOfDiamond = 0; shapeOfDiamond < rows; shapeOfDiamond++) {
          System.out.print("*");
        }
        System.out.println("");
      }
      //-----------------------------------------
      // Code for bottom of Odd Diamond
      //-----------------------------------------
      for(rows = numOfStars; rows > 0; rows -= 2) {
        for(shapeOfDiamond = 0; shapeOfDiamond < numOfStars - 1 - rows/2; ++shapeOfDiamond) {
          System.out.print(" ");
        }
        for(shapeOfDiamond = 0; shapeOfDiamond < rows; shapeOfDiamond++) {
          System.out.print("*");
        }
      System.out.println("");
      }
    }
      //-----------------------------------------
      // Code checking if user input is positive
      //-----------------------------------------
      else if(numOfStars%2 == 0) {
        //-----------------------------------------
        // Attempt at Code for top of even diamond
        //-----------------------------------------
      for(rows = 2; rows <= numOfStars / 2 + 1; rows += 1) {
        for(int spaces = -2 * rows + (numOfStars + 2); spaces < 0; spaces -= 1) {
          System.out.println(" ");
        }
        for(shapeOfDiamond = 2 * rows - 2; shapeOfDiamond > 0; shapeOfDiamond -= 1) {
          System.out.println(" *");
        }
        System.out.println("");
      }
      System.out.println("");
        //-----------------------------------------
        //Code for bottom of even diamond
        //-----------------------------------------
      for(rows = numOfStars / 2 + 1; rows <= numOfStars/ 2 + 1; rows += 1) {
        for(int spaces = -2 * rows + (numOfStars + 2); spaces < 0; spaces -= 1) {
          System.out.println(" ");
        }
        for(shapeOfDiamond = 2 * rows - 2; shapeOfDiamond > 0; shapeOfDiamond -= 1) {
          System.out.println(" *");
        }
        System.out.println("");
      }
      System.out.println("");
      }
    input.close();
  }
}
