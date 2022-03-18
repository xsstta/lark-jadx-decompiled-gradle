package com.bytedance.ee.lark.infra.storage.p640c;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.bytedance.ee.lark.infra.storage.c.a */
public class C12899a {
    /* renamed from: a */
    public static SharedPreferences m53203a(Context context, String str) {
        if (context == null) {
            return new SharedPreferencesC12900b();
        }
        return context.getSharedPreferences(str, 0);
    }
}
