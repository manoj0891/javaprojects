import java.util.Scanner;
public class Matrix
{
 public static void main(String args[])
{
 int a[][]=new int[2][2];
 Scanner s=new Scanner(System.in);
 for(int i=0;i<2;i++)
{
 for(int j=0;j<2;j++)
 {
   System.out.printf("enter a value");
   a[i][j]=s.nextInt();
   System.out.printf(a[i][j]+" ");
 }
}
int b[][]=new int[2][2];
for(int i=0;i<2;i++)
{
 for(int j=0;j<2;j++)
{
 System.out.println("Enter b value");
 b[i][j]=s.nextInt();
 System.out.printf(b[i][j]+" ");
}
int c[][]=new int[2][2];
for(int i=0;i<2;i++)
{
 for(int j=0;j<2;j++)
 {
  c[i][j]=a[i][j]+b[i][j];
System.out.printf(c[i][j]+" ");
}
}
}
}
}

