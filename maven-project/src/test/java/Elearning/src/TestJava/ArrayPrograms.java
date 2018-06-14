package TestJava;

import java.util.HashSet;

public class ArrayPrograms {


/**1. find duplicate values in array Using Brute Force Method **/
 
	
	public static void duplicateArrayValueBFM(String[] args) {
		
		for (int i = 0; i<args.length-1; i++) {
			for(int j = i+1; j<args.length; j++) {
				if( (args[i].equals(args[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+args[j]);
                }
			}
		}	
	}
	
	
	
/**2.Using HashSet**/
	
	public static void duplicateArrayValueHasSet(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		for(String arrayElemnt : args)	{
			
			if(!set.add(arrayElemnt)) {
				
				System.out.println("Duplicate Element is : "+ arrayElemnt);
				
			}
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC", "hello", "hello"};
		//duplicateArrayValueBFM(strArray);
		duplicateArrayValueHasSet(strArray);
		
		
	}

}
