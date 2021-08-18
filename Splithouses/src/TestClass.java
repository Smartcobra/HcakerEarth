import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String input= br.readLine();
        String ans=input.replace(".","B");

        if(ans.contains("HH")){
            System.out.println("NO");
        }else{
            System.out.println("YES");
            System.out.println(ans);
        }
        br.close();
    }
}
