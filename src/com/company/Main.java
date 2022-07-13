package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        //final int a = 5;
        //a=65;

        //final Cat cat = new Cat();

        //System.out.println(cat.getName());
        //cat.setName("ываываывааывваыва");

        //cat = new Cat("dsdd");

//        ReportFileWorker reportFileWorker = new ReportTxtFileWorker();
//        reportFileWorker = new ReportExcelFileWorker();

        ReportSaveLoadWorker reportSaveLoadWorker = new ReportSaveLoadWorker(new ReportTxtFileWorker());

        Report report = new Report(1000, "nalog", 4.5);
        reportSaveLoadWorker.saveToFile(report, "report.txt");

        reportSaveLoadWorker.setReportFileWorker(new ReportExcelFileWorker());
        reportSaveLoadWorker.saveToFile(report, "report2.txt");

//        Report report = reportFileWorker.loadFromFile("report.txt");
//        System.out.println(report.toString());
    }
}
