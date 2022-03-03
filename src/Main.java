public class Main {
    public static void main(String[] args) {
        String fname = "Danielle";
        String nickname = "Dae";
        int age = 30;
        String movie = "Lord of the Rings - Extended Edition";
        int runtime = 228 + 235 + 252;
        String convert = String.format("%.2f",(runtime / 60.0)); /* Thank you Google */
        String firstborn = "Chihuahua";
        String theaccident = "Shih Tzu";
        System.out.println("Hello my name is " + fname + "!");
        System.out.println("You can call me " + nickname + ".");
        System.out.println("I am " + age + " years young.");
        System.out.println("My perfect day would be watching " + movie + ".");
        System.out.println("It's total runtime is " + runtime + " minutes or " + convert + " hours.");
        System.out.println("And since we're talking about pets, I have a " + firstborn + " and a " + theaccident + ".");

        String thanks = "Thank you,";
        String name = "miguel";
        String order = "Your order number is #";
        int previousOrder = 715;

        System.out.println(thanks + " " + name.toUpperCase() + "!");
        System.out.println(order + (++previousOrder));
    }
}
