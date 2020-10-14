import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathOperationAssignment {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		int choice;
		

		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		do {
	    System.out.println("Math InBuild Operation: ");
	    System.out.println("1			:			Math.Pow() ");
	    System.out.println("2			:			Math.Sqrt()");
	    System.out.println("3			:			Math.Max() ");
	    System.out.println("4			:			Math.Min() ");
	    System.out.println("5			:			Math.Ceil() ");
	    System.out.println("6			:			Math.Floor() ");
	    System.out.println("7			:			Math.Random() ");
	    System.out.println("8			:			Math.Abs() ");
	    System.out.println("9			:			Math.CopySign() ");
	    System.out.println("10			:			Math.Log() ");
	    System.out.println("11			:			Math.PI() ");
	    System.out.println("12			:			Math.Round() ");
	    System.out.println("13			:			Exit ");
	    System.out.println("Your Choice: ");
	    choice = Integer.parseInt(reader.readLine());
	    
	    switch (choice) {
	    case 1:		byte n1 = (byte) Math.pow(9,2);
	    			System.out.println("Math.Power():"+n1);
	    			break;
	    case 2:		 
			    	double n2 = Math.sqrt(25);
				    System.out.println("Math.Sqrt():"+n2);
	    			break;			 
	    case 3:		 
			    	byte max = (byte) Math.max(82, 127);
				    System.out.println("Math.Max():"+max);
	    			break;
	    case 4:		 
			    	byte min = (byte) Math.min(82, 127);
				    System.out.println("Math.Min():"+min);
	    			break;
	    case 5:		 
			    	byte n3 = (byte) Math.ceil(1.001);
			 	    System.out.println("Math.Ceil():"+n3);
	    			break;
	    case 6:		 
			    	byte n4 = (byte) Math.floor(1.99);
				    System.out.println("Math.Floor():"+n4);
	    			break;
	    case 7:		
	    			byte no5 = (byte) ((Math.random() * 100) + 1);
	    			System.out.println("Math.Random():"+no5);
					break;
		case 8:		 
					byte no6 = (byte) Math.abs(5-100);
				    System.out.println("Math.Abs() Is:"+no6);
					break;
		case 9:		 
					double x = 125.9;
				    double y = -0.4873;
				    System.out.println("Math Copy Sign=" + Math.copySign(x, y));
				    System.out.println("Math Copy Sign=" + Math.copySign(y, x));
					break;
		case 10:	
					double log1 = 6.0;
				    System.out.println("The log of Number is:"+Math.log(log1));
				    System.out.println("The log10 of Number is:"+Math.log10(log1));
					break;
		case 11:		 
				 	double radious = 2.0;
				    System.out.println("Area Of Circle = " + Math.PI*radious*radious);
					break;
		case 12:		 
				 	double round = 25.780;
				    System.out.println("Round= " + Math.round(round));
					break;
	    default: 	 
	    			System.out.println("Enterd Invalid Choice");
	    			break;
	  }

	}while(choice != 13);
}

}
