package com.prongbang.utils;

/**
 * Created by prongbang on 11/18/2016.
 */
public class FilterUtil {

    private static final String[] filters = { "V/", "I/", "D/", "E/", "W/" };

    public static final String endLine = "\r\n";

    public static String replaceEndLine(String value) {

        for (String f : filters) {

            value = value.replace(f, endLine + f);

        }

        return value;
    }

}
