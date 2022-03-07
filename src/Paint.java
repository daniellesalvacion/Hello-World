import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        Scanner wallWidth = new Scanner(System.in);
        Scanner wallHeight = new Scanner(System.in);
        Scanner useCalc = new Scanner(System.in);
        Scanner measureUnit = new Scanner(System.in);
        int userAnswer = 0;
        int PaintCoverageft[] = {400, 200, 100, 50, 25};
        int PaintCoveragem[] = {400, 200, 100, 50, 25};

        System.out.println("==================================================================================================================");

        String userInput;
        do {

            System.out.println();
            System.out.println("Do you want to try my paint calculator? (Y/N)");
            userInput = useCalc.nextLine();
            ;
            //System.out.println(userInput);

            if (userInput.equals("y")) {

                System.out.println("What unit of measurement do you want to use? (ft/m)");
                String userMeasure = measureUnit.nextLine();

                if (userMeasure.equals("m")) {
                    userAnswer = 2;
                } else if (userMeasure.equals("ft")) {
                    userAnswer = 1;
                } else {
                    System.out.println("Please follow instructions.");
                }


                switch (userAnswer) {
                    case 1:
                        System.out.println("Enter wall width (in feet)");
                        String theWallWidthft = wallWidth.nextLine();

                        System.out.println("Enter wall height (in feet)");
                        String theWallHeightft = wallHeight.nextLine();

                        double WallAreaft = (Integer.parseInt(theWallHeightft) * Integer.parseInt(theWallWidthft));
                        System.out.println("Your wall is " + theWallHeightft + "ft tall and " + theWallWidthft + "ft wide, with a total area of " + WallAreaft + " square feet.");

                        double PaintNeededft;

                        if (WallAreaft > PaintCoverageft[0]) {
                            PaintNeededft = WallAreaft / PaintCoverageft[0];
                            System.out.println("You will need " + String.format("%.2f", PaintNeededft) + " gallon/s of paint.");
                            System.out.println();
                        } else if (WallAreaft > PaintCoverageft[1]) {
                            PaintNeededft = WallAreaft / PaintCoverageft[1];
                            System.out.println("You will need " + String.format("%.2f", PaintNeededft) + " half gallon/s paint.");
                            System.out.println();
                        } else if (WallAreaft > PaintCoverageft[2]) {
                            PaintNeededft = WallAreaft / PaintCoverageft[2];
                            System.out.println("You will need " + String.format("%.2f", PaintNeededft) + " quart/s paint.");
                            System.out.println();
                        } else if (WallAreaft >= PaintCoverageft[3]) {
                            PaintNeededft = WallAreaft / PaintCoverageft[3];
                            System.out.println("You will need " + String.format("%.2f", PaintNeededft) + " pint/s of paint.");
                            System.out.println();
                        } else {
                            PaintNeededft = WallAreaft / PaintCoverageft[4];
                            System.out.println("You will need " + String.format("%.2f", PaintNeededft) + " half pint/s of paint.");
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("Enter wall width (in meters)");
                        String theWallWidthm = wallWidth.nextLine();

                        System.out.println("Enter wall height (in meters)");
                        String theWallHeightm = wallHeight.nextLine();

                        double WallAream = (Integer.parseInt(theWallHeightm) * Integer.parseInt(theWallWidthm));
                        System.out.println("Your wall is " + theWallHeightm + "m tall and " + theWallWidthm + "m wide, with a total area of " + WallAream + " square meters.");

                        double PaintNeededm;

                        if (WallAream > PaintCoveragem[0]) {
                            PaintNeededm = WallAream / PaintCoveragem[0];
                            System.out.println("You will need " + String.format("%.2f", PaintNeededm) + " gallon/s of paint.");
                            System.out.println();
                        } else if (WallAream > PaintCoveragem[1]) {
                            PaintNeededm = WallAream / PaintCoveragem[1];
                            System.out.println("You will need " + String.format("%.2f", PaintNeededm) + " half gallon/s paint.");
                            System.out.println();
                        } else if (WallAream > PaintCoveragem[2]) {
                            PaintNeededm = WallAream / PaintCoveragem[2];
                            System.out.println("You will need " + String.format("%.2f", PaintNeededm) + " quart/s paint.");
                            System.out.println();
                        } else if (WallAream >= PaintCoveragem[3]) {
                            PaintNeededm = WallAream / PaintCoveragem[3];
                            System.out.println("You will need " + String.format("%.2f", PaintNeededm) + " pint/s of paint.");
                            System.out.println();
                        } else {
                            PaintNeededm = WallAream / PaintCoveragem[4];
                            System.out.println("You will need " + String.format("%.2f", PaintNeededm) + " half pint/s of paint.");
                            System.out.println();
                        }
                        break;
                }

            } else if (userInput.equals("n")) {
                System.out.println("Too bad.");
                System.out.println();
                System.out.println("==================================================================================================================");
                break;
            } else {
                System.out.println("Please follow instructions.");
            }
            System.out.println("==================================================================================================================");

        } while (userAnswer != 2) ;
    }
}
