package package3;
public class defaultAccess {
int id = 1813008;
String name = "bharath";
String lucky() {
	return name + id;
	
}
public static void main(String[] args) {
	System.out.println(new defaultAccess().lucky());
}
}

