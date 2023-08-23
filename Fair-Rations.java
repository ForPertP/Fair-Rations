import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'fairRations' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY B as parameter.
     */

    public static String fairRations(List<Integer> B) {
    // Write your code here
        int lastID = -1;
        int count = 0;

        for (int i = 0; i < B.size(); ++i) {
            if (B.get(i) % 2 != 0) {
                if (lastID == -1) {
                    lastID = i;
                } else {
                    count += Math.abs(i - lastID) * 2;
                    lastID = -1;
                }
            }
        }

        return (lastID == -1) ? Integer.toString(count) : "NO";
    }

}
////////////
