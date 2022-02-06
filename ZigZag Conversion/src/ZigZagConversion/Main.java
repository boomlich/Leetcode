package ZigZagConversion;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String testA = convert("PAYPALISHIRING", 3);
        System.out.println(testA);

    }


    public static String convert(String s, int numRows) {

        HashMap<Integer, String> rows = new HashMap<>();
        String result = "";
        char[] letters = s.toCharArray();

        if (numRows == 1) {
            return s;
        }

        numRows --;

        for (int i = 0; i < letters.length; i++) {

            int row = Math.abs(((i + numRows) % (numRows * 2)) - numRows);

            if (rows.get(row) == null) {
                rows.put(row, String.valueOf(letters[i]));
            } else {
                rows.put(row, rows.get(row) + letters[i]);
            }

        }

        for (int i = 0; i < rows.size(); i++) {
            result += rows.get(i);
        }

        return result;
    }
}
