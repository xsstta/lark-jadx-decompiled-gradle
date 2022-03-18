package com.bumptech.glide.load.p083a;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.a.b */
public abstract class AbstractC2145b<T> implements AbstractC2147d<T> {

    /* renamed from: a */
    private final String f7441a;

    /* renamed from: b */
    private final AssetManager f7442b;

    /* renamed from: c */
    private T f7443c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo10495a(AssetManager assetManager, String str) throws IOException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10496a(T t) throws IOException;

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: c */
    public void mo10490c() {
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: d */
    public DataSource mo10491d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: b */
    public void mo10489b() {
        T t = this.f7443c;
        if (t != null) {
            try {
                mo10496a(t);
            } catch (IOException unused) {
            }
        }
    }

    public AbstractC2145b(AssetManager assetManager, String str) {
        this.f7442b = assetManager;
        this.f7441a = str;
    }

    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super T> aVar) {
        try {
            T a = mo10495a(this.f7442b, this.f7441a);
            this.f7443c = a;
            aVar.mo10503a((Object) a);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.mo10502a((Exception) e);
        }
    }
}
