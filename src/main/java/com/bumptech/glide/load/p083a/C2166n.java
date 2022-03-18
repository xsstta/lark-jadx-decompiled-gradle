package com.bumptech.glide.load.p083a;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.n */
public class C2166n extends AbstractC2145b<InputStream> {
    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public Class<InputStream> mo10481a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10496a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    public C2166n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public InputStream mo10495a(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
