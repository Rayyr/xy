 
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import static java.lang.System.*;

public class cp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int test = Integer.parseInt(in.nextLine());
         

        String x = "314159265358979323846264338327";
        // System.out.print(x);
        while (test != 0) {
            String y;
            y = in.nextLine();
            
            int r = 0;
            int i=0;
            for (Character xx : y.toCharArray()) {
                if (xx == x.charAt(i++))
                    r++;
                else 
                break;
            }
            System.out.println(r);
            test--;
        }

    }

}
