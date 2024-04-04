/*
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
It's time to test your knowledge of Static initialization blocks. You can read about it here.
You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input.

If B<=0 or H<=0 , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int B = sc.nextInt();
    int H = sc.nextInt();
    if(B<=0 || H<=0){
        System.out.print("java.lang.Exception: Breadth and height must be positive");
    }
    else{
        int area = H*B;
        System.out.print(area);
    }
    sc.close();
    }
}