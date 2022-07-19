package package2;
public class product {
int id = 1813008;
String name = "bharath";
String lucky() {
	return name + id;
}
public static void main(String[] args) {
	System.out.println(new product().lucky());
}
}