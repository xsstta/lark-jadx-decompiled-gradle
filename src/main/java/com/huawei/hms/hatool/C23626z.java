package com.huawei.hms.hatool;

import android.util.Log;

/* renamed from: com.huawei.hms.hatool.z */
public class C23626z {

    /* renamed from: a */
    public boolean f58352a = false;

    /* renamed from: b */
    public int f58353b = 4;

    /* renamed from: a */
    public static String m85995a() {
        return "HiAnalyticsSDK_2.2.0.308" + i1.m85759a();
    }

    /* renamed from: a */
    public void mo83196a(int i) {
        Log.i("HiAnalyticsSDK", '\n' + "=======================================\n " + m85995a() + "" + "\n=======================================");
        this.f58353b = i;
        this.f58352a = true;
    }

    /* renamed from: a */
    public void mo83197a(int i, String str, String str2) {
        if (i == 3) {
            Log.d(str, str2);
        } else if (i == 5) {
            Log.w(str, str2);
        } else if (i != 6) {
            Log.i(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    /* renamed from: b */
    public void mo83198b(int i, String str, String str2) {
        mo83197a(i, "HiAnalyticsSDK", str + "=> " + str2);
    }

    /* renamed from: b */
    public boolean mo83199b(int i) {
        return this.f58352a && i >= this.f58353b;
    }
}
