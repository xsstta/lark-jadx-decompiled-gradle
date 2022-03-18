package com.ss.android.lark.inv.export.util;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.ss.android.lark.utils.aj;

/* renamed from: com.ss.android.lark.inv.export.util.f */
public class C40107f {
    /* renamed from: a */
    public static void m159012a(CharSequence charSequence) {
        ((ClipboardManager) aj.m224263a().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text", charSequence));
    }
}
