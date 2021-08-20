class Swap
{
public static void main(String args[])     //Please take input Using Command Line Argument
{
int a,b;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
System.out.println("values of a and b before swap is:\n");
System.out.println(+a);
System.out.println("\n"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("values of a and b after swap is:\n");
System.out.println(+a);
System.out.println("\n"+b);

}
}


