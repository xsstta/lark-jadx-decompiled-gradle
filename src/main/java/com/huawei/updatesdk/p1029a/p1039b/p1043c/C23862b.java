package com.huawei.updatesdk.p1029a.p1039b.p1043c;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.huawei.updatesdk.a.b.c.b */
public final class C23862b {

    /* renamed from: a */
    private Intent f59091a;

    private C23862b(Intent intent) {
        this.f59091a = intent;
    }

    /* renamed from: a */
    public static C23862b m87240a(Intent intent) {
        return new C23862b(intent);
    }

    /* renamed from: a */
    public int mo85602a(String str, int i) {
        if (mo85609d()) {
            try {
                return this.f59091a.getIntExtra(str, i);
            } catch (Exception unused) {
                Log.e("SecureIntent", "getIntExtra exception!");
            }
        }
        return i;
    }

    /* renamed from: a */
    public String mo85603a() {
        String action;
        return (!mo85609d() || (action = this.f59091a.getAction()) == null) ? "" : action;
    }

    /* renamed from: a */
    public String mo85604a(String str) {
        if (!mo85609d()) {
            return "";
        }
        try {
            return this.f59091a.getStringExtra(str);
        } catch (Exception unused) {
            Log.e("SecureIntent", "getStringExtra exception!");
            return "";
        }
    }

    /* renamed from: a */
    public boolean mo85605a(String str, boolean z) {
        if (mo85609d()) {
            try {
                return this.f59091a.getBooleanExtra(str, z);
            } catch (Exception unused) {
                Log.e("SecureIntent", "getBooleanExtra exception!");
            }
        }
        return z;
    }

    /* renamed from: b */
    public long mo85606b(String str, int i) {
        if (mo85609d()) {
            try {
                return this.f59091a.getLongExtra(str, (long) i);
            } catch (Exception unused) {
                Log.e("SecureIntent", "getIntExtra exception!");
            }
        }
        return (long) i;
    }

    /* renamed from: b */
    public Bundle mo85607b() {
        if (mo85609d()) {
            return this.f59091a.getExtras();
        }
        return null;
    }

    /* renamed from: c */
    public Intent mo85608c() {
        return this.f59091a;
    }

    /* renamed from: d */
    public boolean mo85609d() {
        return this.f59091a != null;
    }
}
