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
			
			//itemize each gpa
			String[] individalGPAs = inputStr.split(",");
			
			ArrayList<Double> GPAs = new ArrayList<>();
			
			for(int i = 0; i< individalGPAs.length; i++) {
				GPAs.add(Double.parseDouble(individalGPAs[i]));
			}
			
			System.out.println(GPAs);
			
			double averageGPA = 0;
			//System.out.println(GPAs.size() + "size");
			for(int j = 0; j<GPAs.size(); j++) {
				averageGPA = averageGPA + GPAs.get(j);
			}
			System.out.println(averageGPA + " " + GPAs.size());
			averageGPA = averageGPA/GPAs.size();
			System.out.println("Average Senior GPA = " + averageGPA);
			
			
			
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		// TODO Auto-generated method stub
		
	
		System.out.println("hello wlrld");
		ArrayList<Integer> gpas = new ArrayList();
	
		
			
	}

}
