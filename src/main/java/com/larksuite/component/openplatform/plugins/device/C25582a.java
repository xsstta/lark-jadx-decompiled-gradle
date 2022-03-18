package com.larksuite.component.openplatform.plugins.device;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: com.larksuite.component.openplatform.plugins.device.a */
public class C25582a {
    /* renamed from: a */
    public static String m91295a(Context context) {
        CharSequence text;
        ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0 || (text = primaryClip.getItemAt(0).getText()) == null) {
            return "";
        }
        return text.toString();
    }

    /* renamed from: a */
    public static void m91296a(String str, Context context) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
    }
}
