import java.util.Scanner;
public class Matrixproduct
{
 public static void main(String args[])
{
 int a[][]=new int[2][2];
 Scanner s=new Scanner(System.in);
 for(int z=0;z<2;z++)
{
 for(int j=0;j<2;j++)
 {
   System.out.print("enter a value");
   a[z][j]=s.nextInt();
  
 }
}
int b[][]=new int[2][2];
for(int z=0;z<2;z++)
{
 for(int j=0;j<2;j++)
{
 System.out.print("Enter b value");
 b[z][j]=s.nextInt();
 }
}
//int c[][]=new int[2][2];
System.out.println("product matrix");
for(int z=0;z<2;z++)
{
 for(int j=0;j<2;j++)
 {
  //c[z][j]=a[z][j]*b[z][j];
System.out.print(a[z][j]*b[z][j]+" ");
}
System.out.println();
}
}
}