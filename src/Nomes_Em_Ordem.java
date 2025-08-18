import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Nomes_Em_Ordem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] data = {"Kiwi","Banana","Mango","Aubergine","Strawberry"};
		List list = Arrays.asList(data);
		Collections.sort(list);
		System.out.println(list);
	}
}
