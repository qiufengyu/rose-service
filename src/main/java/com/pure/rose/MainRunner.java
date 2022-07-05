package com.pure.rose;

import com.aspose.cells.*;

public class MainRunner {
    public static void main(String[] args) throws Exception {
        Workbook wb = new Workbook("sample.xlsx");
        WorksheetCollection sheets = wb.getWorksheets();
        Worksheet w1 = sheets.get(0);
        PdfSaveOptions pso = new PdfSaveOptions();
        pso.setPageCount(1);
        pso.setPageIndex(0);
        wb.save("result.pdf", pso);
        PageSetup ps = w1.getPageSetup();
        System.out.println(w1.getName());

        if (ps.getPrintArea() != null) {
            System.out.println(ps.getPrintArea());
            HtmlSaveOptions htmlSaveOptions = new HtmlSaveOptions();
            htmlSaveOptions.setExportGridLines(true);
            htmlSaveOptions.setExportPrintAreaOnly(true);
            htmlSaveOptions.setExportWorkbookProperties(false);
            htmlSaveOptions.setExportWorksheetProperties(false);
            htmlSaveOptions.setExportActiveWorksheetOnly(true);
            htmlSaveOptions.setExcludeUnusedStyles(true);
            wb.save("result.html", htmlSaveOptions);
        }
    }
}
