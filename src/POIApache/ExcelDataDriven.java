package POIApache;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
//mport org.apache.poi.ss.formula.functions.LookupUtils.CompareResult;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataDriven {

	public static void main(String[] args) {
		ExcelDataDriven objExcelInfile = new ExcelDataDriven();
		String filepath = System.getProperty("user.dir") + "/src/ExcelData";
		System.out.println(filepath);
		try {
			objExcelInfile.readExcel(filepath, "DataSheet.xlsx", "inputData");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void readExcel(String filePath, String fileName, String sheetName) throws IOException {
		File file = new File(filePath + "/" + fileName);
		FileInputStream inputstream = new FileInputStream(file);
		Workbook excelData = null;
		String fileExtensionname = fileName.substring(fileName.indexOf("."));
		System.out.println(fileExtensionname);
		if (fileExtensionname.equals(".xlsx")) {
			excelData = new XSSFWorkbook(inputstream);

		} else if (fileExtensionname.equals(".xls")) {
			excelData = new HSSFWorkbook(inputstream);

		}

		Sheet dataSheet = excelData.getSheet(sheetName);
		int rowCount = dataSheet.getLastRowNum() - dataSheet.getFirstRowNum();
		for (int i = 0; i <= rowCount; i++) {
			Row row = dataSheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				System.out.println(row.getCell(j).getStringCellValue() + "|");
			}

			String cell1 = row.getCell(0).getStringCellValue();
			String cell2 = row.getCell(1).getStringCellValue();
			String result = compareDataValues(cell1, cell2);
			System.out.println(result);

			Cell cell = row.createCell(2);
			cell.setCellValue(result);

			inputstream.close();

			FileOutputStream outputStream = new FileOutputStream(file);
			excelData.write(outputStream);
			outputStream.close();

		}

	}

	public String compareDataValues(String cell1, String cell2) {
		boolean comValue = cell1.equals(cell2);
		if (comValue == true) {
			return "true";
		} else {
			return "false";
		}
	}
}
