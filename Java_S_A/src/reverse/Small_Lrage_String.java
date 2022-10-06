package reverse;

public class Small_Lrage_String {

	public static void main(String[] args) {
		String a= "i am pratik wayal from jalnaaaaaaaa";
		String word="";
		String small ="";
		String large ="";
		String [] words = new String[100];
		int length=0;
		a = a + " ";
		for (int i=0;i<a.length();i++) {
		if(a.charAt(i) != ' '){    
            word = word + a.charAt(i);    
        } 
		else{    
              
            words[length] = word;    //Add word to array words
            length++;             //Increment length        
            word = "";                //Make word an empty string    

        }    
    }            
    small = large = words[0]; //Initialize small and large with first word in the string      
    for(int k = 0; k < length; k++){      //Determine smallest and largest word in the string   
     if(small.length() > words[k].length())            //If length of small is greater than any word present in the string    
    small = words[k];                //Store value of word into small   
     if(large.length() < words[k].length())            //If length of large is less than any word present in the string    
               large = words[k];                 //Store value of word into large    
    }    
    System.out.println("Smallest word: " + small);    
    System.out.println("Largest word: " + large);    
}   	
			
		}
		
		

	


