import java.util.List;
import java.util.Stack;

public class ListDemo {
public static void main(String[] args) {
	Stack<String>stack = new Stack<String>();
	String []array = {"박지민","홍지민","박지민","한지민","한지민","이지민"};
	for(String str:array) {
		stack.push(str);
	}
	System.out.println(stack.pop());
}
}
