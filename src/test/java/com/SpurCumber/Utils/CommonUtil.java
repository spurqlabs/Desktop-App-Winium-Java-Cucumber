package com.SpurCumber.Utils;

import java.io.File;
import java.nio.file.Paths;

public class CommonUtil {

    public static String getResourceDirPath(String parameter) {
        String assemblyLocation = System.getProperty("user.dir");
        String path = Paths.get(assemblyLocation+"/src/test/resources/"+parameter).toString();
        return new File(path).getAbsolutePath();
    }
}
