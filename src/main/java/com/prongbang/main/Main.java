package com.prongbang.main;

import com.prongbang.utils.FileUtil;
import com.prongbang.utils.FilterUtil;
import com.prongbang.utils.IOUtil;

import java.io.File;

/**
 * Created by prongbang on 11/18/2016.
 */
public class Main {

    public static void main(String[] args) {

        String filename = "logs.log";
        String ext = FileUtil.getFileExtension(filename);
        String resource = FileUtil.getResource();
        String logsPath = resource + File.separator + filename;
        String saveTo = resource + File.separator + "end-line" + ext;
        IOUtil.printWriterReplace(saveTo, FilterUtil.replaceEndLine(IOUtil.read(logsPath)));

    }

}
