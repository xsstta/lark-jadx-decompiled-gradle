package com.ss.android.lark.mediarecorder.p2245c;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* renamed from: com.ss.android.lark.mediarecorder.c.h */
public class C44799h {
    /* renamed from: a */
    public static String m177647a(Context context) {
        String str;
        if (!C44800i.m177652a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            str = m177649c(context);
        } else {
            str = m177650d(context);
        }
        C44792e.m177631b(str);
        return str;
    }

    /* renamed from: b */
    public static String m177648b(Context context) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        if (externalFilesDir != null) {
            return externalFilesDir.getPath();
        }
        return "";
    }

    /* renamed from: c */
    private static String m177649c(Context context) {
        String str = m177648b(context) + File.separator + "cameraview" + File.separator;
        C44792e.m177631b(str);
        return str;
    }

    /* renamed from: d */
    private static String m177650d(Context context) {
        String str = m177651e(context) + File.separator + "cameraview" + File.separator;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return str;
    }

    /* renamed from: e */
    private static String m177651e(Context context) {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = Environment.getExternalStorageDirectory();
        } else {
            file = null;
        }
        if (file == null) {
            file = context.getFilesDir();
        }
        if (file != null) {
            return file.getPath();
        }
        return "";
    }
}
