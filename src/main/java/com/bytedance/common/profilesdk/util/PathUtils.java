package com.bytedance.common.profilesdk.util;

import android.os.Process;
import com.bytedance.common.profilesdk.AppContext;
import java.io.File;

public class PathUtils {
    public static int getUserId() {
        return Process.myUid() / 100000;
    }

    public static File getPrimaryCurProfile() {
        String packageName = AppContext.getPackageName();
        return new File("/data/misc/profiles/cur/" + getUserId() + "/" + packageName + "/primary.prof");
    }
}
