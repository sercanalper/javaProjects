import java.util.Scanner;

public class GradesAverageEnhanced {
    public static void main(String[] args) {

            int math, science, music, literature, sports;

            try (Scanner gradeinputs = new Scanner(System.in)) {
                System.out.println("Math Grade: ");
                math = gradeinputs.nextInt();

                if (!(math >= 0 && math <= 100)){
                    System.out.println("Grade should be in range of 0 and 100, inclusively.");
                    math = gradeinputs.nextInt();
                }

                System.out.println("Science Grade: ");
                science = gradeinputs.nextInt();

                if (!(science >= 0 && science <= 100)){
                    System.out.println("Grade should be in range of 0 and 100, inclusively.");
                    science = gradeinputs.nextInt();
                }

                System.out.println("Music Grade: ");
                music = gradeinputs.nextInt();

                if (!(music >= 0 && music <= 100)){
                    System.out.println("Grade should be in range of 0 and 100, inclusively.");
                    music = gradeinputs.nextInt();
                }

                System.out.println("Literature Grade: ");
                literature = gradeinputs.nextInt();

                if (!(literature >= 0 && literature <= 100)){
                    System.out.println("Grade should be in range of 0 and 100, inclusively.");
                    literature = gradeinputs.nextInt();
                }

                System.out.println("Sports Grade: ");
                sports = gradeinputs.nextInt();

                if (!(sports >= 0 && sports <= 100)){
                    System.out.println("Grade should be in range of 0 and 100, inclusively.");
                    sports = gradeinputs.nextInt();
                }
            }

            int total = math + science + music + literature + sports;
            double takeaverage = total / 6;
            System.out.println("Your average is: " + takeaverage);

            String result;
            result = (takeaverage > 60) ? "You've passed !" : "You should take some classes.";
            System.out.println(result);
        }
    }

