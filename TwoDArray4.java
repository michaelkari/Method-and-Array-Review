import java.util.*;
import java.io.*;

public class TwoDArray4{
  public static void main(String[] args){   
    try{
      Scanner sc=new Scanner(System.in);
      BufferedReader bufferA=new BufferedReader(new FileReader("MatrixA.txt"));
      BufferedReader bufferA1=new BufferedReader(new FileReader("MatrixA.txt"));
      BufferedReader bufferB=new BufferedReader(new FileReader("MatrixB.txt"));
      BufferedReader bufferB1=new BufferedReader(new FileReader("MatrixB.txt"));
      String line;
      String[] colTesterA=null;
      String[] colTesterB=null;
      int choice=0;
      //Making Matrix A
      int rows=0;
      while((line=bufferA.readLine())!=null){
        colTesterA=line.split(",");
        rows++;
      }
      int[][]matrixA=new int[rows][colTesterA.length];
      //Prints Matrix A size
      System.out.println("matrixA["+matrixA.length+"]["+matrixA[0].length+"]");
      
      //Making Matix B
      rows=0;
      while((line=bufferB.readLine())!=null){
        colTesterB=line.split(",");
        rows++;
      }
      int[][]matrixB=new int[rows][colTesterB.length];
      //Prints Matrix B size
      System.out.println("matrixB["+matrixB.length+"]["+matrixB[0].length+"]");
      
      //Filling Matrix A  
      for(int i=0;i<matrixA.length;i++){
        line=bufferA1.readLine();
        colTesterA=line.split(",");
        for(int j=0;j<matrixA[0].length;j++){
          matrixA[i][j]=Integer.parseInt(colTesterA[j]);
        }
      }
      //Printing Matrix A
      for(int i=0;i<matrixA.length;i++){
        for(int j=0;j<matrixA[0].length;j++){
          System.out.print(matrixA[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println();
      //Filling Matrix B  
      for(int i=0;i<matrixB.length;i++){
        line=bufferB1.readLine();
        colTesterB=line.split(",");
        for(int j=0;j<matrixB[0].length;j++){
          matrixB[i][j]=Integer.parseInt(colTesterB[j]);
        }
      }
      //Printing Matrix B
      for(int i=0;i<matrixB.length;i++){
        for(int j=0;j<matrixB[0].length;j++){
          System.out.print(matrixB[i][j]+" ");
        }
        System.out.println();
      }
      
      while(choice!=1&&choice!=2&&choice!=3){
        System.out.println("Would you like to Add(1), Subtract(2), or Multiply(3) these matrices?");
        choice=sc.nextInt();
      }
      if(choice==1){
        //Addition
        for(int i=0;i<matrixA.length;i++){
          for(int j=0;j<matrixA[0].length;j++){
            matrixB[i][j]=matrixB[i][j]+matrixA[i][j];
            System.out.print(matrixB[i][j]+" ");
          }
          System.out.println();
        }
      }
      else if(choice==2){
        //Subtraction
        for(int i=0;i<matrixA.length;i++){
          for(int j=0;j<matrixA[0].length;j++){
            matrixB[i][j]=matrixA[i][j]-matrixB[i][j];
            System.out.print(matrixB[i][j]+" ");
          }
          System.out.println();
        }
      }
      else if(choice==3){
        //Multiplication
        int[][]array3=new int[matrixA.length][matrixB[0].length];
        for(int i=0;i<matrixA.length;i++){
          for(int j=0;j<matrixB[0].length;j++){
            for(int k=0;k<matrixA[0].length;k++){
              array3[i][j]+=matrixA[i][k]*matrixB[k][j];
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
    catch(IOException ex){
      System.out.println("Can't find files MatrixA.txt and MatrixB.txt");
    }
  }
}