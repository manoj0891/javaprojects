import java.util.Scanner;
class number
{
 public static void main(String args[])
  {
    Scanner x=new Scanner(System.in);
     System.out.println("Enter the number:");
    int y=x.nextInt();
    if(y>0)
    {
      System.out.println(y+" is positive");
     }
    else
{
  System.out.println(y+" is negative");
}
}
}