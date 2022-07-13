package com.company;

public class ReportSaveLoadWorker {
    private ReportFileWorker reportFileWorker;

    public ReportSaveLoadWorker(ReportFileWorker reportFileWorker) {
        this.reportFileWorker = reportFileWorker;
    }

    public void setReportFileWorker(ReportFileWorker reportFileWorker) {
        this.reportFileWorker = reportFileWorker;
    }

    public void saveToFile(Report report, String filename) throws Exception {
        reportFileWorker.saveToFile(report, filename);
    }

    public Report loadFromFile(String filename) throws Exception {
        return reportFileWorker.loadFromFile(filename);
    }
}
