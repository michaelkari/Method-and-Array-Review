import java.util.*;
import java.text.*;
public class TwoDArray2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int decRow, decCol;
    System.out.println("Enter Num of Rows");
    decRow=sc.nextInt();
    System.out.println("Enter Num of Columns");
    decCol=sc.nextInt();
    int[][]array1=new int[decRow][decCol];
    int[][]array2=new int[decRow][decCol];
    for(int i=0;i<array1.length;i++){
      for(int j=0;j<array1[0].length;j++){
        System.out.println("Enter value for array1 ["+i+"] ["+j+"]");
        array1[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<array2.length;i++){
      for(int j=0;j<array2[0].length;j++){
        System.out.println("Enter value for array2 ["+i+"] ["+j+"]");
        array2[i][j]=sc.nextInt();
      }
    }
    /*
    //Addition
    for(int i=0;i<array1.length;i++){
      for(int j=0;j<array1[0].length;j++){
        array2[i][j]=array2[i][j]+array1[i][j];
        System.out.print(array2[i][j]+" ");
      }
      System.out.println();
    }
    */
    //Subtraction
    for(int i=0;i<array1.length;i++){
      for(int j=0;j<array1[0].length;j++){
        array2[i][j]=array1[i][j]-array2[i][j];
        System.out.print(array2[i][j]+" ");
      }
      System.out.println();
    }
  }
}