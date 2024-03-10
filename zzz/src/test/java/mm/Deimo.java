package mm;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Deimo {
	
	

	@Test(dataProvider = "suppolier")
	public void sampleTest123(String a,String b) {
		
		System.out.println(a+"ram"+b);
		
	}
	@DataProvider(name="suppolier")
	public String[][] datasupplier() {
		
		String [] [] data = {{"arun","mani","janu"},
				{"varun","dhava"},{"than","the"}};
		
		return data;
		}

}
