import java.util.*;

public class MaxMinSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
//        int n = 5;
//        int[] a = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;

            if (num < min)
                min = num;

            if (num > max)
                max = num;
        }

//        Arrays.sort(a);
//        for(int i=0;i<n-1;i++){
//            minSum+=a[i];
//        }
//        for(int i=n-1;i>0;i--){
//            maxSum+=a[i];
//        }

        System.out.println("Minimum sum of the array elements: " + (sum - max));
        System.out.println("Maximum sum of the array elements: " + (sum - min));
    }
}