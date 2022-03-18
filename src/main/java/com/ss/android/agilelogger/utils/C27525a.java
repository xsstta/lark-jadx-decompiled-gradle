package com.ss.android.agilelogger.utils;

import android.content.Context;
import java.io.File;

/* renamed from: com.ss.android.agilelogger.utils.a */
public class C27525a {
    /* renamed from: a */
    public static File m100463a(Context context) {
        File file = new File(context.getFilesDir(), "logs");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* renamed from: b */
    public static String m100464b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return null;
        }
        File file = new File(filesDir.getAbsolutePath(), "ALOG");
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath();
    }
}
