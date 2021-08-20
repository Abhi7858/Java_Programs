import java.util.Scanner;

class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,count=0;
int a;
System.out.println("Please enter a number:");
a=sc.nextInt();
for(i=1;i<=a;i++)
{
if(a%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("given number is prime number");

}
else
{
System.out.println("given number is not a prime number");
}
}
}

