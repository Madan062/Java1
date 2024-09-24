import java.util.Scanner;
public class MatrixAddition_1{
public static void main(String[]args){
int N=Integer.parselnt(args[0]);
int[][] matrix1=new int[N][N];
int[][] matrix2=new int[N][N];
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the elements of the first matrix:");
for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
matrix[i][j]=scanner.nextint();
}
}
System.out.println("Enter the elements of the second matrix:");
for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
matrix2[i][j]=scanner.nextint();
}
}
int[][]sumMatrix=new int[N][N];
for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
sumMatrix[i][j]=matrix[i][j]+matrix2[i][j];
}
}
System.out.println("The sum of the two matrices is:");
for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
System.out.print(sumMatrix[i][j]+"");
}
System.out.println();
}
}
}