package com.bytedance.ee.util.p701d;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: com.bytedance.ee.util.d.b */
public class C13614b {
    /* renamed from: a */
    public static boolean m55260a(Context context) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager == null || !clipboardManager.hasPrimaryClip()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m55259a(Context context, String str) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        ClipData newPlainText = ClipData.newPlainText("url", str);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
    }
}
