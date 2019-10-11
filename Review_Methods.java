import java.util.*;
import java.text.*;

public class Review_Methods{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int accuracy;
    System.out.println("Enter a decimal you would like the array to be rounded to");
    accuracy=sc.nextInt();
    DecimalFormat df=new DecimalFormat("#.00");
    double[]num={12.123,115.12,366.23};
    String[]list={"Aye", "Bye","Cry"};
    System.out.println("The avg is "+df.format(calculateAvg(num)));
    System.out.println("The highest is "+findLargest(num));
    System.out.println("The first word's position is  "+firstWord(list));
    roundNumbers(num,accuracy);
    for(int i=0;i<num.length;i++){
      System.out.println(num[i]);
    }
  }
  public static double calculateAvg(double[] num){
    double avg=0;
    for(int i=0;i<num.length;i++){
      avg+=num[i];
    }
    avg=avg/num.length;
    return avg;
  }
  public static int findLargest(double[] num){
    double highest=0.0;
    int position=0;
    for(int i=0;i<num.length;i++){
      if(num[i]>highest){
        highest=num[i];
        position=i;
      }
    }
    return position;
  }
  public static double[] roundNumbers(double[] num, int accuracy){
    String zeros="#.";
    for(int i=0;i<accuracy;i++){
      zeros=zeros+"0";
    }
    DecimalFormat df1=new DecimalFormat(zeros);
    for(int i=0;i<num.length;i++){
      num[i]=Double.parseDouble(df1.format(num[i]));
    }
    return num;
  }
  public static int firstWord(String[] list){
    String tester=list[0];
    int position=0;
    for(int i=0;i<list.length;i++){
      if(list[i].compareTo(tester)<0){
        tester=list[i];
        position=i;
      }
    }
    return position;
  }
}