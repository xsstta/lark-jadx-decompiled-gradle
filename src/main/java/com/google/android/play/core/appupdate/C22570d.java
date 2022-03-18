package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.appupdate.d */
public final class C22570d {

    /* renamed from: a */
    private final Context f55621a;

    /* renamed from: a */
    private static long m81901a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += m81901a(file2);
            }
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo78676a() {
        return m81901a(new File(this.f55621a.getFilesDir(), "assetpacks"));
    }
}
