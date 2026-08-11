import java.util.*;

public class StringRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            // Print current rotation
            for (int j = 0; j < ch.length; j++) {
                System.out.print(ch[j]);
            }
            System.out.println();

            // Left rotate by one position
            char temp = ch[0];
            for (int j = 0; j < ch.length - 1; j++) {
                ch[j] = ch[j + 1];
            }
            ch[ch.length - 1] = temp;
        }
    }
}