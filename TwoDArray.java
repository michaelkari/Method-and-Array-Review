import java.util.*;
import java.text.*;
public class TwoDArray{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arrayChoice;
    int decRow, decCol,value;
    System.out.println("Choose from 3 arrays(1-3)");
    arrayChoice=sc.nextInt();
    int arrayAction;
    System.out.println("Display(1) or Change(2)");
    arrayAction=sc.nextInt();
    int[][]araryy=new int[7][3];
        int count=1;
        for(int i=0;i<araryy.length;i++){
          for(int j=0;j<araryy[0].length;j++){
            araryy[i][j]=count;
            count++;
          }
        }
        int[][]araryy1=new int[3][10];
        for(int i=0;i<araryy1.length;i++){
          for(int j=0;j<araryy1[0].length;j++){
            araryy1[i][j]=j;
          }
        }
        int[][]araryy2=new int[4][5];
        for(int i=0;i<araryy2.length;i++){
          for(int j=0;j<araryy2[0].length;j++){
          }
        }
    if(arrayChoice==1){
      if(arrayAction==1){
        //1. a)
        for(int i=0;i<araryy.length;i++){
          for(int j=0;j<araryy[0].length;j++){
            System.out.println("Row: "+i+" Col: "+araryy[i][j]);
          }
        }
      }
      else if(arrayAction==2){
        System.out.println("Enter the row");
        decRow=sc.nextInt();
        System.out.println("Enter the col");
        decCol=sc.nextInt();
        System.out.println("Enter the value you wish to change to");
        value=sc.nextInt();
        araryy[decRow][decCol]=value;
        System.out.println("araryy"+(arrayChoice-1)+" ["+decRow+"] ["+decCol+"] now has the value "+araryy[decRow][decCol]);
      }
    }
    else if(arrayChoice==2){
      if(arrayAction==1){
        //1. b)
        for(int i=0;i<araryy1.length;i++){
          for(int j=0;j<araryy1[0].length;j++){
            System.out.println("Row: "+i+" Col: "+araryy1[i][j]);
          }
        }
      }
      else if(arrayAction==2){
        System.out.println("Enter the row");
        decRow=sc.nextInt();
        System.out.println("Enter the col");
        decCol=sc.nextInt();
        System.out.println("Enter the value you wish to change to");
        value=sc.nextInt();
        araryy1[decRow][decCol]=value;
        System.out.println("araryy"+(arrayChoice-1)+" ["+decRow+"] ["+decCol+"] now has the value "+araryy1[decRow][decCol]);
      }
    }
    else if(arrayChoice==3){
      if(arrayAction==1){
        //2. c)
        for(int i=0;i<araryy2.length;i++){
          for(int j=0;j<araryy2[0].length;j++){
            System.out.println("Row: "+i+" Col: "+araryy2[i][j]);
          }
        }
      }
      else if(arrayAction==2){
        System.out.println("Enter the row");
        decRow=sc.nextInt();
        System.out.println("Enter the col");
        decCol=sc.nextInt();
        System.out.println("Enter the value you wish to change to");
        value=sc.nextInt();
        araryy2[decRow][decCol]=value;
        System.out.println("araryy"+(arrayChoice-1)+" ["+decRow+"] ["+decCol+"] now has the value "+araryy2[decRow][decCol]);
      }
    }
  }
}