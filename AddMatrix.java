import java.io.*;
import java.util.*;
public class AddMatrix
{
public static void main(String args[])
{
    int arr[][],i,j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
int r = sc.nextInt();
System.out.println("Enter the number columns");
int c= sc.nextInt();
int mat1[][] = new int[r][c];
int mat2[][] = new int[r][c];
int res[][] = new int[r][c];
System.out.println("Enter the elements of matrix1");
 for ( i= 0 ; i < r ; i++ )
{ 
 for ( j= 0 ; j < c ;j++ )
mat1[i][j] = sc.nextInt();
System.out.println();
}
System.out.println("Enter the elements of matrix2");
for ( i= 0 ; i < r ; i++ )
{
for ( j= 0 ; j < c ;j++ )
mat2[i][j] = sc.nextInt();
System.out.println();
}
for ( i= 0 ; i < r ; i++ )
for ( j= 0 ; j < c ;j++ )
res[i][j] = mat1[i][j] + mat2[i][j] ; 
System.out.println("Sum of matrices:-");
for ( i= 0 ; i < r ; i++ )
{ 
for ( j= 0 ; j < c ;j++ )
System.out.print(res[i][j]+"\t");
System.out.println();
}
}
}
OUTPUT:
Enter the number of rows
2
Enter the number columns
2
Enter the elements of matrix1
3
4
5
6
Enter the elements of matrix2
7
8
9
2
Sum of matrices:-
10	12	
14      8