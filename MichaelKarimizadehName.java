import java.util.*; //Imports java.util
import java.text.*; //Imports java.text

class MichaelKarimizadehName{ //Creates class
  public static void main(String[] args){ 
    Scanner sc= new Scanner(System.in); // Creates Scanner
    String name; //Creates name variable
    int j; //Creates j variable
    String first,last; // Creates first and last name variables
    System.out.println("Enter a full name"); // Prompts the user
    name=sc.nextLine(); // Gets name
    String[] parts=name.split(" "); // Splits name into an array
    first=parts[0].toLowerCase(); // Makes first lowercase
    last=parts[1].toLowerCase(); // Makes last lowercase
    System.out.println((first.toUpperCase()).charAt(0)+". "+(last.toUpperCase()).charAt(0)+"."); // Displays initals
    for(int i=0;i<parts[0].length();i++){ //Makes for loop for first name
      if(i%2==1){ // Makes if statement for uneven number
        System.out.print((first.toUpperCase()).charAt(i)); // Prints character
      }
      else if(i%2==0){ // Makes else statement for even number
        System.out.print((first.toLowerCase()).charAt(i)); // Prints character
      }
    }
    System.out.print(" "); // Prints space
    if((first.length()%2)==0){ // Makes if statement for even number
      for(int i=0;i<parts[1].length();i++){ // Makes for statement for last name
        if(i%2==1){ // Makes if statement for uneven number
          System.out.print((last.toUpperCase()).charAt(i)); // Prints character
        }
        else if(i%2==0){ // Makes else statement for even number
          System.out.print((last.toLowerCase()).charAt(i)); // Prints character
        }
      }
    }
    else{
      for(int k=0;k<parts[1].length();k++){ // Makes for statement for last name
        if(k%2==1){ //Makes if statement for uneven number
          System.out.print((last.toLowerCase()).charAt(k)); //Prints character
        }
        else if(k%2==0){ // Makes else statement for even number
          System.out.print((last.toUpperCase()).charAt(k)); // Prints character
        }
      }
    }
  }
}