package com.ss.android.lark.banner.export.broadcast;

import android.content.Context;
import android.content.Intent;
import androidx.p034e.p035a.C0978a;

/* renamed from: com.ss.android.lark.banner.export.broadcast.a */
public class C29481a {
    /* renamed from: a */
    public static void m108561a(Context context, String str) {
        Intent intent = new Intent("com.ss.android.lark.banner.receiver.ACTION");
        intent.putExtra("op_name", "close_banner");
        intent.putExtra("banner_key", str);
        C0978a.m4782a(context).mo4992a(intent);
    }
}
