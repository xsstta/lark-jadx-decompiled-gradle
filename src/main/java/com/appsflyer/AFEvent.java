package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class AFEvent {
    public boolean encrypt = true;
    public Map<String, Object> params;

    /* renamed from: ı */
    WeakReference<Context> f6696;

    /* renamed from: Ɩ */
    String f6697;

    /* renamed from: ǃ */
    AppsFlyerTrackingRequestListener f6698;

    /* renamed from: ɨ */
    String f6699;

    /* renamed from: ɩ */
    Context f6700;

    /* renamed from: ɪ */
    boolean f6701;

    /* renamed from: ɹ */
    public String f6702;

    /* renamed from: ɾ */
    public int f6703;

    /* renamed from: Ι */
    Map<String, Object> f6704;

    /* renamed from: ι */
    public Intent f6705;

    /* renamed from: І */
    public String f6706;

    /* renamed from: і */
    public String f6707;

    /* renamed from: Ӏ */
    String f6708;

    /* renamed from: ӏ */
    private byte[] f6709;

    public Intent intent() {
        return this.f6705;
    }

    public boolean isEncrypt() {
        return this.encrypt;
    }

    public String key() {
        return this.f6702;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ǃ */
    public final byte[] mo9887() {
        return this.f6709;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ι */
    public final boolean mo9888() {
        return this.f6701;
    }

    public String urlString() {
        return this.f6699;
    }

    public AFEvent weakContext() {
        this.f6696 = new WeakReference<>(this.f6700);
        this.f6700 = null;
        return this;
    }

    public Context context() {
        Context context = this.f6700;
        if (context != null) {
            return context;
        }
        WeakReference<Context> weakReference = this.f6696;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ı */
    public final AFEvent mo9886() {
        if (context() != null) {
            this.f6700 = context().getApplicationContext();
        }
        return this;
    }

    public AFEvent cacheKey(String str) {
        this.f6697 = str;
        return this;
    }

    public AFEvent context(Context context) {
        this.f6700 = context;
        return this;
    }

    public AFEvent params(Map<String, ?> map) {
        this.params = map;
        return this;
    }

    public AFEvent post(byte[] bArr) {
        this.f6709 = bArr;
        return this;
    }

    public AFEvent urlString(String str) {
        this.f6699 = str;
        return this;
    }
}
