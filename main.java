import java.util.ArrayList;

public class main {	
	
	public static void main(String[] args) {
		try {
			//check if there's at least one argument
			if(args.length == 0) {
				throw new IllegalArgumentException("Please provide input in the form of #,#,#,#,#,#,#,#");
			}
			//input stream
			String inputStr = args[0];
			
			//reads input stream into private var in gpaanalyzer
			GPAAnalyzer analyzer = new GPAAnalyzer(inputStr);
			double averageGPA = analyzer.calculateAverageGPA();
			System.out.println("Average Senior GPA = " + averageGPA);			
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
			
	}

}








