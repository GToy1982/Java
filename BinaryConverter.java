public class BinaryConverter {
    public static void main(String[] args) {
        String binaryString = "1010101"; // Replace with your binary string
        try {
            int decimalValue = bin2Dec(binaryString);
            System.out.println("Decimal value: " + decimalValue);
        } catch (BinaryFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        // Check if the string contains only 0s and 1s
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                throw new BinaryFormatException("Invalid binary string: " + binaryString);
            }
        }

        // Convert binary string to decimal
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            char binaryDigit = binaryString.charAt(i);
            int power = binaryString.length() - i - 1;
            if (binaryDigit == '1') {
                decimalValue += Math.pow(2, power);
            }
        }

        return decimalValue;
    }
}
