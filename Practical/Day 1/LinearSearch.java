import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        boolean found = false;
        for(int i=0;i<n;i++){
            if(target==p[i]){
                found = true;
            } else{
                found = false;
            }
        }
        if(found){
            System.out.println("Found");
        } else{
            System.out.println("Given element is not in the array");
        }
    }
}
