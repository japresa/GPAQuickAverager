import java.util.ArrayList;

public class GPAAnalyzer {
	private ArrayList<Double> GPAs; 
	
	public GPAAnalyzer(String inputStr) {
		GPAs = new ArrayList<>();
		processInputStream(inputStr);
	}

	/**
	 * parses input stream into the arraylist 
	 * @param inputStr
	 */
	private void processInputStream(String inputStr) {
		// TODO Auto-generated method stub
		String[] individualGPAs = inputStr.split(",");
		for(String gpaStr : individualGPAs) {
			GPAs.add(Double.parseDouble(gpaStr));
		}
	}

	public ArrayList<Double> getGPAs() {
		return GPAs;
	}

	public double calculateAverageGPA() {
		if (GPAs.isEmpty()) {
		return -1;
		}
	
		double sum = 0;
		for (double gpa : GPAs) {
			sum += gpa;
		}
		return sum / GPAs.size();
	}
	
	
	
	
}
