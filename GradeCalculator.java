
import java.io.*;

public class GradeCalculator {

    public static void main(String args[]) throws IOException
    {
        String gradeInput, amountOfGrades;
        float average, grades, gradeAmount, total;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("How many grades do you need to average? ");
            amountOfGrades = in.readLine();
            gradeAmount = Float.parseFloat(amountOfGrades);
            total = 0;

            if (gradeAmount >= 10) {
                for (int i = 1; i <= gradeAmount; i++) {
                    System.out.print(" Enter grade: ");
                    gradeInput = in.readLine();
                    grades = Float.parseFloat(gradeInput);

                    System.out.print(" The grade you entered is: " + grades);

                    total = total + grades;
                }

            System.out.print(" The total of the grades entered is: " + total); 
            
            average = total / gradeAmount;

            System.out.println(" The average of the grades is: " + average);
            }
            else {
                System.out.print(" Error: Minimum grade input amount is 10. Please try again ");
             } 
        

    }
}

