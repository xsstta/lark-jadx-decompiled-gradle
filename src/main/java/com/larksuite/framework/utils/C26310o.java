package com.larksuite.framework.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;

/* renamed from: com.larksuite.framework.utils.o */
public class C26310o {
    /* renamed from: a */
    public static Uri m95259a(Context context, File file) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m95261b(context, file);
        }
        return Uri.fromFile(file);
    }

    /* renamed from: b */
    public static Uri m95261b(Context context, File file) {
        return FileProvider.getUriForFile(context, context.getPackageName() + ".common.fileprovider", file);
    }

    /* renamed from: a */
    public static void m95260a(Context context, Intent intent, String str, File file, boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            intent.setDataAndType(m95259a(context, file), str);
            intent.addFlags(1);
            if (z) {
                intent.addFlags(2);
                return;
            }
            return;
        }
        intent.setDataAndType(Uri.fromFile(file), str);
    }
}
