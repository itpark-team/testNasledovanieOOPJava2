package com.company;

import java.io.*;

public class ReportTxtFileWorker implements ReportFileWorker {
    public void saveToFile(Report report, String filename) throws Exception {
        FileWriter fileWriter = new FileWriter(filename);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(report.getTitle());
        bufferedWriter.newLine();
        bufferedWriter.write(Integer.toString(report.getMoney()));
        bufferedWriter.newLine();
        bufferedWriter.write(Double.toString(report.getRating()));
        bufferedWriter.newLine();

        bufferedWriter.close();
        fileWriter.close();
    }

    public Report loadFromFile(String filename) throws Exception {
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String title = bufferedReader.readLine();
        int money = Integer.parseInt(bufferedReader.readLine());
        double rating = Double.parseDouble(bufferedReader.readLine());

        Report report = new Report(money, title, rating);

        bufferedReader.close();
        fileReader.close();

        return report;
    }
}
