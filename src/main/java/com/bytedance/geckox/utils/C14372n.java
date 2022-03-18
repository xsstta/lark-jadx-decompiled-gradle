package com.bytedance.geckox.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.bytedance.geckox.utils.n */
public class C14372n {

    /* renamed from: b */
    private static C14372n f37733b;

    /* renamed from: a */
    private SharedPreferences f37734a;

    private C14372n() {
    }

    /* renamed from: a */
    public static C14372n m57851a() {
        if (f37733b == null) {
            synchronized (C14372n.class) {
                if (f37733b == null) {
                    f37733b = new C14372n();
                }
            }
        }
        return f37733b;
    }

    /* renamed from: a */
    private void m57852a(Context context) {
        if (this.f37734a == null) {
            this.f37734a = context.getSharedPreferences("sp_gecko", 0);
        }
    }

    /* renamed from: b */
    public String mo52490b(Context context, String str, String str2) {
        m57852a(context);
        return this.f37734a.getString(str, str2);
    }

    /* renamed from: a */
    public void mo52489a(Context context, String str, String str2) {
        m57852a(context);
        this.f37734a.edit().putString(str, str2).apply();
    }
}
