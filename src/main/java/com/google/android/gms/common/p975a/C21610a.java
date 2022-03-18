package com.google.android.gms.common.p975a;

import android.util.Log;
import com.google.android.gms.common.internal.C21750i;
import java.util.Locale;

/* renamed from: com.google.android.gms.common.a.a */
public class C21610a {

    /* renamed from: a */
    private final String f52553a;

    /* renamed from: b */
    private final String f52554b;

    /* renamed from: c */
    private final C21750i f52555c;

    /* renamed from: d */
    private final int f52556d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21610a(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L_0x0006
            java.lang.String r8 = ""
            goto L_0x0036
        L_0x0006:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r8.length
            r2 = 0
        L_0x0012:
            if (r2 >= r1) goto L_0x0028
            r3 = r8[r2]
            int r4 = r0.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0022
            java.lang.String r4 = ","
            r0.append(r4)
        L_0x0022:
            r0.append(r3)
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0028:
            r8 = 93
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L_0x0036:
            r6.<init>(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.p975a.C21610a.<init>(java.lang.String, java.lang.String[]):void");
    }

    private C21610a(String str, String str2) {
        this.f52554b = str2;
        this.f52553a = str;
        this.f52555c = new C21750i(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f52553a, i)) {
            i++;
        }
        this.f52556d = i;
    }

    /* renamed from: a */
    public boolean mo73186a(int i) {
        return this.f52556d <= i;
    }

    /* renamed from: a */
    public void mo73185a(String str, Object... objArr) {
        if (mo73186a(3)) {
            Log.d(this.f52553a, m78240c(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo73187b(String str, Object... objArr) {
        Log.e(this.f52553a, m78240c(str, objArr));
    }

    /* renamed from: c */
    private final String m78240c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f52554b.concat(str);
    }
}
