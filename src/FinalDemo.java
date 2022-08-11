/**
 * <h1>Final 용법 3가지</h1>
 * <ul>
 * <li><b>Final Variable</b>: 자바의 상수</li>
 * <li><b>Final Method</b>: Override의 금지</li>
 * <li><b>Final Class</b>: 상속의 금지</li>
 * </ul>
 * @author User
 * @version 1.1
 * @since 2022-08-11
 */
public class FinalDemo extends parent{
	private final double PI = Math.PI; // 멤버상수
	private static final boolean FLAG=true; //스택틱 상수
	public static void main(String[] args) {
		final String NAME = "한지민"; //지역상수
		
	}
//	public final void display() {//오버라이드 금지
//		System.out.println("나는 부모의 메소드");
//	}
//	@Override
//	public void print() {
//		System.out.println("나는 자식의 메소드");
//	}
//}
//
//abstract class Super{
//	public final void display() {System.out.println("나는 부모의 메소드");}
//	public abstract void print();
//}
	final class parent { //상속 금지
		public void display() {
			System.out.println("나는 부모의 메소드");
		}
	}
}