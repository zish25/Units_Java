import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter first number: ");
        a=sc.nextInt();
        System.out.print("Enter second number: ");
        b=sc.nextInt();
        System.out.print("Enter third number: ");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("The largest number is: " +a);
        }
        else if(b>a && b>c)
        {
            System.out.println("The largest number is: " +b);
        }
        else if(c>a && c>b)
        {
            System.out.println("The largest number is: " +c);
        }
        else
        {
            System.out.println("All are equal");
        }
    }
}
