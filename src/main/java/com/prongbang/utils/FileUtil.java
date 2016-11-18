package com.prongbang.utils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by prongbang on 11/18/2016.
 */
public class FileUtil {

    public static String getCurrent() {

        Path path = Paths.get("");

        return path.toAbsolutePath().toString();
    }

    public static String getResource() {

        return FileUtil.getCurrent() + File.separator + "src" + File.separator + "main" + File.separator + "resources";
    }

    public static String getFileExtension(String name) {
        try {
            return name.substring(name.lastIndexOf("."));
        } catch (Exception e) {
            return "";
        }
    }

}
