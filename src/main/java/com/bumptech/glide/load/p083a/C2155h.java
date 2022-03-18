package com.bumptech.glide.load.p083a;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.a.h */
public class C2155h extends AbstractC2145b<ParcelFileDescriptor> {
    @Override // com.bumptech.glide.load.p083a.AbstractC2147d
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo10481a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10496a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    public C2155h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ParcelFileDescriptor mo10495a(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
