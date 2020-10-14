import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOperationAssighnment {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice;
		
		String s1 = "Welcome To Core Java";
		String s2 = " With String Operation";
		
		String str1 = new String("Programming");
		String str2 = new String("PROGRAmming");
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		do {
	    System.out.println("String Inbuild Operation: ");
	    System.out.println("1			:			String Length ");
	    System.out.println("2			:			Concatination");
	    System.out.println("3			:			CharAt ");
	    System.out.println("4			:			Sub Sting ");
	    System.out.println("5			:			UpperCase ");
	    System.out.println("6			:			Lower case ");
	    System.out.println("7			:			Trim ");
	    System.out.println("8			:			Last Index Of ");
	    System.out.println("9			:			Replace ");
	    System.out.println("10			:			Equal&EqualIgnoreCase ");
	    System.out.println("11			:			Split ");
	    System.out.println("12			:			Hash Code ");
	    System.out.println("13			:			Exit ");
	    System.out.println("Your Choice: ");
	    choice = Integer.parseInt(reader.readLine());
	    
	    switch (choice) {
	    case 1:		
	    			System.out.println(" Length Is:"+s1.length());
	    			System.out.println(" Length Is:"+s2.length());
	    			break;
	    case 2:		 
	    			System.out.println(" Concatenate :"+s1.concat(s2));
	    			break;			 
	    case 3:		 
	    			System.out.println(" Concatenate :"+s1.charAt(3));
	    			break;
	    case 4:		 
	    			System.out.println("SubSting of S2 is :"+s2.substring(5,10));
	    			break;
	    case 5:		 
	    			System.out.println("Upper Case of S1 :"+s1.toUpperCase());
	    			break;
	    case 6:		 
	    			System.out.println("Lower Case of S2 :"+s1.toLowerCase());
	    			break;
	    case 7:		System.out.println(" Length Is:"+s1.length()); 
					System.out.println(" Trim :"+s1.trim());
					System.out.println(" Length Is:"+s1.length());
					break;
		case 8:		 
					System.out.println("Last Index Of :"+s1.lastIndexOf('e'));
					break;
		case 9:		 
					System.out.println("Replace:"+s1.replace('e', 'O'));
					System.out.println("Replace:"+s2.replace("Operation", "Assignment"));
					break;
		case 10:	
					System.out.println("Equals :"+str1.equals(str2));
					System.out.println("EqualIgnoreCase :"+str1.equalsIgnoreCase(str2));
					break;
		case 11:		 
					String arr[] = s2.split(" ");
					for (String s : arr) 
			            System.out.println(s); 
					break;
		case 12:	
					System.out.println("Hash Code for S1 :"+s1.hashCode());
					System.out.println("Hash COde for Str1 :"+str1.hashCode());
					break;
	    default: 	 
	    			System.out.println("Enterd Invalid Choice");
	    			break;
	  }

	}while(choice != 12);
	}	
}
