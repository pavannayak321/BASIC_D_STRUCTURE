import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the equalStacks function below.
     */
    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        /*
         * Write your code here.
         */
         int[] n1_rev  = new int[h1.length];
         int[] n2_rev  = new int[h2.length];
         int[] n3_rev  = new int[h3.length];
    int tmp1 = n1_rev.length-1;
    int tmp2 = n2_rev.length-1;
    int tmp3 = n3_rev.length-1;
    //reversing first Strign

     //putting into the stack
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    Stack<Integer> stack3 = new Stack<Integer>();



    for(int i1=0;i1<n1_rev.length;i1++)
    {
        n1_rev[i1]=h1[tmp1];
        tmp1= tmp1-1;
    }

    for(int i11=0;i11<n1_rev.length;i11++)
    {
    stack1.push(n1_rev[i11]);
        
    }

    //reversing second
    for(int i2=0;i2<n2_rev.length;i2++)
    {
        n2_rev[0]=h2[tmp2];
        tmp2= tmp2-1;
    }

    for(int i12=0;i12<n2_rev.length;i12++)
    {
    stack2.push(n2_rev[i12]);
        
    }
    //reversing third
    for(int i3=0;i3<n3_rev.length;i3++)
    {
        n3_rev[0]=h3[tmp3];
        tmp3= tmp3-1;
    }

    for(int i13=0;i13<n3_rev.length;i13++)
    {
    stack3.push(n1_rev[i13]);
        
    }
    //Finding sum for Stack1
    int sum1=0;
    Iterator itr1 = stack1.iterator();

    int sum2=0;
    Iterator itr2 = stack2.iterator();

    int sum3=0;
    Iterator itr3 =stack3.iterator();

    while(itr1.hasNext())
    {
        sum1=sum1+(int)itr1.next();
    }
    while(itr2.hasNext())
    {
        sum2=sum2+(int)itr2.next();
    }
    while(itr3.hasNext())
    {
        sum3=sum3+(int)itr3.next();
    }

    System.out.println(sum1+"  "+sum2+"   "+sum3);

   




    return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] n1N2N3 = scanner.nextLine().split(" ");

        int n1 = Integer.parseInt(n1N2N3[0].trim());

        int n2 = Integer.parseInt(n1N2N3[1].trim());

        int n3 = Integer.parseInt(n1N2N3[2].trim());

        int[] h1 = new int[n1];

        String[] h1Items = scanner.nextLine().split(" ");

        for (int h1Itr = 0; h1Itr < n1; h1Itr++) {
            int h1Item = Integer.parseInt(h1Items[h1Itr].trim());
            h1[h1Itr] = h1Item;
        }

        int[] h2 = new int[n2];

        String[] h2Items = scanner.nextLine().split(" ");

        for (int h2Itr = 0; h2Itr < n2; h2Itr++) {
            int h2Item = Integer.parseInt(h2Items[h2Itr].trim());
            h2[h2Itr] = h2Item;
        }

        int[] h3 = new int[n3];

        String[] h3Items = scanner.nextLine().split(" ");

        for (int h3Itr = 0; h3Itr < n3; h3Itr++) {
            int h3Item = Integer.parseInt(h3Items[h3Itr].trim());
            h3[h3Itr] = h3Item;
        }

        int result = equalStacks(h1, h2, h3);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
