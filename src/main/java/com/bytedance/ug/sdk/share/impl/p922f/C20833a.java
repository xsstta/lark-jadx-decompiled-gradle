package com.bytedance.ug.sdk.share.impl.p922f;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Looper;
import com.bytedance.ug.sdk.share.impl.p928j.C20850a;
import com.bytedance.ug.sdk.share.impl.p928j.C20854e;

/* renamed from: com.bytedance.ug.sdk.share.impl.f.a */
public class C20833a {
    /* renamed from: b */
    private ClipboardManager m75873b(Context context) {
        try {
            return (ClipboardManager) context.getSystemService("clipboard");
        } catch (Throwable unused) {
            C20850a.m75906a("ClipboardHelper", "Can't create handler inside thread that has not called Looper.prepare() ");
            if (Looper.myLooper() != null) {
                return null;
            }
            Looper.prepare();
            return (ClipboardManager) context.getSystemService("clipboard");
        }
    }

    /* renamed from: a */
    public String mo70309a(Context context) {
        CharSequence text;
        ClipboardManager b = m75873b(context);
        if (b == null) {
            return "";
        }
        try {
            if (b.hasPrimaryClip() && (b.getPrimaryClipDescription().hasMimeType("text/plain") || b.getPrimaryClipDescription().hasMimeType("text/html"))) {
                ClipData.Item itemAt = b.getPrimaryClip().getItemAt(0);
                if (itemAt.getText() == null || (text = itemAt.getText()) == null) {
                    return "";
                }
                return text.toString();
            }
        } catch (Throwable th) {
            C20854e.m75914b(th.toString());
        }
        return "";
    }

    /* renamed from: a */
    public void mo70310a(Context context, CharSequence charSequence, CharSequence charSequence2) {
        ClipboardManager b = m75873b(context);
        if (b != null) {
            b.setPrimaryClip(ClipData.newPlainText(charSequence, charSequence2));
        }
    }
}
