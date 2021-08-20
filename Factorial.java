import java.util.Scanner;

class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int  i,fact=1;
int a;
System.out.println("Please enter a number:");
a=sc.nextInt();
for(i=a;i>0;i--)
{
fact=fact*i;
}
System.out.println("Factorial of a given number is:"+fact);

}
}

