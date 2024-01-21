public class LengthConverter {

    /** Convert from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert from meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // Display header
        System.out.printf("%-10s%-10s | %-10s%-10s\n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("-----------------------------------------");

        // Display conversion table
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5.0) {
            System.out.printf("%-10.1f%-10.3f | %-10.1f%-10.3f\n",
                    feet, footToMeter(feet), meters, meterToFoot(meters));
        }
    }
}
