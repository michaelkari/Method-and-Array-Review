import java.util.*;
import java.text.*;
public class TwoDArray3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int decRow1, decCol1, decRow2, decCol2;
    System.out.println("Enter Num of Rows for the first array");
    decRow1=sc.nextInt();
    System.out.println("Enter Num of Columns for the first array");
    decCol1=sc.nextInt();
    System.out.println("Enter Num of Rows for the second array");
    decRow2=sc.nextInt();
    System.out.println("Enter Num of Columns for the second array");
    decCol2=sc.nextInt();
    int[][]array1=new int[decRow1][decCol1];
    int[][]array2=new int[decRow2][decCol2];
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
    int[][]array3=new int[decRow1][decCol2];
    for(int i=0;i<array1.length;i++){
      for(int j=0;j<array2[0].length;j++){
        for(int k=0;k<array1[0].length;k++){
          array3[i][j]+=array1[i][k]*array2[k][j];
        }
      }
    }
    
    for(int i=0;i<array3.length;i++){
      for(int j=0;j<array3[0].length;j++){
        System.out.print(array3[i][j]+" ");
      }
      System.out.println();
    }
  }
}