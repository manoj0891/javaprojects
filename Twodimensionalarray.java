import java.util.Scanner;
public class Twodimensionalarray
{
 public static void main(String args[])
{ 
  int a[][]=new int[3][3];
  Scanner s=new Scanner(System.in);
  for(int i=0;i<3;i++)
  { 
     for(int j=0;j<3;j++)
    {
      System.out.println("enter a value");
      a[i][j]=s.nextInt();
    }
}

System.out.println("elements present in the array are");
int b[][]=new int[3][3];
for(int i=0;i<3;i++)
{
  for(int j=0;j<3;j++)
{
  b[i][j]=a[j][i];
 System.out.printf(b[i][j]+" ");
  
   
}
System.out.println();
}
}
}