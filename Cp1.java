
import java.util.Scanner;
        import java.util.*;
        import java.math.*;
public class Cp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter size of 1st list");
        int n=in.nextInt();
        ArrayList<Integer> list1=new ArrayList<>();

        System.out.println("Enter Element");
        for(int i=0;i<n;i++){
            int temp=in.nextInt();
            list1.add(temp);
        }

        System.out.println("Enter size of 2nd list");
        int n1=in.nextInt();
        ArrayList<Integer> list2=new ArrayList<>();

        System.out.println("Enter Element");
        for(int i=0;i<n1;i++){
            int temp=in.nextInt();
            list2.add(temp);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n1;i++) {
            ans.add(list1.get(i));
        }
        for(int i=0;i<n;i++) {
            ans.add(list2.get(i));
        }
        Collections.sort(ans);
        System.out.println(ans);

    }
}
