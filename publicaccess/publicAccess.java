package publicaccess;
public class publicAccess {
		int dob = 29082001;
		String name = "bharath";
		String lucky() {
			return name + dob;
			
		}
		public static void main(String[] args) {
			System.out.println(new publicAccess().lucky());
		}
	}

