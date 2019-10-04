import java.util.ArrayList ;
public class Amfit {
	public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Ad: ");
	names.add("sambal");
	names.add("kemangi");
	names.add("Bagus");
	names.add("wulan");
	//System.out.println(names); 
    //for (String name : names) {
	names.clear();
	for (String name : names) {
		System.out.println(name); 	
	}
	for (int i=0;i<names.size();i++){
		System.out.println(names.get(i));
	}
}
}