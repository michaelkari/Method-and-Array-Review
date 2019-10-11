import java.util.*;
import java.text.*;

class MichaelKarimizadehPrimeNumbers{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int min, max, twoPrime;
    System.out.println("Enter a minimum");
    min=sc.nextInt();
    System.out.println("Enter a maximum");
    max=sc.nextInt();
    while(min<=max){
      twoPrime=0;
      for(int count=1;count<=min;count++){
        if(min%count==0){
          twoPrime++;
        }
      }
      if(twoPrime==2){
        System.out.print(min+" ");
      }
      min++;
    }
  }
}