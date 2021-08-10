import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaximumBorders {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String s[] = input.split(" ");
        int M = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);
        int table[][] = new int [M][N];

        for(int i=0;i<M;i++){
            String st=br.readLine();
            for(int j=0;j<N;j++){
                if(st.charAt(j)=='#'){
                    table[i][j]=1;

                }
            }
        }


        System.out.println(Arrays.deepToString(table));



    }
}
