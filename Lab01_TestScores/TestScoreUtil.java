/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dakota
 */
public class TestScoreUtil {
    /** Compute/print statistics for a double array of test scores */
    public static void printStats(double[] d) {
        if (d == null || d.length == 0) {
            throw new IllegalArgumentException("DERP... NO DATA!");
        }
        
        System.out.print("Got array elts:");
        double sum = 0.0;
        for (double elt : d) {
            System.out.print(" " + elt);
            sum += elt;
        }
        System.out.println();
        double avg = sum / (double) d.length;
        System.out.println("Number of Scores: " + d.length);
        System.out.println("Average score: " + avg);
    }
}
