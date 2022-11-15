package SIB_static_initializer_block;

public class prog_8 {
	
		public static void main(String[] args) {
			int marks=34;
			if(marks>=35) {
				System.out.println("student is pass");//operation 1
			}
			else {
				System.out.println("student is fail");//operation 2
			}
		}
		static {
			System.out.println("GOOD MRG");
		}

	}



