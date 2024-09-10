/*
Number In Word
Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.



NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.

NOTE: Do not add main method to solution code.

*/

public class NumberInWord 
{
    
   public static void printNumberInWord(int num){
    
    String NumWord= switch (num) 
    {
        case 0 -> { yield "ZERO";}
        
        case 1 -> { yield "ONE";}
        
        case 2 -> { yield "TWO";}
        
        case 3 -> { yield "THREE";}
        
        case 4 -> { yield "FOUR";}
        
        case 5 -> { yield "FIVE";}
        
        case 6 -> { yield "SIX";}
        
        case 7 -> { yield "SEVEN";}
        
        case 8 -> { yield "EIGHT";}
        
        case 9 -> { yield "NINE";}
        
        default -> { yield "Other";}
        
         };
         System.out.println(NumWord);
   }
         
}