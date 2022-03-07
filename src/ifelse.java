public class ifelse {
    public static void main(String[] args) {
        int x = 50;
        int y = 10;

        if (x > y) {
            System.out.println("Greater");
        }

        x = 50;
        y = 50;
        if (x == y) {
            System.out.println("1");
        } else if (x > y) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        x = 57;
        y = 50;
        if (x == y) {
            System.out.println("1");
        } else if (x > y) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        x = 5;
        y = 50;
        if (x == y) {
            System.out.println("1");
        } else if (x > y) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}