import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Pocetna {

	public static void main(String[] args) {
		Vector<Integer> listaNaBroevi;
		listaNaBroevi = new Vector<>();
		listaNaBroevi.add(4);
		listaNaBroevi.add(12);
		listaNaBroevi.add(43);
		listaNaBroevi.add(18);
		listaNaBroevi.remove(0); 
		List<Integer> pomaliOd50 = listaNaBroevi.stream()
				.filter(x -> x<20)
				.map(x -> x*3)
				.collect(Collectors.toList());
		System.out.println(pomaliOd50);
	}
	
}