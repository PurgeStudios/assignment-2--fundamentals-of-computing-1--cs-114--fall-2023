import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    //---------------------------------------------------
    // Assigning User's Input to number of Stars
    //---------------------------------------------------

    System.out.println("Please Enter a Number:");
    Scanner input = new Scanner(System.in);
    int stars = input.nextInt();

    //---------------------------------------------------
    // Code for Row and Colomn of Stars
    //---------------------------------------------------

    for(int r = 0; r < stars; ++r) {
      for(int c = 0; c < stars; ++c)
        System.out.print("*");

    System.out.println();
    input.close();
    }
  }
}
