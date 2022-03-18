package com.bytedance.apm6.cpu;

import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CgroupFetcher {

    public enum CGROUP_LEVEL {
        TOP_APP,
        FOREGROUND,
        BACKGROUND,
        UNKNOWN
    }

    /* renamed from: a */
    public static CGROUP_LEVEL m13483a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/" + Process.myPid() + "/cgroup").getPath()), 100);
            String str = "";
            String str2 = str;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.contains(":cpuset:")) {
                    str = readLine;
                    break;
                } else if (readLine.contains(":cpu:")) {
                    str2 = readLine;
                }
            }
            bufferedReader.close();
            if (str2.isEmpty() && str.isEmpty()) {
                return CGROUP_LEVEL.UNKNOWN;
            }
            if (str.isEmpty()) {
                if (!str2.isEmpty()) {
                    if (str2.endsWith("/")) {
                        return CGROUP_LEVEL.FOREGROUND;
                    }
                    if (str2.endsWith("/bg_non_interactive") || str2.endsWith("/background")) {
                        return CGROUP_LEVEL.BACKGROUND;
                    }
                }
                return CGROUP_LEVEL.UNKNOWN;
            } else if (str.endsWith("/top-app")) {
                return CGROUP_LEVEL.TOP_APP;
            } else {
                if (str.endsWith("/foreground")) {
                    return CGROUP_LEVEL.FOREGROUND;
                }
                if (str.endsWith("/background") || str.endsWith("/")) {
                    return CGROUP_LEVEL.BACKGROUND;
                }
                return CGROUP_LEVEL.UNKNOWN;
            }
        } catch (Throwable unused) {
        }
    }
}
