package androidx.navigation;

import android.os.Bundle;

/* renamed from: androidx.navigation.d */
public final class C1247d {

    /* renamed from: a */
    private final int f4488a;

    /* renamed from: b */
    private C1275p f4489b;

    /* renamed from: c */
    private Bundle f4490c;

    /* renamed from: a */
    public int mo6284a() {
        return this.f4488a;
    }

    /* renamed from: b */
    public C1275p mo6287b() {
        return this.f4489b;
    }

    /* renamed from: c */
    public Bundle mo6288c() {
        return this.f4490c;
    }

    public C1247d(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public void mo6285a(Bundle bundle) {
        this.f4490c = bundle;
    }

    /* renamed from: a */
    public void mo6286a(C1275p pVar) {
        this.f4489b = pVar;
    }

    public C1247d(int i, C1275p pVar) {
        this(i, pVar, null);
    }

    public C1247d(int i, C1275p pVar, Bundle bundle) {
        this.f4488a = i;
        this.f4489b = pVar;
        this.f4490c = bundle;
    }
}
