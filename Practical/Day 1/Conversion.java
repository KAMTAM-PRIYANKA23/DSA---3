import java.util.*;
public class Conversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.print((char)(ch += 32));
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.print((char)(ch -= 32));
            } else {
                System.out.print(ch);
            }
        }
    }
}
