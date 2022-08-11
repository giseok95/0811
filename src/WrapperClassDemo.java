		
public class WrapperClassDemo {
	public static void main(String[] args) {
		//Until JDK1.4
//		int age=26; // stack
//		Integer in =new Integer(age);//wrapping,boxing
//		int su = in.intValue();//unwrapping,unboxing	
//		System.out.println(su);
		
		//Since JDK1.5
		Integer in=26+5;//Integer in =new Integer(26+5) autoboxing
		int su = in+100;//in.intValue()+100
		System.out.println("su="+su);
	}
}
