import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int countZ = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z') {
                countZ++;
            }
        }
        if ((str.substring(countZ).length()) == (countZ * 2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}
