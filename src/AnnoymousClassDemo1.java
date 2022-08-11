
public class AnnoymousClassDemo1 {
	public static void main(String[] args) {
		AnnoymousClassDemo1 acd = new AnnoymousClassDemo1();
		//acd.exec(acd.new Myplus());
		//acd.exec(acd.new MyMultiple());
		acd.exec(new Myinterface() {		
			@Override
			public int calculate(int a, int b) {
					return a+b;
			}
		});
		acd.exec(new Myinterface() {		
			@Override
			public int calculate(int a, int b) {
					return a-b;
			}
		});
		acd.exec(new Myinterface() {		
			@Override
			public int calculate(int a, int b) {
					return a*b;
			}
		});
		acd.exec(new Myinterface() {		
			@Override
			public int calculate(int a, int b) {
					return a/b;
			}
		});
	}
	void exec(Myinterface mi) { //멤버 메소드
		int result=mi.calculate(5, 9);
		System.out.println("Result="+result);
	}
//	class MyMultiple implements Myinterface{
//		@Override
//		public int calculate(int front, int back) {
//			return front*back;
//	}
//	
//	class Myplus implements Myinterface{//멤버 클래스
//		@Override
//		public int calculate(int front, int back) {
//			return front+back;
//		}
//	}
//}
@FunctionalInterface //해당 인터페이스에 메소드가 하나 밖에 없다면 람다로 변환할 수 있는 
interface Myinterface{
	int calculate(int front, int back);
}
}