/**
 * The WeeklyData class stores and analyzes a week’s worth of numeric data.
 * This could represent steps taken, hours of sleep, money spent, screen time,
 * or any other measurable daily value.
 */
public class WeeklyData {

    // -------------------------------------------------------------
    // Instance Variables
    // -------------------------------------------------------------
    // TODO: Declare a private array to store the week’s data
    //       Choose an appropriate type (double[] or int[])
    //       Create other instance variables as necessary
    private double[] drawingData = new double[7];
    


    // -------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------
    /**
     * Constructs a WeeklyData object by taking in an array of values
     * and making a deep copy (element-by-element) into the internal array.
     *
     * @param input an array representing 7 days of data
     */
    public WeeklyData(double[] input) {
        double [] drawingData2 = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            drawingData2[i] = input[i];
        }
        this.drawingData = drawingData2;
        // TODO: (Optional) Check if input is null and handle appropriately
        // TODO: Create a new array with the same length as input
        // TODO: Copy each value from input into the internal data array
        // NOTE: Do NOT do this.data = input; (that would create aliasing)
    }


    // -------------------------------------------------------------
    // getTotal
    // -------------------------------------------------------------
    /**
     * Calculates and returns the total of all values in the week.
     *
     * @return the sum of all values in the data array
     */
    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < drawingData.length; i++) {
            total += drawingData[i];
        }
        // TODO: Create a variable to store the running total
        // TODO: Use a loop to add each value in the array to the total
        // TODO: Return the total
        return total; // replace with your calculated total
    }


    // -------------------------------------------------------------
    // getAverage
    // -------------------------------------------------------------
    /**
     * Calculates and returns the average value for the week.
     *
     * @return the average of the values in the array,
     *         or 0.0 if the array is empty
     */
    public double getAverage() {
        double average = 0.0;
        if (drawingData.length == 0) {
            return 0.0;
        } 
        
        else {
            average = getTotal() / drawingData.length;
            return average;
        }
        // TODO: If the array length is 0, return 0.0
        // TODO: Otherwise, divide the total by the number of elements
        // Hint: You may call getTotal()
        
    }


    // -------------------------------------------------------------
    // getMax
    // -------------------------------------------------------------
    /**
     * Finds and returns the highest value in the data array.
     *
     * @return the maximum value
     */
    public double getMax() {
        double max = drawingData[0];
        for (int i = 1; i < drawingData.length; i++) {
            if (drawingData[i] > max){
                max = drawingData[i];
            }
        }
        // TODO: Assume the first value is the current maximum
        // TODO: Loop through the rest of the array and update max as needed
        // TODO: Return the maximum value found
        return max; // replace with the maximum value
    }


    // -------------------------------------------------------------
    // getMin
    // -------------------------------------------------------------
    /**
     * Finds and returns the lowest value in the data array.
     *
     * @return the minimum value
     */
    public double getMin() {
        double min = drawingData[0];
        for (int i = 1; i < drawingData.length; i++) {   
            if (drawingData[i] < min){
                min = drawingData[i];
            }
        }
        // TODO: Assume the first value is the current minimum
        // TODO: Loop through the rest of the array and update min as needed
        // TODO: Return the minimum value found
        return min; // replace with the minimum value
    }


    // -------------------------------------------------------------
    // toString
    // -------------------------------------------------------------
    /**
     * Returns a formatted, multi-line String showing each day’s data.
     *
     * Example:
     * Day 1: 4500
     * Day 2: 6200
     * Day 3: 5100
     *
     * @return a formatted String representing the week’s data
     */
    @Override
    public String toString() {
        // TODO: Create a StringBuilder
        // TODO: Loop through the data array
        // TODO: Append each value with a day label (Day 1, Day 2, etc.)
        // TODO: Return the completed String
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < drawingData.length; i++) {
            sb.append("Day ").append(i + 1).append(": ").append(drawingData[i]).append("\n");
        }
        return sb.toString(); // replace with your formatted output
    }
}
