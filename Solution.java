import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER x as parameter.
     */

    public static int solve(int x) {
    // Write your code here
    int e2 = 0;
    while(x % 2 == 0){
        e2 ++;
        x /= 2;
        }
        int e5 = 0;
        while(x % 5 == 0){
            e5 ++;
            x /= 5;
        }
        int y = Math.max(e2 - 2,e5);
        int z = 1;
        int rem = 1 % x;
        while(rem != 0){
            z++;
            rem = (rem * 10 + 1) % x;
        }
        return 2 * z + y;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int x = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result.solve(x);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
