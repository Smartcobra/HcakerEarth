import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestClass {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine().trim());
        String [] str= br.readLine().split(" ");
        int [] A= new int[N];

        for(int i=0;i<str.length;i++){
            A[i]=Integer.parseInt(str[i]);
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<A.length/2;i++){
            int digits=(int)Math.log10(A[i]);
            int first_d= (int)(A[i]/(int)(Math.pow(10,digits)));
            sb.append(first_d);
        }

        for(int i=A.length/2;i<A.length;i++){
            int last_d= A[i]%10;
            sb.append(last_d);
        }

        System.out.println(sb);
        int divisible11 =Integer.parseInt(sb.toString());

        if(divisible11%11==0){
            System.out.println("OUI");
        }else{
            System.out.println("NON");
        }
    }
}
