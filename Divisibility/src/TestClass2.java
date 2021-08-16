import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TestClass2 {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\HcakerEarth\\Divisibility\\testcase1.txt";
        //File file = new File("/HcakerEarth/Divisibility/testcase1.txt");
        Scanner s = new Scanner(new File(path));
        int N = Integer.parseInt(s.nextLine());
        Integer[] numbers = new Integer[N];
        while (s.hasNextLine()) {
            // N= s.nextLine();
            numbers = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);

        }

        System.out.println(numbers);
        Arrays.stream(numbers).forEach(System.out::println);


//        String N= s.nextLine();
//        Integer[] numbers = Arrays.stream(s.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        if (numbers[numbers.length - 1] % 10 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
