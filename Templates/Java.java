// source -> https://www.geeksforgeeks.org/setting-up-java-competitive-programming-environment/
// You have to create "output" and "input" file manually

import java.io.*;
import java.util.Scanner;

class Java {
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);

        // comment out this block, if you are running on codeblocks-style 
        if (System.getProperty("ONLINE_JUDGE") == null) {
            try {
                System.setOut(new PrintStream(
                    new FileOutputStream("output.txt")));
                read = new Scanner(new File("input.txt"));
            }
            catch (Exception e) {}
        }
  
        // Your Code Start Here
  
        // Read input
        String inp = read.nextLine();
  
        // Print output
        System.out.println(inp);
    }
}