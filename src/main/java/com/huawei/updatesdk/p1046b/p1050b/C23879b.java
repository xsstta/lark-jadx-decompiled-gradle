package com.huawei.updatesdk.p1046b.p1050b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;

/* renamed from: com.huawei.updatesdk.b.b.b */
public class C23879b {

    /* renamed from: a */
    private SharedPreferences f59125a;

    private C23879b(SharedPreferences sharedPreferences) {
        this.f59125a = sharedPreferences;
    }

    /* renamed from: a */
    public static C23879b m87321a(String str, Context context) {
        SharedPreferences sharedPreferences;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                context = context.createDeviceProtectedStorageContext();
            }
            sharedPreferences = context.getSharedPreferences(str, 0);
        } catch (Exception unused) {
            C23834a.m87118b("SharedPreferencesWrapper", "getSharedPreference error");
            sharedPreferences = null;
        }
        return new C23879b(sharedPreferences);
    }

    /* renamed from: a */
    public long mo85671a(String str, long j) {
        try {
            return this.f59125a.getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    /* renamed from: a */
    public String mo85672a(String str, String str2) {
        try {
            return this.f59125a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: b */
    public void mo85673b(String str, long j) {
        try {
            SharedPreferences.Editor edit = this.f59125a.edit();
            edit.putLong(str, j);
            edit.commit();
        } catch (Exception e) {
            C23834a.m87117a("SharedPreferencesWrapper", "putLong error!!key:" + str, e);
        }
    }

    /* renamed from: b */
    public void mo85674b(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.f59125a.edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Exception e) {
            C23834a.m87117a("SharedPreferencesWrapper", "putString error!!key:" + str, e);
        }
    }
}
