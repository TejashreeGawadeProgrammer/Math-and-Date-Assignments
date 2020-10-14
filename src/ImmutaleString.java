
public class ImmutaleString {
public static void main(String args[])
{
	String s1 = new String("Nilakshi");
	String s2 = "harshda";
	String s3 = "nilakshi";
	s1 = "harshda";

	System.out.println("S1:="+s1);
	System.out.println("s2:="+s2);
	System.out.println("S3:="+s3);
	System.out.println("S1:="+s1);
	
	if(s1 == s2)
		System.out.println("s1 and s2 has same reference");
		else
		System.out.println("s1 and s2 doesn’t have same reference");
	 s1 = new String("nilakshi");

	 if(s1 == s3)
	 System.out.println("s1 and s3 has same reference");
	 else
	 System.out.println("s1 and s3 doesn’t have same reference");
	
}

}
