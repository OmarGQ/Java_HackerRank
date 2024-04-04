//The challenge here is to read n lines of input until you reach EOF, then number and print all  lines of content.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;
        while(sc.hasNext()){
            System.out.println(lineNumber + " " + sc.nextLine());
            lineNumber ++;
        }
        sc.close();
    }
}