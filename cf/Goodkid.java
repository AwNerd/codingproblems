import java.util.*;

public class Goodkid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        for (int i = 0; i < testcases; i++) {
            int nums = sc.nextInt();
            int[] numArray = new int[nums];
            
            boolean zeroFound = false;
            boolean oneFound = false;
            int smallest = 10;
            
            long prod = 1;  
            for (int j = 0; j < nums; j++) {
                numArray[j] = sc.nextInt();
                if (numArray[j] == 0 && !zeroFound) {
                    zeroFound = true;
                    numArray[j] = 1;
                }
                if (numArray[j] == 1) oneFound = true;
                if (numArray[j] < smallest) smallest = numArray[j];
                prod *= numArray[j];
            }

            if (zeroFound) {
                System.out.println(prod);
                continue;
            }
            if (oneFound) {
                System.out.println(prod * 2);
                continue;
            }
            System.out.println(prod / smallest * (smallest + 1));
        }
    }
}
