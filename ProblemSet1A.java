import java.io.IOException;

public class ProblemSet1A {

    //initialization here
    public static void main(String[] args) throws IOException {
        //code here
        Quadratic();
        Slope();
        Midpoint();
        SumOfArithmetic();
        SumOfGeometric();

    }

    static void Quadratic() throws IOException {
        double a = 1, b = 5, c = 6;
        double rootOne = ((b * -1) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double rootTwo = ((b * -1) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println("The solution for 1x^2 + 5x + 6 are " + rootOne + " and " + rootTwo);
    }

    static void Slope() throws IOException {
        double x1 = 0, y1 = 0, x2 = 2, y2 = 3;
        double rise = y2 - y1;
        double run = x2 - x1;
        double slope = rise / run;
        System.out.println("The line connecting the points (0, 0) and (2, 3) has a slop of " + slope);
    }

    static void Midpoint() throws IOException {
        double x1 = 0, y1 = 0, x2 = 2, y2 = 3;
        double avgX = (x2 + x1) / 2;
        double avgY = (y2 + y1) / 2;
        System.out.println("The midpoint between (0, 0) and (2, 3) is " + "(" + avgX + ", " + avgY + ")");
    }

    static void SumOfArithmetic() throws IOException{
        double term1,lastTerm,difference;
        term1 = 1;
        difference = 1;
        lastTerm = term1 + difference*4;

        double sum = (term1+lastTerm)*(5.0/2.0);
        System.out.println("The sum of the first 5 terms of an arithmetic series that start with 1.0 and increases by 1.0 is "+sum);

    }

    static void SumOfGeometric() throws IOException{
        double term1,difference;
        int numOfTerms;
        term1 = 1;
        difference = 2;
        numOfTerms = 3;
        double sum = term1*((1.0 - Math.pow(difference,numOfTerms))/(1.0 - difference));
        System.out.println("The sum of the first 3 terms of an arithmetic series that start with 1.0 and increases by 2.0 is "+sum);
    }


}
