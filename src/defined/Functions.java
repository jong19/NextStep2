package defined;

import utility.ExcelConfig;

public class Functions {
	
	
	
	public void add_new_user(String details[]){
		
	    String un = details[0];
	    String em = details[1];
	    String pw = details[2];
	    String at = details[3];
	    
	    
		ExcelConfig.cell = ExcelConfig.row.createCell(0);
		ExcelConfig.cell.setCellValue(un);
		
		ExcelConfig.cell = ExcelConfig.row.createCell(1);
		ExcelConfig.cell.setCellValue(em);
		
		ExcelConfig.cell = ExcelConfig.row.createCell(2);
		ExcelConfig.cell.setCellValue(pw);

		ExcelConfig.cell = ExcelConfig.row.createCell(3);
		ExcelConfig.cell.setCellValue(at);
		
		
	}
	
	

}
