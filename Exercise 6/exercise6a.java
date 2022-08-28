import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class exercise6a {

public static void main(String[] args) {
		
		//1.Declare output file.
		String outFile = "Exercise6.txt";
		
		//Data declaration
	
		String dates[] = {"10/08/2022", "11/08/2022", "12/08/2022", "13/08/2022", "14/08/2022", "15/08/2022"};
		double utilization[] = {15.0, 0.0, 0.0, 10.0, 0.0, 0.0};
		
		try {
			
		//2. Create stream to read data.
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			//Processdaat
			for (int index = 0; index <  dates.length; index++) {
				
				//3.Write data into data stream
				dos.writeUTF(dates[index]);
				dos.writeDouble(utilization[index]);
				
				//4.Flush for each writing
				dos.flush();
			}
			
			//5.Close stream
			dos.close();
			
		} catch  (Exception ex) {
			ex.printStackTrace();
		}
		
		//Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile);
	}
}
