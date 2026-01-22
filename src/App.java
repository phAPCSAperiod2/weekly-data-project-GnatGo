import java.util.Scanner;

/**
 * Instructions:
 * - Complete the WeeklyData.java class first.
 * - Use this App class to collect user input and test your WeeklyData methods.
 * - Follow all TODOs carefully.
 * - Do NOT hard-code values — use loops and method calls.
 * 
 * - This program was written with the help of copilot AI.
 */
public class App {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        Scanner input = new Scanner(System.in);

        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        //         Ask the user about their goals (if applicable)
        // -------------------------------------------------------------
        System.out.println("This program tracks your weekly drawing data.");
        System.out.println("How many hours of drawing do you aim for each week?");
        double goal = input.nextDouble();

        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of data
        //         Use an appropriate data type (int or double)
        //         Name the array weekData
        // -------------------------------------------------------------
        double[] weekData = new double[7];


        // -------------------------------------------------------------
        // TODO 4: Use a for loop to collect data for each day of the week
        //         Prompt example:
        //         "Enter <data type> for day X: "
        //
        //         Include input validation:
        //         - Use a while loop to prevent negative values
        //         - Re-prompt if the value is invalid
        // -------------------------------------------------------------
        for (int i = 0; i < weekData.length; i++) {
            System.out.print("Enter the hours you drew on day " + (i + 1) + ": ");
            double dailyData = input.nextDouble();
            while (dailyData < 0) {
                System.out.print("Invalid input. Please enter a non-negative value for day " + (i + 1) + ": ");
                dailyData = input.nextDouble();
            }
            weekData[i] = dailyData;
        }


        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        //         Pass the weekData array into the constructor
        // -------------------------------------------------------------
        WeeklyData drawingWeek = new WeeklyData(weekData);


        // -------------------------------------------------------------
        // TODO 6: Display the results of the analysis
        //         Call methods from WeeklyData to display:
        //         - Total
        //         - Average
        //         - Minimum
        //         - Maximum
        //
        //         Use clear labels and formatted output if needed
        // -------------------------------------------------------------
        System.out.println();
        System.out.println("Total drawing hours this week: " + drawingWeek.getTotal());
        System.out.println("Average drawing hours per day: " + drawingWeek.getAverage());
        System.out.println("Minimum drawing hours in a day: " + drawingWeek.getMin());
        System.out.println("Maximum drawing hours in a day: " + drawingWeek.getMax());


        // -------------------------------------------------------------
        // TODO 7: Display the full week of data
        //         Use the toString() method from WeeklyData
        // -------------------------------------------------------------
        System.out.println("Your drawing data for the week: \n" + drawingWeek.toString());


        // -------------------------------------------------------------
        // TODO 8: Give the user insights about their week
        //         --> "You need to drink more water next week!"
        //         --> "You were very hydrated this week!"
        //         --> etc.
        // -------------------------------------------------------------
        if (drawingWeek.getTotal() >= goal){
            System.out.println("Great job! You met your drawing goals this week!");
            System.out.println("Keep up the good work!" );
        } 
        
        else {
            System.out.println("Keep pushing! You can reach your drawing goals next week!");
            System.out.println("Maybe try to draw for at least " + (goal / 7) + " hours each day to meet your weekly goal of " + goal + " hours." );
        }


    }
}
