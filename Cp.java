import java.util.Scanner;
import java.util.*;
import java.math.*;
public class Cp {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the value of n ");
        int n=in.nextInt();
        BigInteger fact=new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            String s= Integer.toString(i);
            BigInteger temp=new BigInteger(s);
            fact=fact.multiply(temp);

        }
        System.out.println("Factorial=" + fact);


    }
}
