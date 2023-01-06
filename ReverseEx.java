package corejavapart;

public class ReverseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number = 123456, reverse = 0;  
//		//we have not mentioned the initialization part of the for loop  
//		for( ;number != 0; number=number/10)   
//		{  
//		int remainder = number % 10;  
//		reverse = reverse * 10 + remainder;  
//		}  
//		System.out.println("The reverse of the given number is: " + reverse);  
		String string = "Dream big";    
        //Stores the reverse of given string    
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = string.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + string.charAt(i);    
        }    
            
        System.out.println("Original string: " + string);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string: " + reversedStr);
       if(string==reversedStr) {
    	   System.out.println("pallindrome");
       }
       else {
    	   System.out.println("not pallindrome");
       }
	}

}
