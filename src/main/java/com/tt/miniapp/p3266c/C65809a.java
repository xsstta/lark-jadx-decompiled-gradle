package com.tt.miniapp.p3266c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.tt.miniapp.c.a */
public class C65809a {
    /* renamed from: a */
    public static void m257938a(Context context, String str) {
        if (!str.startsWith("tel:")) {
            str = "tel:" + str;
        }
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
