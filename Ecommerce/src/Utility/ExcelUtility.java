package Utility;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

    private static final String EXCEL_PATH =
            "C:\\Users\\MEGHANR\\prodg\\Prodg\\s3\\s4\\s5\\Ecommerce\\src\\TestData\\Book1.xlsx";

    public static Object[][] readExcelData(String sheetName) {

        Object[][] data = null;

        try {
            FileInputStream fis = new FileInputStream(EXCEL_PATH);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheet(sheetName);

            int rows = sheet.getLastRowNum();
            int cols = sheet.getRow(0).getLastCellNum();

            data = new Object[rows][cols];

            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <= rows; i++) {

                for (int j = 0; j < cols; j++) {

                	data[i - 1][j] =
                			sheet.getRow(i).getCell(j).toString();
                }
            }

            workbook.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}