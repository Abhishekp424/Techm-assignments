package CollectionApi;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedList12 {
public static void main(String[] arg) {
	LinkedList<String> colors=new LinkedList<>();
	colors.add("red");
	colors.add("blue");
	colors.add("pink");
	colors.add("yellow");
	ListIterator<String> colorIter=colors.listIterator();
	
	while(colorIter.hasNext()) {
		System.out.println(colorIter.next());
	}
}

}
