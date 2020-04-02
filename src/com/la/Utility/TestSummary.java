package com.la.Utility;




public class TestSummary {
	
	public String testCase;
	public String startTime;
	public String endTime;
	public String status;
	
	public String getTestCase() {
		return testCase;
	}
	public void setTestCase(String testCase) {
		this.testCase = testCase;
	}
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TestSummary [testCase=" + testCase + ", startTime=" + startTime + ", endTime=" + endTime + ", status="
				+ status + "]";
	}
	
	
	
	// Go to file, put the testcase name, start time, end time and time taken 
	/*
	public static void gotoTestSummaryFilePath(String filePath, String sheetName) {
		
		try {
			
			fileInputsummary= new FileInputStream(filePath);
		
		wb= new XSSFWorkbook(fileInputsummary);
		
		sheet = wb.getSheet(sheetName);
		}
		
		
		catch (Exception e) {
			
			throw new RuntimeException("Not able to find the file"+e.getMessage()+"");
		}
		
}
	
	public static void putTestCaseName(String testName,int rowNumsummary,int cellNumsummary) throws IOException {
		
		
		rowsummary=sheet.getRow(rowNumsummary);
		
		cellsummary = rowsummary.getCell(cellNumsummary);
		
		if (cellsummary==null) {
			
			cellsummary=rowsummary.createCell(cellNumsummary);
			cellsummary.setCellValue(testName);
			
		}
		
		else {
			
			cellsummary.setCellValue(testName);
			
		}
			
		
		fileOutputsummary = new FileOutputStream(Config.testSummaryFilePath);
		wb.write(fileOutputsummary);
		
		
		
		//Shivsandesh Shete 
		
	}
	
	
	public static void enterStartedTime(String filePath,int startTimeRow,int startTimeCell) {
		
		DateTime.now();
		
	}
	
	public static void enterFinishedTime(int finishedTimeRow,int finishedTimeCell) {
		
	 DateTime.now();
		
		
	}

*/

}






