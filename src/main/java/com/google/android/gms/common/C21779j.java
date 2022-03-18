package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.C21804a;
import com.google.android.gms.common.util.C21811e;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* access modifiers changed from: package-private */
@CheckReturnValue
/* renamed from: com.google.android.gms.common.j */
public class C21779j {

    /* renamed from: b */
    private static final C21779j f53118b = new C21779j(true, null, null);

    /* renamed from: a */
    final boolean f53119a;

    /* renamed from: c */
    private final String f53120c;

    /* renamed from: d */
    private final Throwable f53121d;

    C21779j(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f53119a = z;
        this.f53120c = str;
        this.f53121d = th;
    }

    /* renamed from: a */
    static C21779j m79021a() {
        return f53118b;
    }

    /* renamed from: a */
    static C21779j m79024a(Callable<String> callable) {
        return new C21781l(callable);
    }

    /* renamed from: a */
    static C21779j m79022a(String str) {
        return new C21779j(false, str, null);
    }

    /* renamed from: a */
    static C21779j m79023a(String str, Throwable th) {
        return new C21779j(false, str, th);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public String mo73762b() {
        return this.f53120c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo73763c() {
        if (!this.f53119a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f53121d != null) {
                Log.d("GoogleCertificatesRslt", mo73762b(), this.f53121d);
            } else {
                Log.d("GoogleCertificatesRslt", mo73762b());
            }
        }
    }

    /* renamed from: a */
    static String m79025a(String str, zze zze, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", z2 ? "debug cert rejected" : "not whitelisted", str, C21811e.m79088a(C21804a.m79075a("SHA-1").digest(zze.getBytes())), Boolean.valueOf(z), "12451009.false");
    }
}
