/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dakota
 */
public class TestScoreApp2 {
    public static void main(String[] args) {
        double d[] = new double[] { 100.0, 90, 85 };
        try {
            TestScoreUtil.printStats(d);
        } catch (IllegalArgumentException iae) {
            System.err.println(iae.toString());
        }
    }
}
