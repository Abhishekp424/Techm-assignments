package CollectionApi;
import java.util.ArrayList;

public class IterateArrayList2 {
	public static void main(String[] arg) {
		ArrayList<String> colors=new ArrayList<>();
		colors.add("red");
		colors.add("blue");
		colors.add("pink");
		colors.add("yellow");
		System.out.println("colors List:");
		for(String color:colors) {
			System.out.println(color);
		}
	}

}
