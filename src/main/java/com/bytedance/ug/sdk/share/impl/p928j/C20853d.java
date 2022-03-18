package com.bytedance.ug.sdk.share.impl.p928j;

import android.content.Context;
import com.bytedance.ug.sdk.share.impl.p922f.C20833a;

/* renamed from: com.bytedance.ug.sdk.share.impl.j.d */
public class C20853d {

    /* renamed from: a */
    private static final C20833a f51032a = new C20833a();

    /* renamed from: a */
    public static String m75909a(Context context) {
        return f51032a.mo70309a(context);
    }

    /* renamed from: a */
    public static void m75910a(Context context, CharSequence charSequence, CharSequence charSequence2) {
        if (context != null && charSequence != null && charSequence2 != null) {
            try {
                f51032a.mo70310a(context, charSequence, charSequence2);
                C20850a.m75906a("ClipboardCompat", "clipboard set text success" + ((Object) charSequence2));
            } catch (Throwable unused) {
                C20850a.m75906a("ClipboardCompat", "clipboard set text failed" + ((Object) charSequence2));
            }
        }
    }
}
