import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		ArrayList lToG = new ArrayList("int");
		for (int i = 0; i < 20; i++) {
		    lToG.add(i);
		}
		//lToG.print();
		int getNum = lToG.get(5, 0);
		System.out.println(getNum);
	}
}
