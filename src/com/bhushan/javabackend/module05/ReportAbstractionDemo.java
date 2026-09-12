package com.bhushan.javabackend.module05;

abstract class Report {

    private String reportName;

    public Report(String reportName) {
        this.reportName = reportName;
    }

    public String getReportName() {
        return reportName;
    }

    public void displayReportName() {
        System.out.println("Report: " + reportName);
    }

    public abstract void generateReport();
}

class PdfReport extends Report {

    public PdfReport(String reportName) {
        super(reportName);
    }

    @Override
    public void generateReport() {
        System.out.println("Generating PDF report");
    }
}

class ExcelReport extends Report {

    public ExcelReport(String reportName) {
        super(reportName);
    }

    @Override
    public void generateReport() {
        System.out.println("Generating Excel report");
    }
}

public class ReportAbstractionDemo {

    public static void main(String[] args) {

        PdfReport pdf =
                new PdfReport("Monthly Sales");

        pdf.displayReportName();
        pdf.generateReport();

        System.out.println();

        ExcelReport excel =
                new ExcelReport("Employee Data");

        excel.displayReportName();
        excel.generateReport();
    }
}