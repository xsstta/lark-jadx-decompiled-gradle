package com.ss.android.lark.mediarecorder.p2245c;

import android.content.Context;
import androidx.core.app.ActivityCompat;

/* renamed from: com.ss.android.lark.mediarecorder.c.i */
public class C44800i {

    /* renamed from: a */
    private static final String[] f113418a = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: b */
    private static final String[] f113419b = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    /* renamed from: a */
    public static boolean m177652a(Context context, String str) {
        if (ActivityCompat.checkSelfPermission(context, str) == 0) {
            return true;
        }
        return false;
    }
}
