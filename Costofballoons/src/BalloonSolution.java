
import java.util.Arrays;
import java.util.Scanner;

public class BalloonSolution {

    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        int n_test=sc.nextInt();
        for(int i=0;i<n_test;i++){
            int g=sc.nextInt();
            int p=sc.nextInt();

            int n_participant=sc.nextInt();
            int sum1=0;
            int sum2=0;

            for(int j=0;j<n_participant;j++){
                int a1=sc.nextInt(); //ith col
                int a2=sc.nextInt(); //jth col

                sum1=sum1+((a1*g)+(a2*p));
                sum2=sum2+((a1*p)+(a2*g));
            }
            System.out.println(Math.min(sum1,sum2));

        }

    }
}
