import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d %n", s1, x);
            }
            System.out.println("================================");

    }
}

/**
- `"%-15s%03d %n"`: This is the format string used by `printf` to specify how the output should be formatted.
  - `%-15s`: This indicates a left-justified string (`s`) with a minimum width of 15 characters. If the string is less than 15 characters, it will be padded with spaces on the right.
  - `%03d`: This indicates an integer (`d`) formatted with leading zeros to make it at least 3 characters wide.
  - `%n`: This is a platform-independent line separator.
 */