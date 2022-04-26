import java.util.Scanner;
class MatrixMultiplication{
  public static void main(String args[]){
  int row,col,i,j,row1,col1,k,sum=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of raws and columns of first Matrix");
  row=sc.nextInt();
  col=sc.nextInt();
  int mat1[][]=new int[row][col];
  int mat2[][]=new int[row][col];
  System.out.println("Enter the elements of First Matrix");
  for(i=0;i<row;i++)
  for(j=0;j<col;j++)
  mat1[i][j]=sc.nextInt();
  System.out.println("Enter the number of raws and columns of second Matrix");
  row1=sc.nextInt();
  col1=sc.nextInt();
  System.out.println("Enter the elements of Second Matrix");
  for(i=0;i<row1;i++)
  for(j=0;j<col1;j++)
  mat2[i][j]=sc.nextInt();
   if(col !=row1)
   System.out.println("Matrix is not suitable for Multiplication");
   else
   {
   int multiply[][]=new int[col][row1];
   for(i=0;i<row;i++){
   for(j=0;j<col;j++){
   for(k=0;k<row1;k++){
   sum=sum+mat1[i][k]*mat2[k][j];
   multiply[i][j]=sum;
   sum=0;
   }
   }
   }
   System.out.println("Product of the matrix is : ");
   for(i=0;i<row;i++)
   for(j=0;j<col1;j++)
   System.out.print(multiply[i][j]);
   System.out.println("\n");
  }
  }
}










