package judge;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\IOFiles\\input.txt"));

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            System.out.println(b+c);
        }
    }

}