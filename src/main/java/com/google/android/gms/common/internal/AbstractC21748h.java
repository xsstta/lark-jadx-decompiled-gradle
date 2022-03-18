package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class AbstractC21748h {

    /* renamed from: a */
    private static final Object f53084a = new Object();

    /* renamed from: b */
    private static AbstractC21748h f53085b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo73665a(C21749a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo73666b(C21749a aVar, ServiceConnection serviceConnection, String str);

    /* renamed from: a */
    public static AbstractC21748h m78990a(Context context) {
        synchronized (f53084a) {
            if (f53085b == null) {
                f53085b = new C21733ad(context.getApplicationContext());
            }
        }
        return f53085b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.h$a */
    public static final class C21749a {

        /* renamed from: a */
        private final String f53086a;

        /* renamed from: b */
        private final String f53087b;

        /* renamed from: c */
        private final ComponentName f53088c = null;

        /* renamed from: d */
        private final int f53089d;

        public C21749a(String str, String str2, int i) {
            this.f53086a = Preconditions.checkNotEmpty(str);
            this.f53087b = Preconditions.checkNotEmpty(str2);
            this.f53089d = i;
        }

        public final String toString() {
            String str = this.f53086a;
            return str == null ? this.f53088c.flattenToString() : str;
        }

        /* renamed from: a */
        public final String mo73718a() {
            return this.f53087b;
        }

        /* renamed from: b */
        public final ComponentName mo73719b() {
            return this.f53088c;
        }

        /* renamed from: c */
        public final int mo73720c() {
            return this.f53089d;
        }

        /* renamed from: a */
        public final Intent mo73717a(Context context) {
            if (this.f53086a != null) {
                return new Intent(this.f53086a).setPackage(this.f53087b);
            }
            return new Intent().setComponent(this.f53088c);
        }

        public final int hashCode() {
            return Objects.hashCode(this.f53086a, this.f53087b, this.f53088c, Integer.valueOf(this.f53089d));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C21749a)) {
                return false;
            }
            C21749a aVar = (C21749a) obj;
            return Objects.equal(this.f53086a, aVar.f53086a) && Objects.equal(this.f53087b, aVar.f53087b) && Objects.equal(this.f53088c, aVar.f53088c) && this.f53089d == aVar.f53089d;
        }
    }

    /* renamed from: a */
    public final void mo73716a(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo73666b(new C21749a(str, str2, i), serviceConnection, str3);
    }
}
