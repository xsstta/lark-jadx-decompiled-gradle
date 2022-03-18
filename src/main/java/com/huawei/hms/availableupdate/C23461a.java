package com.huawei.hms.availableupdate;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.huawei.hms.availableupdate.a */
public class C23461a {

    /* renamed from: a */
    public String f57866a;

    /* renamed from: b */
    public int f57867b;

    /* renamed from: c */
    public String f57868c;

    /* renamed from: d */
    public int f57869d;

    /* renamed from: a */
    public int mo82100a() {
        return this.f57869d;
    }

    /* renamed from: b */
    public int mo82104b() {
        return this.f57867b;
    }

    /* renamed from: a */
    public void mo82102a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0);
        this.f57866a = sharedPreferences.getString("mUri", "");
        this.f57867b = sharedPreferences.getInt("mSize", 0);
        this.f57868c = sharedPreferences.getString("mHash", "");
        this.f57869d = sharedPreferences.getInt("mReceived", 0);
    }

    /* renamed from: b */
    public final void mo82105b(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0).edit();
        edit.putString("mUri", this.f57866a);
        edit.putInt("mSize", this.f57867b);
        edit.putString("mHash", this.f57868c);
        edit.putInt("mReceived", this.f57869d);
        edit.commit();
    }

    /* renamed from: a */
    public void mo82101a(Context context, int i, String str) {
        this.f57869d = i;
        mo82105b(context, str);
    }

    /* renamed from: a */
    public void mo82103a(String str, int i, String str2) {
        this.f57866a = str;
        this.f57867b = i;
        this.f57868c = str2;
        this.f57869d = 0;
    }

    /* renamed from: b */
    public boolean mo82106b(String str, int i, String str2) {
        String str3;
        String str4;
        if (str == null || str2 == null || (str3 = this.f57866a) == null || !str3.equals(str) || this.f57867b != i || (str4 = this.f57868c) == null || !str4.equals(str2) || this.f57869d > this.f57867b) {
            return false;
        }
        return true;
    }
}
