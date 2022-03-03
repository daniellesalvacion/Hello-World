import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        Scanner wallWidth = new Scanner(System.in);
        Scanner wallHeight = new Scanner(System.in);

        System.out.println("Enter wall width (in feet)");
        String theWallWidth = wallWidth.nextLine();
        System.out.println("Enter wall height (in feet)");
        String theWallHeight = wallHeight.nextLine();
        double WallArea = (Integer.parseInt(theWallHeight) * Integer.parseInt(theWallWidth));
        System.out.println("Your wall is " + theWallHeight + "ft tall and " + theWallWidth + "ft wide. With a total area of " + WallArea + " square feet.");
        System.out.println("One gallon of paint can cover 350 square feet.");
        double PaintNeeded = WallArea / 350;
        System.out.println("You will need " + String.format("%.2f", PaintNeeded) + " gallon/s of paint.");
    }
}
