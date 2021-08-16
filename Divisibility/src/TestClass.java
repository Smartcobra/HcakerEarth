
import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
       String str=s.nextLine();
        Integer [] numbers=Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);


        if(numbers[numbers.length-1]%10==0){
            System.out.println(numbers[numbers.length-1]);
            System.out.println("Yes");
        }else{
            System.out.println(numbers[numbers.length-1]);
            System.out.println("No");
        }

    }


}