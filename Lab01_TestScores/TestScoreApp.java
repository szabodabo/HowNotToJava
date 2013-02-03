import java.util.Scanner;
import java.util.ArrayList;

public class TestScoreApp
{
    public static void main(String[] args)
    {
        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        
        int testScore = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<Double>();

        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            // accumulate score count and score total
            if (testScore > 100)
            {
               System.err.println("Invalid entry... not counted, brah");
            } else {
                //Add to array
                scores.add((double)testScore);
            }
        }
        
        double[] scoreArray = new double[scores.size()];
        for (int i = 0; i < scoreArray.length; i++) {
            scoreArray[i] = scores.get(i);
        }
        
        TestScoreUtil.printStats(scoreArray);
    }
}