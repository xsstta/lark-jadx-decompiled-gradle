package com.bytedance.dr;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.dr.b */
public final class C3998b {

    /* renamed from: a */
    private static AbstractC3997a<String> f12150a = new AbstractC3997a<String>() {
        /* class com.bytedance.dr.C3998b.C39991 */

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public String mo15706a(Object... objArr) {
            SharedPreferences sharedPreferences = (SharedPreferences) objArr[0];
            String string = sharedPreferences.getString("cdid", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String uuid = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("cdid", uuid).apply();
            return uuid;
        }
    };

    /* renamed from: a */
    static String m16648a(SharedPreferences sharedPreferences) {
        return f12150a.mo15707b(sharedPreferences);
    }
}
