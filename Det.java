import java.util.Scanner;
public class Det
{
public static void main(String args[])
{
 int a[][]=new int[2][2];
Scanner s=new Scanner(System.in);
for(int i=0;i<2;i++)
{
 for(int i=0;i<2;i++)
{
 System.out.printf("enter a value");
  a[i][j]=s.nextInt();
}
}
int b[][]=new int[2][2];
for(int i=0;i<2;i++)
{
 for(int i=0;i<2;i++)
{
  System.out.printf(" enter b value");
   b[i][j]=s.nextInt();
}
}
int x=(a[0][0]*a[1][1])-(a[0][1]*a[1][0]);
System.out.printf(x);
int y=(b[0][0]*b[1][1])-(b[0][1]*b[1][0]);
System.out.printf(y);

 }

 }
