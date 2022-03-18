package com.tt.miniapp.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: com.tt.miniapp.util.f */
public class C67032f {
    /* renamed from: a */
    public static String m261248a(Context context) {
        CharSequence text;
        ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null) {
            return "";
        }
        return text.toString();
    }

    /* renamed from: a */
    public static void m261249a(String str, Context context) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
    }
}
