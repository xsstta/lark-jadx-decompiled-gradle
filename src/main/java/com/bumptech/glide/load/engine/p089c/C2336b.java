package com.bumptech.glide.load.engine.p089c;

import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.engine.c.b */
public final class C2336b {
    /* renamed from: a */
    static int m9929a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (Build.VERSION.SDK_INT < 17) {
            return Math.max(m9930b(), availableProcessors);
        }
        return availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static int m9930b() {
        File[] fileArr;
        int i;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            File file = new File("/sys/devices/system/cpu/");
            final Pattern compile = Pattern.compile("cpu[0-9]+");
            fileArr = file.listFiles(new FilenameFilter() {
                /* class com.bumptech.glide.load.engine.p089c.C2336b.C23371 */

                public boolean accept(File file, String str) {
                    return compile.matcher(str).matches();
                }
            });
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        if (fileArr != null) {
            i = fileArr.length;
        } else {
            i = 0;
        }
        return Math.max(1, i);
    }
}
