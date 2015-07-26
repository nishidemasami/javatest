
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPicture;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

import log.Log;

public class POIUtils {

	public static void doKaijoKetsugoCell(final Sheet prmSheet) {
		doKaijoKetsugoCellWithSetValue(prmSheet, false);
	}

	public static void doKaijoKetsugoCellWithSetValue(final Sheet prmSheet, final boolean prmSetValueFlag) {
		Log.debug("doKaijoKetsugoCell start");

		int size = prmSheet.getNumMergedRegions();
		for (int i = 0; i < size; i++) {
			if (prmSetValueFlag) {
				CellRangeAddress range = prmSheet.getMergedRegion(i);
				final int firstRow = range.getFirstRow();
				final int lastRow = range.getLastRow();
				final int firstColumn = range.getFirstColumn();
				final int lastColumn = range.getLastColumn();
				prmSheet.removeMergedRegion(i);
				for (int rowIndex = firstRow; rowIndex < lastRow; rowIndex++) {
					for (int columnIndex = firstColumn; columnIndex < lastColumn; columnIndex++) {
						doCopyCellValue(
								prmSheet.getRow(firstRow).getCell(firstColumn),
								prmSheet.getRow(rowIndex).getCell(columnIndex));
					}
				}
			} else {
				prmSheet.removeMergedRegion(i);
			}
		}
	}

	public static void doCopyCellValue(final Cell prmFromCell, final Cell prmToCell) throws IllegalStateException {

		switch (prmFromCell.getCellType()) {

		case HSSFCell.CELL_TYPE_NUMERIC:
			prmToCell.setCellValue(prmFromCell.getNumericCellValue());
			break;

		case HSSFCell.CELL_TYPE_STRING:
			prmToCell.setCellValue(prmFromCell.getStringCellValue());
			break;

		default:
			throw new IllegalStateException();
		}

	}

	public static Cell getKetsugoMigiue(final Cell prmCell) {
		Log.debug("getKetsugoMigiue start");

		if (prmCell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {

			Sheet prmSheet = prmCell.getSheet();
			Cell firstCell;
			int row = prmCell.getRowIndex();
			int column = prmCell.getColumnIndex();

			int size = prmSheet.getNumMergedRegions();
			for (int i = 0; i < size; i++) {
				CellRangeAddress range = prmSheet.getMergedRegion(i);
				if (range.isInRange(row, column)) {
					firstCell = prmSheet.getRow(range.getFirstRow()).getCell(range.getFirstColumn()); // 左上のセルを取得
					Log.debug("return firstCell");
					return firstCell;
				}
			}
			Log.debug("prmCell is CELL_TYPE_BLANK, but return prmCell");
			return prmCell;
		} else {
			Log.debug("return prmCell");
			return prmCell;
		}
	}

	public static double getDouble(final Cell prmCell) throws IllegalStateException {

		double result;

		switch (prmCell.getCellType()) {

		case HSSFCell.CELL_TYPE_NUMERIC:
			result = prmCell.getNumericCellValue();
			break;

		case HSSFCell.CELL_TYPE_STRING:
			result = Double.valueOf(prmCell.getStringCellValue());
			break;

		default:
			throw new IllegalStateException();
		}

		return result;
	}

	public static String getString(final Cell prmCell) throws IllegalStateException {

		String result;

		switch (prmCell.getCellType()) {

		case HSSFCell.CELL_TYPE_NUMERIC:
			result = prmCell.getStringCellValue();
			break;

		case HSSFCell.CELL_TYPE_STRING:
			result = String.valueOf(prmCell.getNumericCellValue());
			break;

		default:
			throw new IllegalStateException();
		}

		return result;
	}
}
