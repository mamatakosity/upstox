package Conditional_statement_Switch;

public class switch_condition_pr1 {
	
	public static void main(String[] args) {//main body open
		
		System.out.println("Program for Hostel weekly Breakfast Menu");
		
		switch("POHA") {
		
		case "DOSA":{
			
			System.out.println("On Monday");
	
			break;
		}
		case "IDALI":{
			
			System.out.println("On Tuesday");
			break;
			
		}
		case "POHA":{
			
			System.out.println("On Wednesday");
			break;
			
		}
		case "Medu Vada":{
			
			System.out.println("On Thursday");
			break;
			
		}
		case "Lemon Rice":{
			
			System.out.println("On Friday");
			break;
		}
		default:{
			
			System.out.println("No Breakfast");
			break;
			
		}
		
		}
	}//main body closed

}
