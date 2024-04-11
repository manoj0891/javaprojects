import java.util.Scanner;
class Oddnumber
{
  public static void main(String args[])
  {
    Scanner x=new Scanner(System.in);
     System.out.print("enter the lower limit:");
   int a=x.nextInt();
   Scanner y=new Scanner(System.in);
     System.out.print("enter the upper limit:");
   int b=y.nextInt();
for(int i=a;i<=b;i++)
{
  if(i%2!=0)
  {
   	System.out.println(i);
     }
    }
   } 
}