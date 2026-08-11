import java.util.*;
public class PrintSmallestLargestInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        int largestNumber = p[0];
        int smallestNumber = p[0];
        for(int i=0;i<n;i++){
            if(p[i]>largestNumber){
                largestNumber = p[i];
            }
            else if(p[i]<smallestNumber){
                smallestNumber = p[i];
            }
        }
        System.out.println("Largest number in the given array is: "+largestNumber);
        System.out.println("Smallest number in the given array is: "+smallestNumber);
    }
}
