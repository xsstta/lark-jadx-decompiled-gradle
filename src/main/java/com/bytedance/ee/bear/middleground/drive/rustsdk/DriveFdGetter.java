package com.bytedance.ee.bear.middleground.drive.rustsdk;

import android.net.Uri;
import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.utils.LarkContext;

public class DriveFdGetter {
    public static long getFdWithUri(String str) {
        long j;
        try {
            j = (long) LarkContext.getApplication().getContentResolver().openFileDescriptor(Uri.parse(str), "r").detachFd();
        } catch (Throwable unused) {
            j = -1;
        }
        C13479a.m54764b("", "DriveFdGetter getFdWithUri" + j);
        return j;
    }
}
