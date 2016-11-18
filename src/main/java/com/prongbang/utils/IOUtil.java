package com.prongbang.utils;

import java.io.*;

/**
 * Created by prongbang on 11/18/2016.
 */
public class IOUtil {

    public static String read(String filePath) {

        File file = new File(filePath);

        StringBuilder logs = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                logs.append(line);
                logs.append(FilterUtil.endLine);
            }
            br.close();
        } catch (IOException e) {

            System.out.println("Read Logs error => " + e.getMessage());

        }

        return logs.toString();
    }

    public static void printWriterReplace(String filePath, String data) {
        try {
            PrintWriter writer = new PrintWriter(new File(filePath), "UTF-8");
            writer.write(data);
            writer.flush();
            writer.close();
            System.out.println("Write Logs => Success");
        } catch (IOException e) {
            System.out.println("Write Logs => Error >> " + e.getMessage());
        }
    }

}
