package file_handling;

public class Manage_XLSX {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("user.dir"));
		String path = System.getProperty("user.dir") + "\\src\\muthu\\automation\\file_handling\\Data.xlsx";
		Xls_Reader xlsr = new Xls_Reader(path);
		
		// Counting rows in excel
		int rows = xlsr.getRowCount("LoginTest");
		System.out.println(rows);
		
		// Counting columns in excel 
		int cols = xlsr.getColumnCount("LoginTest");
		System.out.println(cols);
		
		// Reading Data in excel
		String data = xlsr.getCellData("LoginTest", "Browser", 2);
		System.out.println(data);
		data = xlsr.getCellData("TestSheet", 3, 4);
		System.out.println(data);
		
		// Writing Data into excel
		xlsr.setCellData("LoginTest", "Browser", 10, "Open Browser");

	}

}
