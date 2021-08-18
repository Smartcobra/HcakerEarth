import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int A[]= new int[size];
        int tmp[]= new int[size];
        int sum1=0;
        int sum2=0;

        for(int i=0;i<size; i++){
            A[i]=sc.nextInt();
            if(i<size/2){
                while(A[i]>=10){
                    A[i]=A[i]/10;
                }
                tmp[i]=A[i];
            }else{
                int l=A[i]%10;
                tmp[i]=l;
            }
        }

        for(int i=0;i<tmp.length;i++){
            if(i%2==0){
                sum1+=tmp[i];
            }else{
                sum2+=tmp[i];
            }
        }
        int diff=sum2-sum1;
            if(diff%11==0){
                System.out.println("OUI");
            }else{
                System.out.println("NON");
        }
    }



}
