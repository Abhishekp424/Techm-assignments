package CollectionApi;
import java.util.ArrayList;
public class InsertAtPosition3 {
	public static void main(String[] arg) {
		ArrayList<String> colors=new ArrayList<>();
		colors.add("red");
		colors.add("pink");
		colors.add("blue");
		colors.add("green");
		//Inserting an element at the first position
		colors.add(0,"purple");
		System.out.println("Array List: "+colors);
		
	}

}
