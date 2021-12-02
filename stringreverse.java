import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
// Class of ReverseString 
class abc
{ 
    public static void main(String[] args) 
    { 
        //String input = "tpyrcoow :ssap siht retne level siht etelpmoc oT .rewop niarb fo tol a yolpme ot deen lliw uoy ,cigol dna noitpyrced tuoba lla era slevel esehT .sihtkcah no slevel tpyrc eht ot emoclew ,olleH"; 
  
        // getBytes() method to convert string  
        // into bytes[]. 
		String input;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to reverse");
		input= sc.nextLine();
        byte [] strAsByteArray = input.getBytes(); 
  
        byte [] result =  
                   new byte [strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i<strAsByteArray.length; i++) 
            result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
			 
			 
			 System.out.println("\n\n\n\n\n\n\nreversed string:");
  
        System.out.println(new String(result)); 
    } 
} 