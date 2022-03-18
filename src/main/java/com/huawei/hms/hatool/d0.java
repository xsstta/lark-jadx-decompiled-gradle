package com.huawei.hms.hatool;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.secure.android.common.p1021a.p1024c.p1025a.C23807a;
import com.huawei.secure.android.common.p1021a.p1026d.C23808a;

public class d0 {

    /* renamed from: c */
    public static d0 f58188c;

    /* renamed from: a */
    public String f58189a;

    /* renamed from: b */
    public String f58190b;

    /* renamed from: f */
    public static d0 m85666f() {
        if (f58188c == null) {
            m85667g();
        }
        return f58188c;
    }

    /* renamed from: g */
    public static synchronized void m85667g() {
        synchronized (d0.class) {
            if (f58188c == null) {
                f58188c = new d0();
            }
        }
    }

    /* renamed from: a */
    public String mo82981a() {
        if (TextUtils.isEmpty(this.f58189a)) {
            this.f58189a = mo82985c();
        }
        return this.f58189a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (mo82988e() != false) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo82982a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2.mo82988e()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "analytics_keystore"
            java.lang.String r0 = com.huawei.secure.android.common.p1021a.p1024c.p1025a.C23807a.m87015b(r0, r3)
            goto L_0x000f
        L_0x000d:
            java.lang.String r0 = ""
        L_0x000f:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x004f
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "deCrypt work key first"
            com.huawei.hms.hatool.C23625y.m85977c(r0, r1)
            java.lang.String r0 = r2.mo82987d()
            java.lang.String r0 = com.huawei.hms.hatool.C23599d.m85664a(r3, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0041
            r3 = 16
            java.lang.String r0 = com.huawei.secure.android.common.p1021a.p1026d.C23808a.m87019b(r3)
            java.lang.String r3 = r2.mo82983b(r0)
            r2.mo82986c(r3)
            boolean r3 = r2.mo82988e()
            if (r3 == 0) goto L_0x004f
        L_0x003d:
            com.huawei.hms.hatool.c0.m85647d()
            goto L_0x004f
        L_0x0041:
            boolean r3 = r2.mo82988e()
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = r2.mo82983b(r0)
            r2.mo82986c(r3)
            goto L_0x003d
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.d0.mo82982a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public final String mo82983b(String str) {
        return mo82988e() ? C23807a.m87011a("analytics_keystore", str) : C23599d.m85665b(str, mo82987d());
    }

    /* renamed from: b */
    public void mo82984b() {
        String b = C23808a.m87019b(16);
        if (mo82986c(mo82983b(b))) {
            this.f58189a = b;
        }
    }

    /* renamed from: c */
    public final String mo82985c() {
        String a = g0.m85719a(AbstractC23596b.m85619f(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(a)) {
            return mo82982a(a);
        }
        String b = C23808a.m87019b(16);
        mo82986c(mo82983b(b));
        return b;
    }

    /* renamed from: c */
    public final boolean mo82986c(String str) {
        C23625y.m85977c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            C23625y.m85977c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        g0.m85724b(AbstractC23596b.m85619f(), "Privacy_MY", "PrivacyData", str);
        g0.m85723b(AbstractC23596b.m85619f(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    /* renamed from: d */
    public final String mo82987d() {
        if (TextUtils.isEmpty(this.f58190b)) {
            this.f58190b = new c0().mo82966a();
        }
        return this.f58190b;
    }

    /* renamed from: e */
    public final boolean mo82988e() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
