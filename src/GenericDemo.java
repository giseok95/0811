
public class GenericDemo {
	public static void main(String[] args) {
		Car <Integer>car = new Car<Integer>(5); int result =car.getValue(); 
		Car <Double>car1= new Car<Double>(5.5); double result1=car.getValue();
		Car <String>car2 = new Car<String>("Hello"); String result2 =car2.getValue();
	}
}
class Car<T>{//< >모든 타입을 받을 수 있는 (컬렉션 제너릭)
	private  T value;
	public Car(T value) {
		this.value=value;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
}
