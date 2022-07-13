package com.company;

public interface ReportFileWorker {
    void saveToFile(Report report, String filename) throws Exception;
    Report loadFromFile(String filename) throws Exception;
}
