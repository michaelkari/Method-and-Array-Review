import java.util.*;
import java.text.*;

class ArraysReview{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String inputWord;
    System.out.print("Input word ->  ");
    inputWord=sc.nextLine();
    int h=0,r=0;
    char[]inputString=new char[inputWord.length()];
    for(int i=0; i<inputWord.length();i++){
      inputString[i]=inputWord.charAt(i);
    }
    for(int i=0; i<inputWord.length();i++){
      if(inputString[i]=='h'||inputString[i]=='H'){
        h++;
      }
      else if(inputString[i]=='r'||inputString[i]=='R'){
        r++;
      }
    }
    System.out.println("H ->  "+h);
    System.out.println("R ->  "+r);
  }
}