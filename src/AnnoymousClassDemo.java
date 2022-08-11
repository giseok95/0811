
public class AnnoymousClassDemo {
	public static void main(String[] args) {
		Demo d = new Demo() {
			@Override
			public void display() {
				System.out.println("나는 재정의 된 메소드");
			}
			public void print() {
				System.out.println("나는 새로운 메소드");
			}
		}; //익명 객체
		d.display();
//		d.print(); //원래 부모 클래스에 없어서 사용할 수 없음 새롭게 추가할 순 없음
	}
}

class Demo{
	public void display() {
		System.out.println("나는 원형 메소드");
	}
}