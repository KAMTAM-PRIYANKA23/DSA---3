import java.util.*;
public class SumOfAllDigitsInAnNumber {
    public static int IndividualDigitsSum(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }
        return sum;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            while(n>=10){
              n =  IndividualDigitsSum(n);
            }
            System.out.println(n);
        }
    }