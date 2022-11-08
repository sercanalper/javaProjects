import java.util.Scanner;

public class GradesAverage {
    public static void main(String[] args) {

        int math, science, music, literature, sports;

        try (Scanner gradeinputs = new Scanner(System.in)) {
            System.out.println("Math Grade: ");
            math = gradeinputs.nextInt();

            System.out.println("Science Grade: ");
            science = gradeinputs.nextInt();

            System.out.println("Music Grade: ");
            music = gradeinputs.nextInt();

            System.out.println("Literature Grade: ");
            literature = gradeinputs.nextInt();

            System.out.println("Sports Grade: ");
            sports = gradeinputs.nextInt();
        }

        int total = math + science + music + literature + sports;
        double takeaverage = total / 6;
        System.out.println("Your average is: " + takeaverage);
        
        String result;
        result = (takeaverage > 60) ? "You've passed !" : "You should take some classes.";
        System.out.println(result);
    }
}
