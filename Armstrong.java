import java.util.Scanner;

class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count=0,i,mul=1,result=0,m,n,a,rem1;
System.out.println("Please enter a number:");
n=sc.nextInt();
m=n;
while(m>0)
{
m=m/10;
count++;
}
a=count;
m=n;
while(m>0)
{
rem1=m%10;
a=count;
mul=1;
while(a>0)
{
mul=mul*rem1;
a--;
}
result=result+mul;
m=m/10;
}
if(result==n)
{
System.out.println("given no is armstrong number");
}
else
{
System.out.println("given no is not armstrong number");
}
}
}