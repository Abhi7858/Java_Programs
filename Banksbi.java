import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Console;
 
class Banksbi
{
public float balance;
public void withdraw(Banksbi A)
{
int withdraw;
System.out.println("please enter amount tobe withdraw:-");
Scanner sc=new Scanner(System.in);
withdraw=sc.nextInt();
if(withdraw < A.balance && withdraw>0)
{
A.balance=A.balance-withdraw;
System.out.println("withdraw successfull\n");
System.out.println("Account balance:"+A.balance);
}
else
{
System.out.println("invalid amount");
}
}
public void deposit(Banksbi A)
{
int deposit;
System.out.println("please enter amount:-");
Scanner sc=new Scanner(System.in);
deposit=sc.nextInt();
A.balance=A.balance+deposit;
System.out.println("deposit successfull\n");
System.out.println("Account balance:"+A.balance);
}


public static void main(String args[]) throws IOException
{
int choice;
Banksbi A=new Banksbi();
Scanner sc=new Scanner(System.in);
System.out.println("please enter your name:-");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String sname=br.readLine();
         Console C=System.console();
System.out.println("please enter password:-");
char[] a=C.readPassword();
System.out.println("please enter balance:-");
A.balance=sc.nextInt();

do{
System.out.println("please enter a choice:-");
System.out.println("1.bank balance:");
System.out.println("2.withdraw:");
System.out.println("3.deposit:");
System.out.println("4.exit");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("bank balance is:"+A.balance);
break;
case 2:
A.withdraw(A);
break;
case 3:
A.deposit(A);
break;
}

}while(choice!=4);
}
}