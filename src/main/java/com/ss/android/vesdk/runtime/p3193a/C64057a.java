package com.ss.android.vesdk.runtime.p3193a;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.ss.android.vesdk.runtime.a.a */
public class C64057a {

    /* renamed from: a */
    private boolean f161751a;

    /* renamed from: b */
    private SharedPreferences f161752b;

    /* renamed from: c */
    private SharedPreferences.Editor f161753c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vesdk.runtime.a.a$a */
    public enum EnumC64059a {
        INSTANCE;
        
        private C64057a mInstance = new C64057a();

        public C64057a getInstance() {
            return this.mInstance;
        }

        private EnumC64059a() {
        }
    }

    private C64057a() {
    }

    /* renamed from: a */
    public static C64057a m251415a() {
        return EnumC64059a.INSTANCE.getInstance();
    }

    /* renamed from: b */
    private synchronized void m251416b() {
        if (this.f161753c == null) {
            this.f161753c = this.f161752b.edit();
        }
    }

    /* renamed from: a */
    public void mo221795a(Context context) {
        synchronized (this) {
            if (!this.f161751a) {
                this.f161752b = context.getSharedPreferences(context.getPackageName(), 0);
                this.f161751a = true;
            }
        }
    }

    /* renamed from: a */
    public void mo221796a(String str, Object obj) {
        mo221797a(str, obj, false);
    }

    /* renamed from: b */
    public <T> T mo221798b(String str, T t) {
        return t instanceof String ? (T) this.f161752b.getString(str, t) : t instanceof Integer ? (T) Integer.valueOf(this.f161752b.getInt(str, t.intValue())) : t instanceof Boolean ? (T) Boolean.valueOf(this.f161752b.getBoolean(str, t.booleanValue())) : t instanceof Float ? (T) Float.valueOf(this.f161752b.getFloat(str, t.floatValue())) : t instanceof Long ? (T) Long.valueOf(this.f161752b.getLong(str, t.longValue())) : (T) this.f161752b.getString(str, null);
    }

    /* renamed from: a */
    public void mo221797a(String str, Object obj, boolean z) {
        m251416b();
        if (obj instanceof String) {
            this.f161753c.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f161753c.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f161753c.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f161753c.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f161753c.putLong(str, ((Long) obj).longValue());
        } else {
            this.f161753c.putString(str, obj.toString());
        }
        if (z) {
            this.f161753c.apply();
        } else {
            this.f161753c.commit();
        }
    }
}
